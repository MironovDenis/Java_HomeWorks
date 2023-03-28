// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package HoweWork_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task3_3_findValue {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>();
        Random random = new Random();

        for (int index = 0; index < 10; index++) {
            int num = random.nextInt(1, 21);
            MyList.add(num);
        }
        System.out.println(MyList);

        MyList.sort(Comparator.naturalOrder());
        int MinValue = MyList.get(0);
        int MaxValue = MyList.get(MyList.size() - 1);
        int sum = 0;
        for (int i = 0; i < MyList.size(); i++) {
            sum += MyList.get(i);
        }
        int ArithMeanValue = sum / MyList.size();

        System.out.println("Минимальное значение: " + MinValue);
        System.out.println("Максимальное значение: " + MaxValue);
        System.out.println("Среднее арифметическое: " + ArithMeanValue);
    }
}
