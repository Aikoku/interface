/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package People;

/**
 *
 * @author Mark
 */
class Chelovek {
    protected String name;

    public Chelovek(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chelovek{" + "name=" + name + '}';
    }
    
    
}

class Rabotnik extends Chelovek implements Dohodnost,ZarobotnajaPlata{
    protected int summarnijDohod;

    public Rabotnik(String name, int summarnijDohod) {
        super(name);
        this.summarnijDohod = summarnijDohod;
    }
    
}

class Student extends Chelovek{
    
}

class UspeshnijStudent extends Student implements Dohodnost{
    
}

class RabotajushijStudent extends UspeshnijStudent implements ZarobotnajaPlata{
    
}

