package Lection15;

public class Pr2double {



    public static void main(String[] args) {

        Double d1 = Double.MAX_VALUE; // мин значение
        Double d2 = Double.MIN_VALUE; // макс значение
        Double d3 = Double.NEGATIVE_INFINITY; // + - бесконечности
        Double d4 = Double.POSITIVE_INFINITY;
        Integer d5 = Double.MAX_EXPONENT; // экспоненты
        Integer d6 = Double.MIN_EXPONENT; //

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println("-".repeat(50));

        String d11 = Double.toHexString(d1); // шестнадцатеричное представление
        System.out.println(d11);

        boolean d12 = Double.isFinite(d4);
        System.out.println(d12); // передали бесконечность?

        double d111 = 0.4;
        Double d222 = Double.valueOf(d111);



    }


}
