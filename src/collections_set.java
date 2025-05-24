import java.util.*;
public class collections_set {
    public static void main(String[] args) {
        Set<String> brand = new HashSet<>();

        brand.add("Apple");
        brand.add("Oneplus");
        brand.add("Samsung");
        brand.add("redmi");
        brand.add("realme");

        System.out.println(brand);

        for (String br:brand)
        {
            System.out.println(br);
        }
    }
}
