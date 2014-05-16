package Sort;

public class madmax {

    public static int[] fillRandomInt(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) randomInt(min, max);
        }
        return array;
    }   //Randomizator Marka

    public static int randomInt(int min, int max) {
        int k = max - min;
        int random = (int) (min + Math.random() * (k + 1));
        return random;
    }   // Randomizator Marka

    public static void shellivse(int[] array) {
        int i, j, k, h, m = 0, b = array.length;

        int[] arr = {1, 2147483647};
        while (arr[m] < b) {
            ++m;
        }
        while (--m >= 0) {
            k = arr[m];
            for (i = k; i < b; i++) {
                j = i;
                h = array[i];
                while ((j >= k) && (array[j - k] > h)) {
                    array[j] = array[j - k];
                    j = j - k;
                }
                array[j] = h;
            }
        }
    }

    public static void prjamvybor(int[] numbers) {
        int min, temp;

        for (int index = 0; index < numbers.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min]) {
                    min = scan;
                }
            }

            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
    }

    public static void main(String[] args) {

        int madmax[] = fillRandomInt(500, 10, 100);
        long start;
        start = System.nanoTime();
        prjamvybor(madmax);
        System.out.println("Time = " + (System.nanoTime() - start));
        for (int i = 0; i < madmax.length; i++) {
            System.out.print(madmax[i] + " ");
        }
        System.out.println();

        int antimadmax[] = fillRandomInt(500, 10, 100);
        start = System.nanoTime();
        shellivse(antimadmax);
        System.out.println("Time = " + (System.nanoTime() - start));
        for (int i = 0; i < antimadmax.length; i++) {
            System.out.print(antimadmax[i] + " ");
        }

    }

}

вф
        вф
вф
в
фв
ф



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr14_02_14;

/**
 *
 * @author MarkNote
 */
public class kr14_02_14part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 10. Таблица футбольного чемпионата задана в виде двумерного массив из n строк и 
         n столбцов, в котором все элементы, принадлежавшие главной диагонали, 
         равны нулю, а каждый элемент, не принадлежащий главной диагонали, равен 3, 
         1 или 0 (числу очков, набранных в игре: 3 — выигрыш, 1 — ничья. 0 — 
         проигрыш). 
         б) Определить номера команд/прошедших чемпионат без поражений.  */
        int n = 3;
        int[][] array = new int[n][n];
        int[] randomArr = new int[]{0, 1, 3};
        int random;
        for (int i = 0; i < array.length; i++) {
            //в этом цикле присваеваем двумерному массиву рандомные значения 0,1,3
            for (int j = 0; j < array.length; j++) {
                random = randomArr[(int) (Math.random() * 3)];
                if (i == j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = random;
                }
            }
            boolean lose = false;
            //проходим по строкам и ищем команды которые только выигрывали
            for (int j = 0; j < array[i].length; j++) {
                int x;
                x = array[i][j];
                if ((x == 0) & !(i == j)) {
                    System.out.println("Команда с порядковым номером " + (i + 1) + " проигрывает.");
                    lose = true;
                    break;
                }
            }
            //команда которая не проиграла ниразу
            if (!lose) {
                System.out.println("Команда с порядковым номером " + (i+1)+" не проиграла ниразу.");
            }
        }
        show(array);
    }

    public static void show(int array[][]) {
        for (int line = 0; line < array.length; line++) {
            //Цикл по столбцам
            for (int column = 0; column < array[line].length; column++) {
                //нужные нам операции для array[line][column];
                System.out.print("\t" + array[line][column]);
            }
            System.out.println("");
        }
    }

}




