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
public class Employer extends People implements Dohod,ZarPlata{
    protected int inCome;

    public Employer(int inCome, String name) {
        super(name);
        this.inCome = inCome;
    }
    
    public int raschet_zarplat(){
        int zarplat=0;
        return zarplat;
    }
    
    public String uroven_dohodnosi(){
//        if()
    }
    
    

    @Override
    public String toString() {
        return "Employer{" + "come=" + super.toString() +" === "+uroven_dohodnosi()+ '}';
    }
    
    
    
    
}
