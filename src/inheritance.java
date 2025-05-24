class animal{
    void eat()
    {
        System.out.println("animal is eating");
    }
    void sleep()
    {
        System.out.println("animal is sleeping");
    }
}

class dog extends animal
{
    @Override
    void eat()
    {
        System.out.println("jackie is eating");
    }

    @Override
    void sleep() {
        System.out.println("jackie is sleeping");
    }
}
public class inheritance {
    public static void main(String[] args) {
        animal obj = new dog();
        obj.eat();
    }
}
