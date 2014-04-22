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
public class Car extends Role implements ForBoy{

    static {
        classification = "Car";
    }

    public Car(String name, int price) {
        super(name, price);
    }

    public String boy() {
        return "For little boys";
    }

    @Override
    public String toString() {
        return this.boy() + "Car{" + super.toString() +'}';
    }

}
