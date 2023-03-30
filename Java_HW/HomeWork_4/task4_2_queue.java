// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HomeWork_4;

import java.util.LinkedList;

public class task4_2_queue {

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static void dequeue(LinkedList<Integer> list) {
        list.pollFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return (int) list.peekFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        enqueue(queue, 1);
        enqueue(queue, 25);
        enqueue(queue, 12);
        enqueue(queue, 57);
        enqueue(queue, 4);
        System.out.println(queue);

        dequeue(queue);
        System.out.println(queue);

        System.out.println(first(queue));
    }

}
