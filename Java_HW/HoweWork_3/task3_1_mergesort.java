// Реализовать алгоритм сортировки слиянием

package HoweWork_3;

import java.util.Arrays;

public class task3_1_mergesort {
    public static void main(String[] args) {

        int[] arraySort = { 3, 6, 2, 7, 1, 9, 5, 2, 8 };
        System.out.println("Входной массив: " + "\t" + Arrays.toString(arraySort));
        mergeSort(arraySort);
        System.out.println("Отсортированный массив: " + Arrays.toString(arraySort));

    }

    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int leftLen = array.length / 2;
        int rightLen = array.length - leftLen;
        int i = 0, j = 0;

        for (int k = 0; k < array.length; k++) {
            if (i == leftLen){
                array[k] = right[j];
                j++;
            } else if (j == rightLen){
                array[k] = left[i];
                i++;
            } else {
                if (left[i] < right[j]) {
                    array[k] = left[i++];
                } else {
                    array[k] = right[j++];
                }
            }
        }
    }

}
