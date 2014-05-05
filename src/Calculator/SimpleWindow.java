/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculator;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author vmisutov
 */
 class SimpleWindow extends JFrame {
    SimpleWindow() {
        super("WRATHALATOR");
        
        JPanel windowContent = new JPanel();
        windowContent.setLayout(new GridLayout(2,3,5,10));
        
        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);
        JButton go = new JButton("Add");
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
      
        setContentPane(windowContent);
        
        
    }
}