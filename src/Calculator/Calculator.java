/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculator;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author PowerStation
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new CalcWindow();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.setVisible(true);
       frame.setResizable(false);
         
       
    }
}
class CalcWindow extends JFrame implements ActionListener{
    double currentResult;
    char selectedAction;
    JTextField textField;
    
    
    CalcWindow(){
        textField = new JTextField("0",12);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(4,3,5,5));
        String buttonOrderNumbers = "7894561230.=";
        for(int index = 0; index < buttonOrderNumbers.length(); index++){
            String key = buttonOrderNumbers.substring(index, index + 1);
            JButton button = new JButton(key);
            button.addActionListener(this);
            numberPanel.add(button);
         }
        
        JPanel signsPanel = new JPanel();
        signsPanel.setLayout(new GridLayout(4,1,5,5));
        String buttonOrderSigns = "/*-+";
        for(int index = 0; index < buttonOrderSigns.length();index++){
            String key = buttonOrderSigns.substring(index,index+1);
            JButton button = new JButton(key);
            button.addActionListener(this);
            signsPanel.add(button);
        }
        
        JButton buttonClear = new JButton("Clear");
        buttonClear.addActionListener(new ActionListener(){
      
            public void actionPerformed(ActionEvent e){
                textField.setText("0");
                currentResult = 0; //?
            }
        });
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(textField, BorderLayout.NORTH);
        mainPanel.add(numberPanel, BorderLayout.WEST);
        mainPanel.add(signsPanel, BorderLayout.EAST);
        mainPanel.add(buttonClear, BorderLayout.SOUTH);
        
        setContentPane(mainPanel);
        pack();
        
    }
    
    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        
        switch(str.charAt(0)){
            case '-':
            case '+':
                case'/':
                case '*':
                    selectedAction = str.charAt(0);
                    currentResult = Double.parseDouble(textField.getText());
                    textField.setText("0");
                    
                    break;
                case '=':
                    
                    double temp = Double.parseDouble(textField.getText());
                    if(selectedAction == '+'){
                        currentResult += temp;
                    }
                    if(selectedAction == '-'){
                        currentResult -= temp;
                    }
                    if (selectedAction == '/'){
                        currentResult /= temp;
                    }
                    if(selectedAction == '*'){
                        currentResult *= temp;
                    }
                    textField.setText("" + currentResult);
                    break;
                default:
                    if(textField.getText().charAt(0)=='0'){
                        textField.setText(str);
                    }else{
                        textField.setText(textField.getText()+str);
                        
                    }
                    
    }
    }
}

