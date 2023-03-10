/*
 * Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

import java.util.Scanner;

public class task1_3_calculator {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_num = iScanner.nextInt();
        System.out.print("Определите знак операции: ");
        String oper_sign = iScanner.next();
        char oper = oper_sign.charAt(0);
        System.out.print("Введите второе число: ");
        int second_num = iScanner.nextInt();
        iScanner.close();
        int result = 0;
        System.out.print("Результат вычисления: ");
        switch (oper) {
            case '+':
                result = first_num + second_num;
                System.out.println(result);
                break;
            case '-':
                result = first_num - second_num;
                System.out.println(result);
                break;
            case '*':
                result = first_num * second_num;
                System.out.println(result);
                break;
            case '/':
                result = first_num / second_num;
                System.out.println(result);
                break;        
            default:
                System.out.println("Задана неверная операция");
                break;
        }
    }
}

// if (oper == '+') {
//     result = first_num + second_num;
//     System.out.println(result);
// }
// if (oper == '-') {
//     result = first_num - second_num;
//     System.out.println(result);
// }
// if (oper == '*') {
//     result = first_num * second_num;
//     System.out.println(result);
// }
// if (oper == '/') {
//     result = first_num / second_num;
//     System.out.println(result);
// }
// else {
//     System.out.println("Задана неверная операция");
// }