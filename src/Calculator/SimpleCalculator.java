package Calculator;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author vmisutov
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sozdaem panel
        JPanel windowContent = new JPanel();
        // zadaem menedzhel otobrazenija dla etoj paneli
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);
        // sozdaem komponenty v pamjati 
        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);
        JButton go  = new JButton("Add");
        //dobavljaem komponenty na panel
        windowContent.add(label1);
        windowContent.add(field1);
         windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
        // sozdaem freim i zadaem dlja nego panel
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(windowContent);
        // zadaem i razmer i delaem frei vidimym
        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    
    

