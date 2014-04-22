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
public class DvorovCat extends Cats {

    public DvorovCat(String name, int price) {
        super(name, price);
    }

    public DvorovCat() {
    }

    @Override
    public String voice(){
        return "Voice: King of meow ";
    }
}
