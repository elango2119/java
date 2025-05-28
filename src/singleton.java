public class singleton {

    private static singleton instance;

    private singleton()
    {
        System.out.println("singleton invoked");
    }

    public static singleton getinstance()
    {
        if(instance==null)
        {
            instance = new singleton();
        }
        return instance;
    }
}

class main
{
    public static void main(String[] args) {

        singleton Singleton = singleton.getinstance();
    }
}




