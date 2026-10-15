import java.util.*;

public class HashSetToArrayList {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("HashSet: " + set);

        ArrayList<Integer> list = new ArrayList<>(set);

        System.out.println("ArrayList: " + list);
    }
}