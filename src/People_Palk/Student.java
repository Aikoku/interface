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
public class Student extends Chelovek {

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + '}';
    }
}
