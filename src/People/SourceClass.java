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
    
}

class Rabotnik extends Chelovek implements Dohodnost,ZarobotnajaPlata{
    
}

class Student extends Chelovek{
    
}

class UspeshnijStudent extends Student implements Dohodnost{
    
}

class RabotajushijStudent extends UspeshnijStudent implements ZarobotnajaPlata{
    
}

