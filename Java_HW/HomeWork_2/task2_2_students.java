/*
 * Дана строка (получение через обычный текстовый файл!!!)

[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */


package HomeWork_2;

import java.io.*;

public class task2_2_students {
    public static void main(String[] args) {
        try (BufferedReader bReader = new BufferedReader(
                new FileReader("D:\\GEEKBRAINS\\JAVA\\Java_HW\\HomeWork_2\\task2_2_data.txt"))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                String line1 = line.replace("{", "").replace("}", "");
                String line2 = line1.replace("[", "").replace("]", "");
                StringBuilder result = new StringBuilder();
                String[] parts = line2.split(",");
                for (int i = 0; i < parts.length; i++) {
                    String[] element = parts[i].split(":");
                    //System.out.println(Arrays.toString(kv));
                    if (element[0].equals("\"фамилия\"")) {
                        result.append("Студент ").append(element[1]).append(" ");
                    }
                    if (element[0].equals("\"оценка\"")) {
                        result.append("получил ").append(element[1]).append(" ");
                    }
                    if (element[0].equals("\"предмет\"")) {
                        result.append("по предмету ").append(element[1]).append(".");
                    }
                }
                String output = result.toString().replace("\"", "");
                System.out.println(output);
            }
        }
        catch (Exception e) {
            System.out.println("Ошибка вывода");
        }
        
    }
}
