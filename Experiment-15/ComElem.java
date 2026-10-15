import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        HashSet<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        System.out.println("Common elements: " + common);
    }
}