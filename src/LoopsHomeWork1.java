import java.util.Scanner;

public class LoopsHomeWork1 {

    public static void main(String[] args) {


        System.out.println("Введи число");

//        int result = 0;
//        boolean j = true;
//        while (j)
//        {
//            Scanner console = new Scanner(System.in);
//            String summ = console.next();
//            int a = Integer.parseInt(summ);
//            result += a;
//
//            if (summ.equals("ENTER")) {
//                System.out.println(result);
//                j = false;
//            }

//        int result = 0;
//        boolean j = true;
//        while (j) {
//            Scanner console = new Scanner(System.in);
//            String summa = console.nextLine();
//
//            if (summa != "ENTER") {
//                int a = Integer.parseInt(summa);
//                result += a;}
//            else {
//                System.out.println(result);
//                j = false;
////            }
//
//        }
        int result = 0;
        boolean j = true;
        Scanner console = new Scanner(System.in);

        while (j) {

            if (console.hasNextInt()) {
                int a = console.nextInt();
                result += a;
            } else {
                System.out.println(result);
                j = false;
            }


        }

    }
}

