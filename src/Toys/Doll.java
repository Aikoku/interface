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
public class Doll extends Role implements ForGirl{

    static {
        classification="Doll";
    }
    
    public Doll(String name, int price) {
        super(name, price);
    }
    
   public String girl(){
        return "for little girls";
    }

    @Override
    public String toString() {
        return this.girl()+"Doll{" +super.toString()+'}';
    } 
    
    
}
