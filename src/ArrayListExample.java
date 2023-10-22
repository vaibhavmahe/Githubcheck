import java.util.ArrayList;

public class ArrayListExample
{

    public static void main(String[] args) {
        // can add duplicates Arraylist, linkedlist,vector are types of List
        ArrayList<String> al =new ArrayList<String>();
        al.add("Rahul");
        al.add("java");
        String get=al.get(1);
        System.out.println(al);
        System.out.println(get);
        System.out.println(al.size());
    }
}
