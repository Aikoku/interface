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
public class Popugai extends Birds implements Poroda {

    public Popugai(String name, int price) {
        super(name, price);
    }

    public Popugai() {
    }

    @Override
    public String toString() {
        return "Popugai{" + super.toString() + '}';
    }

    public String poroda() {
        return " Волнистый попугай (импортный) ";
    }

    public String voice() {
        return " Знает в совершенстве Угорские языки ";
    }

}
