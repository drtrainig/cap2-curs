package com.itfactory.part2;

public class CarLot
{
    private String brand;
    private double price;

    public CarLot() {}

    public void mergePeDrum() {
        System.out.println("Masina " + brand + " merge pe drum. Masina are pretul " + price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public  void setPrice(double price) {
        this.price = price;
    }

    public String getBrand()
    {
        return brand;
    }

    public double getPrice()
    {
        return price;
    }

    public double calculeazaPretulPentruUnNumarDeMasini(int numarMasini)
    {
        return price * numarMasini;
    }

}
