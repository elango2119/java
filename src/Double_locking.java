public class Double_locking {
    private static Double_locking instance;

    private Double_locking()
    {
        System.out.println("Double locking invoked");
    }

    public static Double_locking getInstance()
    {
        if(instance==null)
        {
            synchronized (Double_locking.class)
            {
                if (instance==null)
                {
                    instance = new Double_locking();
                }
            }
        }
        return instance;
    }
}

class Double
{
    public static void main(String[] args) {
        Double_locking dd = Double_locking.getInstance();
    }
}
