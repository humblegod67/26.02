package lesson1;
import java.util.Arrays;
public class HomeWorkApp3 {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        int n = 5;
        int[][] arr4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr4[i][i] = 1;
        }
        for (int[] row : arr4) {
            System.out.println(Arrays.toString(row));
        }

        int[] arr5 = createArray(10, 5);
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(findMinMax(arr6));

        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(checkBalance(arr7));

        int[] arr8 = {1, 2, 3, 4, 5};
        shiftArray(arr8, 2);
        System.out.println(Arrays.toString(arr8));
    }

    private static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static String findMinMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return "Min: " + min + ", max: " + max;
    }

    private static boolean checkBalance(int[] array) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                leftSum += array[i];
            } else {
                rightSum += array[i];
            }
        }
        return leftSum == rightSum;
    }

    private static void shiftArray(int[] array, int n) {
        if (n < 0) {
            n += array.length;
        }
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
        if (n > 0) {
            shiftArray(array, n - 1);
        }
    }}