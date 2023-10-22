public class constructDemo
{

    public constructDemo()
    {

        System.out.println("I am in constructor");
    }

    public constructDemo(int a , int b){
        System.out.println("In Parametrized constructor");
    }

    public void getData()
    {
        System.out.println("I am the method");
    }
    public static void main(String[] args)
    {
        constructDemo cd = new constructDemo();
        constructDemo ca= new constructDemo(4,5);

    }
}
