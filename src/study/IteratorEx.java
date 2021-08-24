package study;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        Iterator it = list.iterator();

        while (it.hasNext()) {
            copy1.add(it.next());
        }

        it = list.iterator(); //Iterator은 재사용이 안되므로, 다시 얻어와야 한다.

        while (it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }
    }
}
