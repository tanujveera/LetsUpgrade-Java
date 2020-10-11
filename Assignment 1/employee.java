class employee
{
    String name="Saurab";
    int age=23;
    String city="Chennai";

    public void callBack()
    {
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city name is "+city);
    }

    public static void main(String[] args)
    {
        employee c= new employee();
        c.callBack();
    }



}