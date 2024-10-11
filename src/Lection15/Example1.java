package Lection15;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {


        ArrayList <Integer> myList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            myList.add(i);
        }

        System.out.println(myList);



        ArrayList<Object> objects = new ArrayList<>();


        int [] aa = new int[10];
        int [] aaa = new int[2];

        int [] beginArray = new int[20];

        //int  j = 0;
        for (int i = 0; i < beginArray.length; i++) {
            beginArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(beginArray));

        int result = 0;
        for (int i = 0; i < beginArray.length; i++) {

            result = result + beginArray[i];

        }

        System.out.println(result);

    }
}
