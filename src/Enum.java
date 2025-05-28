public enum Enum {
    instance;

    public void show()
    {
        System.out.println("In show");
    }
}

class e
{
    public static void main(String[] args) {
        Enum.instance.show();
    }
}
