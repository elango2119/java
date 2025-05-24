class calculator
{
    int add(int a,int b)
    {
        return a+b;
    }

    double add(double a,double b)
    {
        return a+b;
    }

    int sub(int a,int b)
    {
        return a-b;
    }

    double sub(double a,double b)
    {
        return a-b;
    }

    int mul(int a,int b)
    {
        return a*b;
    }

    double mul(double a,double b)
    {
        return a*b;
    }

    int div(int a,int b)
    {
        return a/b;
    }

    double div(double a,double b)
    {
        return a/b;
    }

}
public class polymorphism {
    public static void main(String[] args) {
        calculator obj = new calculator();

        System.out.println(obj.add(21,19));
        System.out.println(obj.sub(21,19));
        System.out.println(obj.mul(21,19));
        System.out.println(obj.div(21,19));
    }
}
