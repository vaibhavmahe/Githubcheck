


public class thisDemo {

    int a = 2;

    public void getData() {
        int a = 3;

        System.out.println(this.a);
    }

    public int divide(int d, int n){

        int result = n/d;

        return result;
    }

    ;

    public static void main(String[] args) {
        thisDemo td = new thisDemo();
        td.getData();

        try {
            int result = td.divide(0, 8);

            System.out.println(result);
        }
        catch (Exception e)
        {e.printStackTrace();
        System.out.println("code fat gaya");
        }
    }
}
