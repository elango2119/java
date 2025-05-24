abstract class vehicle
{
    abstract void start();
}

class car extends vehicle
{
    @Override
    public void start() {
        System.out.println("Car Starts");
    }
}

public class abstraction
{
    public static void main(String[] args) {
        vehicle obj = new car();
        obj.start();
    }
}