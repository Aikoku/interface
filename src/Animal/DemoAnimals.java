/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Mark
 */
public class DemoAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // o mean OUT - DVOROVAJA
        DvorovCat oCat = new DvorovCat("Пушек", 50);
        Pers cat = new Pers("Клео", 160);
        Guppi fish1 = new Guppi("Гуппи", 3);
        Guppi fish2 = new Guppi("Гуппи", 4);
        Guppi fish3 = new Guppi("Гуппи", 3);
        Pirania oFish = new Pirania("Пирания", 70);
        DvorovDog oDog = new DvorovDog("Шарик", 100);
        Serbernar dog1 = new Serbernar("Жучка", 400);
        Serbernar dog2 = new Serbernar("Baby", 30);
        Popugai bird = new Popugai("Пэги", 30);
        Sinitsa oBird = new Sinitsa("Nameless", 70);

        Animals[] animals = {oCat, cat, fish1, fish2, fish3, oFish,
            oDog, dog1, dog2, bird, oBird};
        //Вывод на экран
        for (Animals a : animals) {
            System.out.println(a);
        }

        System.out.println("\nВыводим на экран хищников");
        for (Animals a : animals) {
            if (a instanceof Xishn) {
                System.out.println(a);
            }
        }

        System.out.println("\nВыводим на экран всех подающих голос");
        for (Animals a : animals) {
            if (a instanceof Voice) {
                System.out.println(a);
            }
        }

        System.out.println("\nВсе попродистые животные с ценой ниже 100 евро");
        for (Animals a : animals) {
            if ((a.price < 100) && (a instanceof Poroda)) {
                System.out.println(a);
            }
        }

        System.out.println("\nВсе Рыбы");
        for (Animals a : animals) {
            if (a instanceof Fish) {
                System.out.println(a);
            }
        }
    }

}
