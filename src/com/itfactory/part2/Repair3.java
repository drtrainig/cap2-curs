package com.itfactory.part2;

public class Repair3
{
    public static void main(String[] args)
    {
        CarLot carLot = new CarLot("Dacia Logan", "7524.1233");
        int numarMasini = 5;
        int pretLotMasini = carLot.calculeazaPretulPentruUnNumarDeMasini(numarMasini);
        System.out.println("Pretul pentru lotul de " + numarMasini + " este de: " + pretLotMasini);
    }
}
