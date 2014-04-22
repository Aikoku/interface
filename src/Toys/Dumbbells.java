/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toys;

/**
 *
 * @author Mark
 */
public class Dumbbells extends Sport implements ForBoy {

    protected int netto;

    static {
        classification = "Dumbbells";
    }

    public Dumbbells(int netto, String name, int price) {
        super(name, price);
        this.netto = netto;
    }

    public String boy() {
        return "for real mens ";
    }

    @Override
    public String toString() {
        return this.boy() + "Dumbbells{" + super.toString() + "netto=" + netto + '}';
    }

}
