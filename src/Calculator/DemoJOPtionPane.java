///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package Calculator;
//
//import java.awt.event.ActionListener;
//import javax.swing.Box;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import javax.swing.border.EmptyBorder;
//
///**
// *
// * @author Mark
// */
//class DemoJOPtionPane extends JFrame implements ActionListener{
//    
//}
//
//class LoginWindow extends JFrame implements ActionListener{
//    JTextField logidField;
//    JPasswordField passwordField;
//    JButton cancel,ok;
//    
//    
//    public static void main(String[] args) {
//        JFrame frame = new LoginWindow(){
//            frame.setVisible(true);
//            frame.setResizable(false);
//        }
//    }
//    
//    LoginWindow(){
//        super("Вход в систему");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        
//        //Настройка первой горизонтальной понели
//        Box box1 = Box.createHorizontalBox();
//        JLabel loginLabel = new JLabel("Login");
//        logidField = new JTextField(15);
//        box1.add(loginLabel);
//        box1.add(Box.createHorizontalStrut(6));
//        box1.add(logidField);
//        
//        //Настройка второй горизонтальной понели
//        Box box2=Box.createHorizontalBox();
//        JLabel passwordLabel = new JLabel("Password");
//        passwordField=new JPasswordField(15);
//        box2.add(passwordLabel);
//        box2.add(Box.createHorizontalStrut(6));
//        box2.add(passwordField);
//        
//        //Настройка третей горизонтальной понели
//        Box box3=Box.createHorizontalBox();
//        JButton ok=new JButton("OK");
//        ok.addActionListener(this);
//        JButton cancel = new JButton("Cancel");
//        cancel.addActionListener(this);
//        
//        box3.add(Box.createHorizontalGlue());
//        box3.add(ok);
//        box3.add(Box.createHorizontalStrut(12));
//        box3.add(cancel);
//        
//        //Уточняем размеры компонентов
//        loginLabel.setPreferredSize(passwordLabel.getPreferredSize());
//        //Размещяем три горизонталной панели на одной вертикальной
//        Box mainBox = Box.createVerticalBox();
//        mainBox.setBorder(new EmptyBorder(12,12,12,12));
//        mainBox.add(box1);
//        mainBox.add(Box.createVerticalStrut(12));
//        mainBox.add(box2);
//        mainBox.add(Box.createVerticalStrut(17));
//        mainBox.add(box3);
//        setContentPane(mainBox);
//        pack();
//    }
//    
//    public void actionPerformed(ActionListener event){
//        if(event.getActionCommand().equalsIgnoreCase("OK")){
//            if(loginField.getText().equals("123456")){
//                JOptrionPane.showMessageDialog(null,"VHOD VIPOLNEN");
//            }else{
//                JOptionPane.showConfirmDialog(null, "VHOD NE VIPOLNEN");
//            }
//        }else if(event.getActionCommand().equalsIgnoreCase("Close")){
//            
//        }
//    }
//    
//}
