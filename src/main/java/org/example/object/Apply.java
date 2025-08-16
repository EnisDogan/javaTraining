package org.example.object;

public class Apply {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.horsePower = 1000;
        myCar.marka = "Mercedes";
        myCar.year = 2025;

       // System.out.println(myCar.horsePower + myCar.year + myCar.marka);

        System.out.println(myCar);
        Car myCar1 = new Car();

        myCar1.horsePower = 25000;
        myCar1.marka = "BMW";
        myCar1.year = 2025;

        System.out.println(myCar1.horsePower + myCar1.year + myCar1.marka);
        System.out.println(myCar1);
    }
}
