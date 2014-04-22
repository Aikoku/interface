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
public class Sinitsa extends Birds {

    public Sinitsa(String name, int price) {
        super(name, price);
    }

    public Sinitsa() {
    }

    public String voice() {
        return "Voice: Под её чириканье вы будете засыпать и просыпаться ";
    }

}
