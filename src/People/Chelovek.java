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

class Rabotnik extends Chelovek implements Dohodnost, ZarobotnajaPlata {

    protected int summarnijDohod;

    public Rabotnik(String name, int summarnijDohod) {
        super(name);
        this.summarnijDohod = summarnijDohod;
    }

    public int raschitatZarobotanujuPlatu() {        
        summarnijDohod -= (summarnijDohod * TEKUSHAJA_STAVKA_NALOGA) / 100;
        return summarnijDohod;
    }

    public String urovenDohodnosti() {
        int dohod = raschitatZarobotanujuPlatu() - MINIMALNIJ_DOHOD;
        if (dohod < MINIMALNIJ_PEREVES) {
            return "[Низкий уровень дохода]";
        } else if (dohod > VISOKIJ_PEREVES) {
            return "[Высокий уровень дохода]";
        } else {
            return "[Средний уровень дохода]";
        }
    }

    @Override
    public String toString() {
        return urovenDohodnosti()+" Rabotnik{" +super.toString()+ "summarnijDohod=" + summarnijDohod + '}';
    }
}

class Student extends Chelovek {

    public Student(String name) {
        super(name);
    }
}



class UspeshnijStudent extends Student implements Dohodnost {
    protected int stipendija;

    public UspeshnijStudent(String name, int stipendija) {
        super(name);
        this.stipendija = stipendija;
    }

    public String urovenDohodnosti() {
        
        if (stipendija < MINIMALNIJ_PEREVES) {
            return "[Низкий уровень дохода]";
        } else if (stipendija > VISOKIJ_PEREVES) {
            return "[Высокий уровень дохода]";
        } else {
            return "[Средний уровень дохода]";
        }
    }

    @Override
    public String toString() {
        return urovenDohodnosti()+" Uspeshnij Student{" +super.toString()+ " stipedija= " + stipendija + '}';
    } 
}



class RabotajushijStudent extends UspeshnijStudent implements ZarobotnajaPlata {
    
    protected int zarobotanajaPlata;

    public RabotajushijStudent(String name, int zarobotanajaPlata, int stipendija) {
        super(name, stipendija);
        this.zarobotanajaPlata = zarobotanajaPlata;
    }   

    public int raschitatZarobotanujuPlatu() {        
        return zarobotanajaPlata -= (zarobotanajaPlata * TEKUSHAJA_STAVKA_NALOGA) / 100;
    }

    public String urovenDohodnosti() {
        int dohod = stipendija+raschitatZarobotanujuPlatu() - MINIMALNIJ_DOHOD;
        if (dohod < MINIMALNIJ_PEREVES) {
            return "[Низкий уровень дохода]";
        } else if (dohod > VISOKIJ_PEREVES) {
            return "[Высокий уровень дохода]";
        } else {
            return "[Средний уровень дохода]";
        }
    }
    @Override
    public String toString() {
        return urovenDohodnosti()+" Rabotajushij Student{" +super.toString()+ " zarobotnaja plata= " + zarobotanajaPlata + '}';
    } 
}
