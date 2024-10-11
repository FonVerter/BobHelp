package Lection15;

public class Pr1integer {

    public static void main(String[] args) {

        int t1 = Integer.MAX_VALUE;
        int t2 = Integer.MIN_VALUE;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("-".repeat(45));

        int t3 = 100;
        System.out.println("шестнадцатеричное представление " + Integer.toHexString(t3));
        System.out.println("двоичное " + Integer.toBinaryString(t3));
        System.out.println("восьмеричное " + Integer.toOctalString(t3));
        System.out.println("-".repeat(45));

        Integer.valueOf(t3); // превратился в объект интежер

        String t4 = "1230432";
        System.out.println("строка с цифрами в число --> "+ Integer.parseInt(t4));

        System.out.println("-".repeat(45));


        int a = 10;
        Integer a1 = 10;

        System.out.println(a == a1);

        Integer a11 = 1032;
        Integer a12 = 1032;
        System.out.println(a11 == a12);




    }
}
