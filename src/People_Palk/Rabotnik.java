/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package People_Palk;

/**
 *
 * @author Mark
 */
//public class Employer extends People implements Dohod,ZarPlata{
//    protected int inCome;
//
//    public Employer(int inCome, String name) {
//        super(name);
//        this.inCome = inCome;
//    }
//    
//    public int raschet_zarplat(){
//        int zarplat=0;
//        return zarplat;
//    }
//    
//    public String uroven_dohodnosi(){
////        if()
//    }
//    
//    @Override
//    public String toString() {
//        return "Employer{" + "come=" + super.toString() +" === "+uroven_dohodnosi()+ '}';
//    }
//    
//}

public class Rabotnik extends Chelovek implements Dohodnost, ZarobotnajaPlata {

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
