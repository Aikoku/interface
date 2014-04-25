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
public class RabStudent extends UspehStudent implements ZarPlata{
    protected int inCome = 300;

    public RabStudent(String name, int stipendia) {
        super(name, stipendia);
    }
    
    public int raschet_zarplat(){
        int zarplat=0;
        return zarplat;
    }
    
    public String uroven_dohodnosi(){
        return "DOHOD "+stipendia;
    }

    @Override
    public String toString() {
        return "RabStudent{"+super.toString() + "inCome=" + inCome + '}';
    }
    
    
}
