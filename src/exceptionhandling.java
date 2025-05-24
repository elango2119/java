public class exceptionhandling {
    public static void main(String[] args) {
        int a = 21;
        int b = 0;
        int c = 0;
        try {

            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Divide by 0 not allowed");
        }
    }
}

