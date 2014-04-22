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
public class Sport  extends Toy{
    protected static String classification = "Sport";
    
    public Sport(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Sport{" +super.toString()+ '}';
    }
    
    
    
}
