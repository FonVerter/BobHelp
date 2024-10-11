package Lection15;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1); // добавляет элемент

        list.add(1, 20);

        System.out.println("элемент с индексом \"0\"- " + list.get(0));
        list.set(1, 200); // меняет значение элмента по индексу
        Integer index = list.remove(1); // удаляет по индексу
        System.out.println("я в индексе " + index);
        //list.clear(); // очищает весь список
        boolean contains = list.contains(200); // проверяет, есть ли такой элемент в списке
        System.out.println(contains);

        boolean empty = list.isEmpty(); // проверка на пустой список
        System.out.println(empty);

        int size = list.size();
        System.out.println(size);




        System.out.println(list);


    }
}
