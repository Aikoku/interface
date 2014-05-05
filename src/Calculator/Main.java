/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculator;


import javax.swing.*;

/**
 *
 * @author vmisutov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SimpleWindow myWindow = new  SimpleWindow();
       myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myWindow.setSize(400, 300);
       myWindow.setVisible(true);
    }
             
    }
