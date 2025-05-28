public class eager {

    private static final eager instance = new eager();

    private eager()
    {
        System.out.println("eager invoked");
    }

    public static eager getInstance()
    {
        return instance;
    }
}

class eg
{
    public static void main(String[] args) {
        eager e = eager.getInstance();
    }
}
