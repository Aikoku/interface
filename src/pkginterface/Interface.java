/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Mark
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SkippingRope sk = new SkippingRope(3, "Jump", 10);
        Dumbbells gan = new Dumbbells(16, "Strenght", 26);
        Ball b = new Ball(11, "BallRun", 17);
        Doll d1 = new Doll("Berty", 100);
        Doll d2 = new Doll("Jhon", 140);
        Car c = new Car("Bugati", 90000);
        Toy[] toys = {b, c, d1, d2, gan, sk};
        System.out.println("Price more than 50");
        for (Toy t : toys) {
            if (t.price > 50) {
                System.out.println("" + t);
            }
        }

        System.out.println("All sport toys for BOYS");
        for (Toy t : toys) {
            if (t instanceof ForBoy && t instanceof Sport) {
                System.out.println("" + t);
            }
        }

        System.out.println("Most expensive toy for girl");
        int maxPrice = 0;
        int index = -1;
        for (int i = 0; i < toys.length; i++) {
            Toy t = toys[i];
            if (t instanceof ForGirl) {
                if (t.price > maxPrice) {
                    maxPrice = t.price;
                    index = i;
                }
            }
        }
        if(index!=-1)System.out.println(toys[index]);
        else System.out.println("Игрушек нет в наличии");
    }

}
