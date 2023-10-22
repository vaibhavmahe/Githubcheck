public class ChildAircraft extends ParentAircraft{


    @Override
    public void bodycolor() {

        System.out.println("Child system");

    }
    //Method overloading either argument type or count should be different

    public void getData(int a){
        System.out.println(a);
    }
    public void getData(int a , int b){}
    public void getData(String a){}


    public static void main (String[] args)
    {


ChildAircraft c =new ChildAircraft();

//c.bodycolor();
//c.engine();
        c.bodycolor();
c.getData(2);
c.getData("Hello");

    }}
