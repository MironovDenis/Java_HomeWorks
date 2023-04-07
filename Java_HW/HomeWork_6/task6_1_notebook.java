package HomeWork_6;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле

// приветствие

// Выбор параметра
// выбор конкретнее
// вывод подходящих

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class task6_1_notebook {

    public static void manufacturerFilter(Set<notebook> notebooks, Scanner iScanner) {
        Set<String> brandSet = new TreeSet<>();
        for (notebook item : notebooks) {
            brandSet.add(item.getManufacturer());
        }
        System.out.println("Выберите производителя: " + brandSet.toString());
        System.out.print("--> ");
        String brand = iScanner.nextLine();
        if (brandSet.contains(brand)) {
            for (notebook item : notebooks) {
                if (item.getManufacturer().equals(brand)) {
                    item.vievInfo();
                    System.out.println("Нажмите Enter для продолжения");
                    iScanner.nextLine();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            manufacturerFilter(notebooks, iScanner);
        }
    }

    public static void displaySizeFilter(Set<notebook> notebooks, Scanner iScanner) {
        Set<String> displaySet = new TreeSet<>();
        for (notebook item : notebooks) {
            displaySet.add(item.getDisplaySize());
        }
        System.out.println("Выберите диагональ дисплея: " + displaySet.toString());
        System.out.print("--> ");
        String size = iScanner.nextLine();
        if (displaySet.contains(size)) {
            for (notebook item : notebooks) {
                if (item.getDisplaySize().equals(size)) {
                    item.vievInfo();
                    System.out.println("Нажмите Enter для продолжения");
                    iScanner.nextLine();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            displaySizeFilter(notebooks, iScanner);
        }
    }

    public static void ramSizeFilter(Set<notebook> notebooks, Scanner iScanner) {
        Set<Integer> ramSet = new TreeSet<>();
        for (notebook item : notebooks) {
            ramSet.add(item.getRamSize());
        }
        System.out.println("Выберите размер ОЗУ: " + ramSet.toString());
        System.out.print("--> ");
        String size = iScanner.nextLine();
        int ram = Integer.parseInt(size);
        if (ramSet.contains(ram)) {
            for (notebook item : notebooks) {
                if (item.getRamSize() == ram) {
                    item.vievInfo();
                    System.out.println("Нажмите Enter для продолжения");
                    iScanner.nextLine();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            ramSizeFilter(notebooks, iScanner);
        }
    }

    public static void hddSizeFilter(Set<notebook> notebooks, Scanner iScanner) {
        Set<Integer> hddSet = new TreeSet<>();
        for (notebook item : notebooks) {
            hddSet.add(item.getHddSize());
        }
        System.out.println("Выберите размер HDD: " + hddSet.toString());
        System.out.print("--> ");
        String size = iScanner.nextLine();
        int hdd = Integer.parseInt(size);
        if (hddSet.contains(hdd)) {
            for (notebook item : notebooks) {
                if (item.getHddSize() == hdd) {
                    item.vievInfo();
                    System.out.println("Нажмите Enter для продолжения");
                    iScanner.nextLine();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            hddSizeFilter(notebooks, iScanner);
        }
    }

    public static void osFilter(Set<notebook> notebooks, Scanner iScanner) {
        Set<String> osSet = new TreeSet<>();
        for (notebook item : notebooks) {
            osSet.add(item.getOs());
        }
        System.out.println("Выберите операционную систему: " + osSet.toString());
        System.out.print("--> ");
        String os = iScanner.nextLine();
        if (osSet.contains(os)) {
            for (notebook item : notebooks) {
                if (item.getOs().equals(os)) {
                    item.vievInfo();
                    System.out.println("Нажмите Enter для продолжения");
                    iScanner.nextLine();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            osFilter(notebooks, iScanner);
        }
    }

    public static void colorFilter(Set<notebook> notebooks, Scanner iScanner) {
        Set<String> colorSet = new TreeSet<>();
        for (notebook item : notebooks) {
            colorSet.add(item.getColor());
        }
        System.out.println("Выберите цвет: " + colorSet.toString());
        System.out.print("--> ");
        String color = iScanner.nextLine();
        if (colorSet.contains(color)) {
            for (notebook item : notebooks) {
                if (item.getColor().equals(color)) {
                    item.vievInfo();
                    System.out.println("Нажмите Enter для продолжения");
                    iScanner.nextLine();
                }
            }
        } else {
            System.out.println("Неправильное значение. Попробуйте снова");
            colorFilter(notebooks, iScanner);
        }
    }

    public static void vievAll(Set<notebook> notebooks, Scanner iScanner) {
        for (notebook item : notebooks) {
            item.vievInfo();
            System.out.println("Нажмите Enter для продолжения");
            iScanner.nextLine();
        }
    }

    public static void main(String[] args) {
        notebook model1 = new notebook("Acer", "15,6", 4, 256, "Windows 10", "black");
        notebook model2 = new notebook("MSI", "17,3", 16, 1000, "Windows 10", "silver");
        notebook model3 = new notebook("Huawei", "14", 8, 512, "Linux", "black");
        notebook model4 = new notebook("Asus", "15,6", 8, 1000, "no OS", "grey");
        notebook model5 = new notebook("Apple", "13,3", 8, 256, "macOS", "gold");
        notebook model6 = new notebook("Dell", "14", 8, 256, "Windows 11", "silver");
        notebook model7 = new notebook("HP", "15,6 ", 16, 1000, "no OS", "grey");
        notebook model8 = new notebook("Huawei", "14", 8, 512, "Windows 11", "silver");
        notebook model9 = new notebook("Lenovo", "15,6", 4, 128, "no OS", "black");
        notebook model10 = new notebook("Apple", "16,2", 16, 512, "macOS", "grey");

        Set<notebook> notebooks = new HashSet<notebook>(
                Arrays.asList(model1, model2, model3, model4, model5, model6, model7, model8, model9, model10));

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Здравствуйте!");
        boolean key = true;
        while (key) {
            System.out.println("Выбрать по производителю,\t введите - 1\n" +
                    "Выбрать по диагонали дисплея,\t введите - 2\n" +
                    "Выбрать по размеру ОЗУ,\t\t введите - 3\n" +
                    "Выбрать по объему диска,\t введите - 4\n" +
                    "Выбрать по операционной системе, введите - 5\n" +
                    "Выбрать по цвету,\t\t введите - 6\n" +
                    "Просмотреть все ноутбуки,\t введите - 7\n" +
                    "Для выхода из меню,\t\t введите - 0");
            System.out.print("--> ");
            String menu = iScanner.nextLine();
            switch (menu) {
                case "1":
                    manufacturerFilter(notebooks, iScanner);
                    break;
                case "2":
                    displaySizeFilter(notebooks, iScanner);
                    break;
                case "3":
                    ramSizeFilter(notebooks, iScanner);
                    break;
                case "4":
                    hddSizeFilter(notebooks, iScanner);
                    break;
                case "5":
                    osFilter(notebooks, iScanner);
                    break;
                case "6":
                    colorFilter(notebooks, iScanner);
                    break;
                case "7":
                    vievAll(notebooks, iScanner);
                    break;
                case "0":
                    System.out.println("Завершение программы.");
                    key = false;
                    break;
                default:
                    System.out.println("Пунк меню не найден.");
                    break;
            }
        }
    }

}
