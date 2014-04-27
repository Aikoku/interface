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
//public class RabStudent extends UspehStudent implements ZarPlata{
//    protected int inCome = 300;
//
//    public RabStudent(String name, int stipendia) {
//        super(name, stipendia);
//    }
//    
//    public int raschet_zarplat(){
//        int zarplat=0;
//        return zarplat;
//    }
//    
//    public String uroven_dohodnosi(){
//        return "DOHOD "+stipendia;
//    }
//
//    @Override
//    public String toString() {
//        return "RabStudent{"+super.toString() + "inCome=" + inCome + '}';
//    }
//}
public class RabotajushijStudent extends UspeshnijStudent implements ZarobotnajaPlata {
    
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
