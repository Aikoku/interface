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
        long start, end;

        start = System.nanoTime();
        cocktailSort(array1);
        end = System.nanoTime();
        System.out.println("Время Коктельной сортировки = " + (end - start));
        show(array1);

        start = System.nanoTime();
        sort_shell(array2);
        end = System.nanoTime();
        System.out.println("Время сортировкой Шелла = " + (end - start));
        show(array2);

        start = System.nanoTime();
        mergeSort(array3);
        end = System.nanoTime();
        System.out.println("Время сортировки Слиянием = " + (end - start));
        show(array3);

    }

    public static int[] mergeSort(int array[]) // pre: array is full, all elements are valid integers (not null)
    // post: array is sorted in ascending order (lowest to highest)
    {
        // if the array has more than 1 element, we need to split it and merge the sorted halves
        if (array.length > 1) {
		// number of elements in sub-array 1
            // if odd, sub-array 1 has the smaller half of the elements
            // e.g. if 7 elements total, sub-array 1 will have 3, and sub-array 2 will have 4
            int elementsInA1 = array.length / 2;
		// we initialize the length of sub-array 2 to
            // equal the total length minus the length of sub-array 1
            int elementsInA2 = array.length - elementsInA1;
            // declare and initialize the two arrays once we've determined their sizes
            int arr1[] = new int[elementsInA1];
            int arr2[] = new int[elementsInA2];
            // copy the first part of 'array' into 'arr1', causing arr1 to become full
            for (int i = 0; i < elementsInA1; i++) {
                arr1[i] = array[i];
            }
            // copy the remaining elements of 'array' into 'arr2', causing arr2 to become full
            for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i++) {
                arr2[i - elementsInA1] = array[i];
            }
		// recursively call mergeSort on each of the two sub-arrays that we've just created
            // note: when mergeSort returns, arr1 and arr2 will both be sorted!
            // it's not magic, the merging is done below, that's how mergesort works :)
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

		// the three variables below are indexes that we'll need for merging
            // [i] stores the index of the main array. it will be used to let us
            // know where to place the smallest element from the two sub-arrays.
            // [j] stores the index of which element from arr1 is currently being compared
            // [k] stores the index of which element from arr2 is currently being compared
            int i = 0, j = 0, k = 0;
		// the below loop will run until one of the sub-arrays becomes empty
            // in my implementation, it means until the index equals the length of the sub-array
            while (arr1.length != j && arr2.length != k) {
                // if the current element of arr1 is less than current element of arr2
                if (arr1[j] < arr2[k]) {
                    // copy the current element of arr1 into the final array
                    array[i] = arr1[j];
				// increase the index of the final array to avoid replacing the element
                    // which we've just added
                    i++;
				// increase the index of arr1 to avoid comparing the element
                    // which we've just added
                    j++;
                } // if the current element of arr2 is less than current element of arr1
                else {
                    // copy the current element of arr1 into the final array
                    array[i] = arr2[k];
				// increase the index of the final array to avoid replacing the element
                    // which we've just added
                    i++;
				// increase the index of arr2 to avoid comparing the element
                    // which we've just added
                    k++;
                }
            }
		// at this point, one of the sub-arrays has been exhausted and there are no more
            // elements in it to compare. this means that all the elements in the remaining
            // array are the highest (and sorted), so it's safe to copy them all into the
            // final array.
            while (arr1.length != j) {
                array[i] = arr1[j];
                i++;
                j++;
            }
            while (arr2.length != k) {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        // return the sorted array to the caller of the function
        return array;
    }

    public static void cocktailSort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[ i] > array[ i + 1]) {
                    //test whether the two elements are in the wrong order
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                //we can exit the outer loop here if no swaps occurred.
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[ i] > array[ i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            //if no elements have been swapped, then the list is sorted
        } while (swapped);
    }

    public static void sort_shell(int[] array) {
        int i, j, k, h, m = 0, b = array.length;
        int[] d = {1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
            84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
            58548857, 157840433, 410151271, 1131376761, 2147483647};
        while (d[m] < b) {
            ++m;
        }
        while (--m >= 0) {
            k = d[m];
            for (i = k; i < b; i++) {     // k-сортировка
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
