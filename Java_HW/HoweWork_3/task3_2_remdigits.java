// дан произвольный список целых чисел, удалить из него чётные числа

package HoweWork_3;

import java.util.ArrayList;
import java.util.Random;

public class task3_2_remdigits {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>();
        Random random = new Random();

        for (int index = 0; index < 10; index++) {
            int num = random.nextInt(1, 21);
            MyList.add(num);
        }
        System.out.println(MyList);

        for (int i = 0; i < MyList.size(); i++) {
            if (MyList.get(i) % 2 == 0) {
                MyList.remove(MyList.get(i--));
            }
        }
        System.out.println(MyList);
    }
}
