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
public class Cats extends Animals implements Voice,Xishn{

    public Cats(String name, int price) {
        super(name, price);
    }

    public Cats() {
    }

    @Override
    public String toString() {
        return "Cats{" +super.toString()+ "}"+voice()+" "+xishn();
    }
    
    @Override
    public String voice(){
        return " ";
    }
    @Override
    public String xishn(){
        return " ";
    }
    
}
