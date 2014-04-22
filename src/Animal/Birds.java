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
public class Birds extends Animals implements Voice {

    public Birds(String name, int price) {
        super(name, price);
    }

    public Birds() {
    }

    @Override
    public String toString() {
        return "Birds{" + super.toString() + "} "+voice();
    }

    public String voice() {
        return "Voice: Свистят, пикают, крякают, все могут.. ";
    }

}
