import java.util.*;

public class HashSetDuplicate {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(10);

        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());
    }
}