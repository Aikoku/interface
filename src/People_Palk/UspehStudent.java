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
public class UspehStudent extends Student implements Dohod{
    protected int stipendia = 60;

    public UspehStudent(String name, int stipendia) {
        super(name);
        this.stipendia=stipendia;
    }
    
    public String uroven_dohodnosi(){
        return "DOHOD "+stipendia;
    }

    @Override
    public String toString() {
        return "UspehStudent{" +super.toString()+ "stipendia=" + uroven_dohodnosi() + '}';
    }
    
    
    
}
