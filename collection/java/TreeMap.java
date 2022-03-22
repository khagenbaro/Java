package collection.java;

import com.sun.source.tree.Tree;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Integer, Integer> treeMap = new java.util.TreeMap<>();

        treeMap.put(4, 12);
        treeMap.put(2, 13);
        treeMap.put(1, 35);
        treeMap.put(21, 36);
        treeMap.put(2, 37);
        treeMap.put(1, 38);
        treeMap.put(3, 43);

//        for (Map.Entry<Integer, Integer> i : treeMap.entrySet()) {
//            System.out.println(i);
//        }
        Iterator iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
