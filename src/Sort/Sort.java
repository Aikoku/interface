/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import com.sun.scenario.effect.Merge;

/**
 *
 * @author Mark
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = fillRandomInt(10000, 1, 1000);
        int[] array2 = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        int[] array3 = new int[array1.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);

        show(array1);
        show(array2);
        show(array3);
        long start;

        start = System.nanoTime();
        cocktailSort(array1);
        System.out.println("Время Коктельной сортировки = " + (System.nanoTime() - start));
        show(array1);

        start = System.nanoTime();
        shell(array2);
        System.out.println("Время сортировкой Шелла = " + (System.nanoTime() - start));
        show(array2);

    }

    public static void cocktailSort(int[] array) {
        boolean pass;
        do {
            pass = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[ i] > array[ i + 1]) {
                    //Проверяет два элемента
                    int count = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = count;
                    pass = true;
                }
            }
            if (!pass) {
                //Выходим из форлупа, если условия не соблюдены
                break;
            }
            pass = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[ i] > array[ i + 1]) {
                    int count = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = count;
                    pass = true;
                }
            }
            //Если элементы не меняются, значит массив отсортирован
        } while (pass);
    }

    public static void shell(int[] array) {
        int i, j, sort, h, jump = 0;
        // Более быстрый вариант
        int[] dim = {1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
            84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
            58548857, 157840433, 410151271, 1131376761, 2147483647};
      //  int[] dim = {1, 2147483647};
        while (dim[jump] < array.length) {
            ++jump;//Через сколько элементов будет просмотр
        }
        while (--jump >= 0) {
            sort = dim[jump];
            for (i = sort; i < array.length; i++) { 
                j = i;
                h = array[i];
                while ((j >= sort) && (array[j - sort] > h)) {
                    array[j] = array[j - sort];
                    j = j - sort;
                }
                array[j] = h;
            }
        }
    }

    public static int[] fillRandomInt(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) randomInt(min, max);
        }
        return array;
    }   //РАНДОМИЗАТОР МАССИВА

    public static int randomInt(int min, int max) {
        int k = max - min;
        int random = (int) (min + Math.random() * (k + 1));
        return random;
    }   //РАНДОМИЗАТОР ЭЛЕМЕНТОВ МАССИВА

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
    }   //МЕТОД ВЫВОДА МАССИВА

}
