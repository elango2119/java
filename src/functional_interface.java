import java.util.function.*;
public class functional_interface {
    public static void main(String[] args) {

        //PREDICATE
        Predicate<Integer> evenorodd = no -> no%2==0;
        System.out.println(evenorodd.test(21));

        //FUNCTION
        Function<String,String> toupper = str -> str.toUpperCase();
        System.out.println(toupper.apply("elango"));

        //CONSUMER
        Consumer<String> message = msg -> System.out.println("HELLO" + msg);
        message.accept("WORLD !");

        //SUPPLIER
        Supplier<Integer> randomno = () -> (int)  (10 * Math.random());
        System.out.println(randomno.get());

        //BIREDICATE
        BiPredicate<String,String> check = (s1,s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(check.test("elango","ElAnGo"));

        //BIFUNCTION
        BiFunction<String,String,String> fullname = (str1,str2) -> str1+" "+str2;
        System.out.println(fullname.apply("Elango","Kannan"));

        //BICONSUMER
        BiConsumer<Integer,Integer> add = (n1,n2) -> System.out.println(n1+n2);
        add.accept(21,19);

    }
}
