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
public class Pers extends Cats implements Poroda{

    public Pers(String name, int price) {
        super(name, price);
    }

    public Pers() {
    }
    
    public String poroda(){
        return "Poroda: Персицкая ";
    }
    
    public String voice(){
        return "Voice: Мурлычет по персицки ";
    }

    @Override
    public String toString() {
        return "Pers{" +super.toString()+" poroda:"+poroda()+"}";
    }
    
}
