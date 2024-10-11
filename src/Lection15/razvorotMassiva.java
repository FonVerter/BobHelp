package Lection15;

import java.util.ArrayList;

public class razvorotMassiva {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println("массив после добавления из цикла  " + arrayList);

        int n = arrayList.size() - 1; //переменная, нужная для обращения к крайнему правому значению
        for (int i = 0; i < arrayList.size() / 2; i++) {
            int temp = arrayList.get(i);

            arrayList.set(i, arrayList.get(n-i));
            arrayList.set(n-i, temp);

        }

        System.out.println("лист после реверса " + arrayList );

    }


}
