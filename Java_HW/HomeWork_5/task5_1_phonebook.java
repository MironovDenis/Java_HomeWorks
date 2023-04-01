package HomeWork_5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class task5_1_phonebook {

    public static void addPhoneNumber(String name, String number, Map<String, List<String>> map) {
        if (map.containsKey(name)) {
            map.get(name).add(number);
        } else {
            List numbers = new ArrayList<>();
            numbers.add(number);
            map.put(name, numbers);
        }
    }

    public static void printAll(Map<String, List<String>> map) {
        for (var item : map.entrySet()) {
            System.out.printf("%s: %s%n", item.getKey(), String.join(", ", item.getValue()));
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        Scanner iScanner = new Scanner(System.in,  "UTF-8");

        while (true) {
            String menu = "Введите: \n" +
                    "1) Добавить номер \n" +
                    "2) Вывести все записи \n" +
                    "3) Выход";
            System.out.println(menu);
            int choice = iScanner.nextInt();
            if (choice == 1) {
                System.out.print("Введите фамилию: ");
                String name = iScanner.next();
                System.out.print("Введите номер телефона: ");
                String number = iScanner.next();
                addPhoneNumber(name, number, phoneBook);
            } else if (choice == 2) {
                printAll(phoneBook);
            } else if (choice == 3){
                System.out.println("Выход");
                break;
            }
        }
    }
}
