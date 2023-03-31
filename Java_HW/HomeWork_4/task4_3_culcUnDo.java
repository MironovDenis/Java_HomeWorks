package HomeWork_4;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class task4_3_culcUnDo {
    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        int first_num = inputNum("Введите первое число: ");
        String oper = inputOper("Определите знак операции: ");
        int second_num = inputNum("Введите второе число: ");
        int result = 0;

        if (Objects.equals(oper, "+")) {
            result = first_num + second_num;
        } else if (Objects.equals(oper, "-")) {
            result = first_num - second_num;
        } else if (Objects.equals(oper, "*")) {
            result = first_num * second_num;
        } else if (Objects.equals(oper, "/")) {
            result = first_num / second_num;
        } else
            System.out.printf("Неверная операция!");

        System.out.println("вывод: " + result);

        stack.push(result);

        while (true) {
            oper = inputOper("Определите знак операции или введите \"undo\" или \"exit\": ");
            if (Objects.equals(oper, "undo")) {
                stack.pop();
                result = stack.peek();
                System.out.println("вывод: " + result);
            } else if (Objects.equals(oper, "exit")) {
                System.out.println("Завершение работы!");
                break;
            } else {
                second_num = inputNum("Введите число: ");
                if (Objects.equals(oper, "+")) {
                    result = result + second_num;
                } else if (Objects.equals(oper, "-")) {
                    result = result - second_num;
                } else if (Objects.equals(oper, "*")) {
                    result = result * second_num;
                } else if (Objects.equals(oper, "/")) {
                    result = result / second_num;
                } else
                    System.out.println("Неверная операция!");
                stack.push(result);
                System.out.println("вывод: " + result);
            }
        }
    }

    public static int inputNum(String text) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(text);
        int num = iScanner.nextInt();
        return num;
    }

    public static String inputOper(String text) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(text);
        String oper = iScanner.nextLine();
        return oper;
    }
}