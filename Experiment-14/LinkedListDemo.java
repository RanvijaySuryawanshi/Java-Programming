import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("LinkedList: " + list);
        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.set(2, 25);
        System.out.println("After replacing: " + list);

        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Size: " + list.size());

        list.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);

        System.out.println("Elements using traversal:");
        for (Integer n : list) {
            System.out.println(n);
        }

        list.clear();
        System.out.println("After clear: " + list);
    }
}