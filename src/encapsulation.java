class employee
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name=name;
    }

    public int getage()
    {
        return age;
    }

    public void setage(int age)
    {
        this.age=age;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        employee obj = new employee();

        obj.setName("Elango K");
        obj.setage(21);

        System.out.println(obj.getName());
        System.out.println(obj.getage());
    }
}
