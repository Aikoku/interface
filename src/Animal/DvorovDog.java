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
public class DvorovDog extends Dogs{

    public DvorovDog(String name, int price) {
        super(name, price);
    }

    public DvorovDog() {
    }

    public String voice(){
        return " Поет о жизни на раене ";
    }
    
    
}
