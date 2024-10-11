package Lection17hashMap;

import java.util.HashMap;
import java.util.Map;

public class LoopHashSet {

    public static void main(String[] args) {


        HashMap <String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("aa",2);
        map.put("aaa",3);
        map.put("aaaa",4);
        map.put("aaaaa",5);

        for (String s : map.keySet()) {
            Integer value = map.get(s);
            System.out.println("ключи ---" + s + " значения ---- " + value);
        }


    }




}
