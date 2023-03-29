// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

package HomeWork_4;

import java.util.LinkedList;

public class task4_1_reverseLList {
    public static void main(String[] args) {

        LinkedList<String> baseLList = new LinkedList<>();
      
        baseLList.add("A");
        baseLList.add("B");
        baseLList.add("C");
        baseLList.add("D");

        System.out.println("Исходный список: " + baseLList);
        LinkedList<String> reverseLList = reverseLinkedList(baseLList);
        System.out.println("Перевернутый список: " + reverseLList);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> reverseLList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            reverseLList.add(element);
        }
        return reverseLList;
    }

}
