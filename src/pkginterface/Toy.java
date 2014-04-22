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
public class Toy {
    protected String name;
    protected int price;
    protected static String classification = "Toys";

    @Override
    public String toString() {
        return "Toy{classification="+classification+"name=" + name + ", price=" + price + '}';
    }

    

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    
    
}
