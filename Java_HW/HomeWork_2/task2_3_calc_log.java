/*
* Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
*/

package HomeWork_2;

import java.util.Scanner;
import java.util.logging.*;
import java.io.*;

public class task2_3_calc_log {
    public static Logger logger = Logger.getLogger(task2_3_calc_log.class.getName());
    public static void main(String[] args) throws SecurityException, IOException{
        logger.setLevel(Level.INFO);
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
                // System.out.println(result);
                break;
            case '-':
                result = first_num - second_num;
                // System.out.println(result);
                break;
            case '*':
                result = first_num * second_num;
                // System.out.println(result);
                break;
            case '/':
                result = first_num / second_num;
                //System.out.println(result);
                break;        
            default:
                System.out.println("Задана неверная операция");
                break;
            }
            FileHandler fh;   
            try {
                fh = new FileHandler("Calc_Log.log", true);   
                logger.addHandler(fh);
                SimpleFormatter sFormatter = new SimpleFormatter();
                fh.setFormatter(sFormatter);
                logger.info("Результат вычисления: " + result);                
            } catch (Exception e) {
                System.out.println("Что-то пошло не так...");
            }
            String info = String.format("%d", result);
            System.out.println(info);
            writeLog(info, oper, first_num, second_num);
    }
    public static void writeLog(String info, char oper, int first_num, int second_num) {
        BufferedWriter bWriter = null;
        FileWriter fWriter = null;
        try {
            fWriter = new FileWriter("Calc_Log.txt", true);
            bWriter = new BufferedWriter(fWriter);
            bWriter.write("Результат вычисления: " + first_num + " " + oper + " " + second_num + " = " + info);
            bWriter.write("\n");
            bWriter.close();
            fWriter.close();
        } catch (Exception e) {
            System.out.println("Запись в файл не удалась!");
        } 
    }
}

