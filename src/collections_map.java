import java.util.*;
public class collections_map {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();

        student.put(1,"elango");
        student.put(2,"tharun");
        student.put(3,"sandy");
        student.put(4,"bharathi");

        System.out.println(student);

        for (Map.Entry<Integer,String> value : student.entrySet())
        {
            System.out.println("Roll No :" + value.getKey() + " Name :" + value.getValue());
        }
    }
}
