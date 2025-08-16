package org.example.object;

public class Car {

    public int year;

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", marka='" + marka + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

    public String marka;
    public int horsePower;



}
