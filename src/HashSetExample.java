import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample

{
    public static void main(String[] args) {
        // hashset , LinkedhashSet  dont accept duplicate values
        //No guarantee that elements stored in sequential order

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("India");
        hs.add("Columbia");

        Iterator<String> i = hs.iterator();
        System.out.println(i.next());
        if(i.equals("India")){
            System.out.println(i);

        }
        System.out.println(hs.size());



    }
}
