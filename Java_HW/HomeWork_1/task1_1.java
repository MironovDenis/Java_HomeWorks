/*
* Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
*/

import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int num_N = iScanner.nextInt();
        iScanner.close();

        int progr_N = 0;
        for (int i = 1; i <= num_N; i++) {
            progr_N += i;
        }
        System.out.println("Арифметическая прогрессия числа " + num_N + " = " + progr_N);

        int factor_N = 1;
        for (int i = 1; i <= num_N; i++) {
            factor_N = factor_N * i;
        }
        System.out.println("Факториал числа " + num_N + " = " + factor_N);
    }
}
