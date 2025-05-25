import java.util.*;
import java.util.stream.*;
public class stream {
    public static void main(String[] args) {

        //Intermediate operation
        //filter
        List<Integer> no = Arrays.asList(21,19,1,4,30,29);
//        no.stream().filter(nu->nu%2==0).forEach(System.out::println);
        List<Integer> num = no.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(num);

        //map
        List<String> eg = Arrays.asList("Elango","kannan","gomathi");
//        eg.stream().map(String::toUpperCase).forEach(System.out::println);
        List<String> upper = eg.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);


        //sorted
        List<Integer> num1 = Arrays.asList(4,1,21,19,30,29);
//        num2.stream().sorted().forEach(System.out::println);
        List<Integer> num2 = num1.stream().sorted().collect(Collectors.toList());
        System.out.println(num2);

        //distinct
        List<String> unique = Arrays.asList("elango","jackie","manisha","elango","jackie","manisha");
//        unique.stream().distinct().forEach(System.out::println);
        List<String> uq = unique.stream().distinct().collect(Collectors.toList());
        System.out.println(uq);


        //Treminal operation
        //foreach
        List<Integer> no1 = Arrays.asList(21,19,4,1,30,29);
        no1.stream().filter(n->n%2!=0).forEach(System.out::println);

        //collect
        List<Integer> e = Arrays.asList(21,19,4,1,30,29);
        List<Integer> g = e.stream().collect(Collectors.toList());
        System.out.println(g);

        //count
        List<Integer> numbers = Arrays.asList(21,19,4,1,30,29,7);
        long count = numbers.stream().count();
        System.out.println(count);

        //reduce
        List<Integer> number = Arrays.asList(21,19,4,1,30,29,7);
        int reduce = number.stream().reduce(0,Integer::sum);
        System.out.println(reduce);
    }
}
