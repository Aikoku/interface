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
public class Fish extends Animals{

    public Fish(String name, int price) {
        super(name, price);
    }

    public Fish() {
    }

    @Override
    public String toString() {
        return "Fish{" +super.toString()+ '}';
    }

}
