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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        UspeshnijStudent uStd1 = new UspeshnijStudent("Vasja", 30);
        UspeshnijStudent uStd2 = new UspeshnijStudent("Roman", 500);
        RabotajushijStudent rStd1 = new RabotajushijStudent("Dima", 670, 60);
        RabotajushijStudent rStd2 = new RabotajushijStudent("Anatolij", 320, 460);
        Rabotnik rab1 = new Rabotnik("Alexander", 1070);
        Rabotnik rab2 = new Rabotnik("Viktor", 640);
        Chelovek[] chelovek = {uStd1, uStd2, rStd1, rStd2, rab1, rab2};
try{
        System.out.println("Выводим всех на экран");
        for (Chelovek a : chelovek) {
            System.out.println(a);
        }

        System.out.println("Все кто получает зарплату");
        for (Chelovek a : chelovek) {
            if (a instanceof ZarobotnajaPlata) {
                System.out.println(a);
            }
        }

        System.out.println("Все студенты");
        for (Chelovek a : chelovek) {
            if (a instanceof Student) {
                System.out.println(a);
            }
        }

        System.out.println("Увеличиваем стипендию");
        int plusStipendija = 10;
        for (Chelovek a : chelovek) {
            if (a instanceof UspeshnijStudent) {
        //Очень не красивый способ, расскажите как взять 
        //переменную из удобным способом.
                UspeshnijStudent[] test = {(UspeshnijStudent) a};
                for (UspeshnijStudent te : test) {
                    te.stipendija += plusStipendija;
                    System.out.println("Plus = " + te);
                }
            }
        }
        System.out.println("Люди с фамилией на А");
        for (Chelovek a : chelovek) {
            if (a.name.charAt(0) == 'A') {
                System.out.println(a);
            }
        }
}catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Ошибка индекса массива "+e);
}catch(ArithmeticException e){
    System.out.println("Арифметическая ошибка "+e);
}
        

    }

}
