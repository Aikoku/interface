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