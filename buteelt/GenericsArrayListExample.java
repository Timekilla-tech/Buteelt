import java.util.ArrayList;
import java.util.List;

public class GenericsArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Woorld");
        stringList.add("!");

        // Creating an ArrayList of Integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Accessing elements from ArrayList
        String firstString = stringList.get(0);
        int firstInteger = integerList.get(0);

        System.out.println("First string: " + firstString);
        System.out.println("First integer: " + firstInteger);

        // Iterating over ArrayList
        System.out.println("String List:");
        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("Integer List:");
        for (int num : integerList) {
            System.out.println(num);
        }
    }
}
