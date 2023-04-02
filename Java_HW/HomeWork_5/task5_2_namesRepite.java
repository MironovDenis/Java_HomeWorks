package HomeWork_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class task5_2_namesRepite {

    public static ArrayList<String> newList(ArrayList<String> list) {
        ArrayList<String> namesList = new ArrayList<>();
        for (String item : list) {
            String[] names = item.split(" ");
            namesList.add(names[0]);
        }
        return namesList;
    }

    public static Map<String, Integer> newMap(ArrayList<String> list) {
        Map<String, Integer> namesMap = new HashMap<>();
        for (String name : list) {
            if (namesMap.containsKey(name)) {
                namesMap.put(name, namesMap.get(name) + 1);
            } else {
                namesMap.put(name, 1);
            }
        }
        return namesMap;
    }

    public static void printSortedNames(Map<String, Integer> map) {
        List sortedNames = new ArrayList<>();
        for (var item : map.entrySet()) {
            sortedNames.add(item.getValue() + " - " + item.getKey());            
        }
        sortedNames.sort(Comparator.reverseOrder());
        System.out.println("Имена отсортированы по уменьшению популярности: ");
        for (var count : sortedNames) {
            System.out.println(count);            
        }
    }

    public static void main(String[] args) {
        ArrayList<String> employeesList = new ArrayList<>(
                Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                        "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                        "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                        "Петр Петин", "Иван Ежов"));
        ArrayList<String> namesList = newList(employeesList);
        Map<String, Integer> namesMap = newMap(namesList);
        // System.out.println(namesMap);
        printSortedNames(namesMap);
    }
}
