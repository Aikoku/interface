/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkginterface;

/**
 *
 * @author Mark
 */
public class SkippingRope extends Sport implements ForGirl{
    protected int length;
    
    static{
        classification = "SkippingRope";
    }

    public SkippingRope(int lengrh, String name, int price) {
        super(name, price);
        this.length = length;
    }
    
    public String girl(){
        return "for girlsfrom 7 years";
    }

    @Override
    public String toString() {
        return this.girl()+"SkippingRope{" +super.toString()+ "lengrh=" + length+'}';
    }
    
    
    
}
