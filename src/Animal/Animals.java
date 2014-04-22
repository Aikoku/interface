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
public class Animals {

    protected String name;
    protected int price;

    public Animals(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Animals() {
    }

    @Override
    public String toString() {
        return "Animals{" + "name=" + name + ", price=" + price + '}';
    }
}
