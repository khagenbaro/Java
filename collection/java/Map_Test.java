package collection.java;

import java.util.HashMap;
import java.util.Map;

public class Map_Test {
    public static void main(String[] args) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        int value = (int) (10 * Math.random());
        for (int i = 0; i < 10; i++) {
            integerMap.put(i, randomValue());
        }

        System.out.println(integerMap);

        for (Map.Entry<Integer, Integer> i : integerMap.entrySet()) {
            System.out.println(i);
        }
        integerMap.remove(3);
        System.out.println(integerMap);
        Map<Integer, Integer> mapList = new HashMap<>();
        mapList.put(1, 2);
        mapList.put(1, 4);
        System.out.println(mapList);


    }


    private static Integer randomValue() {
        return (int) (10 * Math.random());
    }
}
