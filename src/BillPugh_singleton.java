public class BillPugh_singleton {

    private BillPugh_singleton()
    {
        System.out.println("BIll Pugh invoked");
    }

    public class Billpugh
    {
        private static final BillPugh_singleton instance = new BillPugh_singleton();
    }

    public static BillPugh_singleton getInstance()
    {
        return Billpugh.instance;
    }
}

class bill
{
    public static void main(String[] args) {
        BillPugh_singleton bp = BillPugh_singleton.getInstance();
    }
}
