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
public class Pirania extends Fish implements Xishn{

    public Pirania(String name, int price) {
        super(name, price);
    }

    public Pirania() {
    }

    @Override
    public String toString() {
        return "Pirania{" +super.toString()+ '}';
    }
    

    public String xishn(){
        return " Кормить свежим мясом ";
    }
    
}
