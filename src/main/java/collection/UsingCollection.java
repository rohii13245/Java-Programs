package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UsingCollection {
    public static void main(String[] args) {
        Collection values=new ArrayList();
        values.add(5);
        values.add("new");
        values.add(3.5f);

        Iterator i=values.iterator();
        System.out.println(i.next());
    }
}
