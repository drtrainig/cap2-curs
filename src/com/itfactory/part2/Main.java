package com.itfactory.part2;

public class Main {
    public static void main(String[] args) {

        CarLot carLot = new CarLot();
        carLot.setBrand("Fiat");
        carLot.setPrice(7500.123);
        carLot.mergePeDrum();

        CarLot masina = new CarLot();
        masina.setBrand("Dragos");
        masina.setPrice(7500.123);
        masina.mergePeDrum();



    }
}
