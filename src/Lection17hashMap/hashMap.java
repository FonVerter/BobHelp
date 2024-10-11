package Lection17hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {

    public static void main(String[] args) {


        HashMap <Integer, String> myMap = new HashMap<>();

        myMap.put(1, "privet"); // Добавляем пару
        myMap.put(2, "andrey");
        System.out.println(myMap);

        System.out.println(myMap.get(1)); // получаем значение по ключу

        boolean hasKey = myMap.containsKey(1); // есть ли такой ключ
        System.out.println(hasKey);

        boolean hasValue = myMap.containsValue("andrey"); // есть ли такое значение
        System.out.println(hasValue);

        //myMyp.clear очищает коллекцию

        System.out.println(myMap.size());

        Set<Integer> integers = myMap.keySet(); // возвращает множество ключей
        System.out.println(integers);

        Collection <String> strings = myMap.values(); // возвращает множество элементов
        System.out.println(strings);

        Set<Map.Entry <Integer, String>> xz = myMap.entrySet(); // мапа в виде сета
        System.out.println(xz);


    }






}
