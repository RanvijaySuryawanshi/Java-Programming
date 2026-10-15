import java.util.*;

public class InsertionComparison {
    public static void main(String[] args) {

        int n = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        long arrayTime = System.nanoTime() - start;
        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        long linkedTime = System.nanoTime() - start;

        System.out.println("ArrayList insertion time: " + arrayTime + " ns");
        System.out.println("LinkedList insertion time: " + linkedTime + " ns");
    }
}