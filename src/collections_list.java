import java.util.*;
public class collections_list {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");

        System.out.println(fruits);

        for (String fr : fruits)
        {
            System.out.println(fr);
        }

    }
}
