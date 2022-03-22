package collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Test {
    public static void main(String[] args) {
        /** CRUD on  List*/
        List<Integer> integerList = new ArrayList<>();
        integerList.add(34);
        integerList.add(14);
        integerList.add(15);
        integerList.add(16);
        integerList.add(12);
/**       Using Iterator method
 * */
        System.out.println(integerList);
        Iterator<Integer> it = integerList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /**       Using for loop  method
         * */
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        /**       Using for Each loop method
         * */
        for (Integer i : integerList) {
            System.out.println(i);
        }
        integerList.set(2,33);
        System.out.println("@ index 2 "+integerList.get(2));
        int x = integerList.remove(2);
        System.out.println(x + " is removed");
        List stringList = new ArrayList();
        stringList.add("addd");
        stringList.add(12);
        System.out.println(stringList);

        ArrayList<ArrayList<Integer>> arrayListArrayList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> inner = new ArrayList<>();
        ArrayList<Integer> outer = new ArrayList<>();
        inner.add(13);
        inner.add(14);
        inner.add(15);
        inner.add(16);
        arrayListArrayList.add(inner);
        System.out.println("Array of ArrayList");
        System.out.println(arrayListArrayList);

    }
}
