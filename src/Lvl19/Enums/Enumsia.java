package Lvl19.Enums;

public class Enumsia {


    public static void main(String[] args) {

        String alenaString = Enusss.ALENA.toString();
        System.out.println(alenaString);

        Enusss alenaEnum = Enusss.valueOf(alenaString);
        System.out.println(alenaEnum);
        Class a = alenaEnum.getClass();
        System.out.println(a);

        Enusss alena = Enusss.ALENA;
        int indexAlena = alena.ordinal();
        System.out.println(indexAlena);

        Enusss alenaalena = Enusss.values()[indexAlena];
        System.out.println(alenaalena);

    }

}
