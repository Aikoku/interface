/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Toys;

/**
 *
 * @author Mark
 */
public class Ball extends Sport implements ForBoy,ForGirl{
    int size;
    static{
        Ball.classification = "Ball";
    }

    public Ball(int size, String name, int price) {
        super(name, price);
        this.size = size;
    }
    
    public String boy(){
        return "for boys from 3 years";
    }
    public String girl(){
        return "for girls from 5 years";
    }

    @Override
    public String toString() {
        return this.girl()+" and "+boy()+ "Ball{" +super.toString()+ "size=" + size+'}';
    }
}
