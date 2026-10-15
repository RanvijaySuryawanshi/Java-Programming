import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("HashSet: " + set);
        System.out.println("Contains 20: " + set.contains(20));

        System.out.println("Size: " + set.size());

        set.remove(30);
        System.out.println("After removing 30: " + set);

        System.out.println("Is set empty: " + set.isEmpty());

        System.out.println("Elements using iterator:");
        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        set.clear();
        System.out.println("After clear: " + set);

        System.out.println("Is set empty: " + set.isEmpty());
    }
}