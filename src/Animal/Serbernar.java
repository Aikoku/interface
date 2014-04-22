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
public class Serbernar extends Dogs implements Poroda {

    public Serbernar(String name, int price) {
        super(name, price);
    }

    public Serbernar() {
    }

    public String poroda() {
        return "Poroda: Сербернар ";
    }

    public String voice() {
        return "Voice: Поет пошлые немецкие песенки ";
    }

    @Override
    public String toString() {
        return "Serbernar{" + super.toString() + '}';
    }

}
