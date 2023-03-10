/*
 * Вывести все простые числа от 1 до 1000
 */

public class task1_2_simple_nums {
    public static void main(String[] args) {
        System.out.println("Вывести все простые числа от 1 до 1000");
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int value = 1; value < 1000; value++) {
                if (i % value == 0){
                    count +=1;
                }
            }
            if (count < 3) {
                System.out.print("  " + i + ",");
            }
        }
    }
}
