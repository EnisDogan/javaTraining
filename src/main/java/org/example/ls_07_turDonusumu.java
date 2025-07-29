package org.example;

public class ls_07_turDonusumu {
    public static void main(String[] args) {

        // String -> int, int -> String vs vs
/*
        String a = "5";
        String b = "10";

        System.out.println(a + b);
        //510 yazicak cunku ikiside String, o yuzden yanyana koyar

 */
        /*
        String a = "5";

        // int b = Integer.valueOf(a); //yada
        //int b = Integer.parseInt(a);

        System.out.println(b + 2);


        //7 yazicak cunku "a" int e donustu ve artik toplamna yapabilir

         */
/*
        int a = 21;
        String b = String.valueOf(a);

        System.out.println(b + 2);

 */
/*
        double a = 5.50;

        int b = (int)a;

        System.out.println(b);

        int a = 5;
        double b = (double)a;
        System.out.println(b);

        float a = 5.12f;
        long b = (long)a;
        System.out.println(b);

        //vs vs...

 */
      /*
        long a = 5;
        String b = String.valueOf(a);
        System.out.println(b + 2);

       */

        byte a = 55;
        String b = Byte.toString(a);
        System.out.println(b + 2);




    }
}
