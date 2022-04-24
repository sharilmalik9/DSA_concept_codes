package com.company;
import java.util.*;

public class has_map_func_check {
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>();

        map.put("A1", 100);
        map.put("BOB!!", 110);
        map.put("CAR~~", 1);
        map.put("CAR~1~", 143);
        map.put("0CAR~~", 6);
        map.put("2CAR~~", 78);
        System.out.println(map);
//		Keys unique!!
        // value change i a1 as keys are unique
        map.put("A1", 99);
        System.out.println(map);
       // check if map contains key ("A2")?!
                System.out.println(map.containsKey("A2"));
//		get the value of key ("A4")
        System.out.println(map.get("A909"));
        System.out.println(map.get("A1"));
//		delete pair!!
        map.remove("A1");
        System.out.println(map);
       // how to get all keys ?!
        Set<String> Keys = map.keySet();
        ArrayList<String> KK = new ArrayList<>(Keys);
        for(String Key: Keys) {
            System.out.println(Key);
        }
        System.out.println("======");
        for(String Key: map.keySet()) {
            System.out.println(Key);
        }
//		AL. all elements are unique

    }
}
