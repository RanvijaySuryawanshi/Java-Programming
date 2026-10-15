import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("List: " + list);
        
        list.add(2, "Grapes");
        System.out.println("After insertion: " + list);
        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, "Pineapple");
        System.out.println("After replacing: " + list);
        System.out.println("Contains Mango: " + list.contains("Mango"));

        System.out.println("Size: " + list.size());

        list.remove(2);
        System.out.println("After deletion: " + list);

        list.remove("Orange");
        System.out.println("After removing Orange: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }
}