/*
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
 * результат после каждой итерации запишите в лог-файл.
 */

package HomeWork_2;

import java.util.Arrays;
import java.util.logging.*;

public class task2_1_bubblesort {
    public static Logger logger = Logger.getLogger(task2_1_bubblesort.class.getName());

    public static void main(String[] args) {
        int[] arraySort = { 3, 6, 2, 7, 1, 9, 5, 2, 8 };
        logger.setLevel(Level.INFO);
        logger.info("Исходный массив: " + Arrays.toString(arraySort));
        bubbleSort(arraySort);
        logger.info("Отсортированный массив: " + Arrays.toString(arraySort));
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            logger.info("Промежуточный результат на " + (i + 1) + "-й итерации: " + Arrays.toString(array));
        }
    }
}
