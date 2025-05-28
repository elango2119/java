public class threadsafe {
    private static threadsafe instance;

    private threadsafe()
    {
        System.out.println("threadsafe invoked");
    }

    public static synchronized threadsafe getInstance()
    {
        if(instance==null) {
            instance = new threadsafe();
        }
        return instance;
    }
}

class thread
{
    public static void main(String[] args) {
       threadsafe thread = threadsafe.getInstance();

    }
}
