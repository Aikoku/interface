/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errors;

import static java.lang.System.*;
import java.util.*;

/**
 *
 * @author Mark
 */
class finallyDemo {

    static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("Demo");
        } finally {
            System.out.println("finally block procA");
        }
    }

    static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("finally block procB");
        }
    }

    static void procC() {
        try {
            System.out.println("inside procC");

        } finally {
            System.out.println("finally block procC");
        }
    }

    static void compute(int a) throws IllegalArgumentException {
        System.out.println("Вызов метода (" + a + ")");
        if (a > 10) {
            throw new IllegalArgumentException("Illegal Argument for number Train");
        }
        System.out.println("Нормальное решение");
    }

    public static void main(String[] args) {
        /*
         try {
         procA();
         } catch (Exception e) {
         System.out.println("Исключение перехваченно");
         }
         procB();
         procC();

         try {
         compute(1);
         compute(20);
         } catch (IllegalArgumentException e) {
         System.out.println("Перехваченно " + e);
         }      
         */
        System.out.println("====================");
        Scanner consol = new Scanner(System.in);
        System.out.println("Введите последовательность чисел. \nДля окончательного ввода нажмите 0");
        int count = 0;
        int number = 6;
        do {
            try {
                consol.hasNextInt();
                number = consol.nextInt();
                count++;

            }catch(InputMismatchException e){
                String error = consol.next();
                System.out.println(error+" = Ошибка оргумента "+e);
            }
/*
            if (consol.hasNextInt()) {
                number = consol.nextInt();
                count++;
            } else {
                String error = consol.next();
            }*/
        } while (number != 0);
        System.out.println("Количество введеных целых чисел = " + (count - 1));
    }
}
