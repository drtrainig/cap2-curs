package com.itfactory.part1;

public class SimpleMaths {
    private int firstOperand;
    private int secondOperand;

    public SimpleMaths()
    {
    }

    public SimpleMaths(int firstOperand, int secondOperand)
    {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public int sum()
    {
        return firstOperand + secondOperand;
    }

    public int difference()
    {
        return firstOperand - secondOperand;
    }

    public int times()
    {
        return firstOperand * secondOperand;
    }

    public int divide()
    {
        return firstOperand / secondOperand;
    }

    public void setFirstOperand(int firstOperand)
    {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(int secondOperand)
    {
        this.secondOperand = secondOperand;
    }

    public void printSum()
    {
        System.out.println("Suma celor doua numere este: " + sum());
    }

    public void printDifference()
    {
        System.out.println("Diferenta celor doua numere este: " + difference());
    }

    public void printTimes()
    {
        System.out.println("Produsul celor doua numere este: " + times());
    }

    public void printDevide()
    {
        System.out.println("Catul celor doua numere este: " + divide());
    }

    public static void main(String[] args)
    {
        SimpleMaths simpleMaths1 = new SimpleMaths();
        simpleMaths1.setFirstOperand(10);
        simpleMaths1.setSecondOperand(5);
        simpleMaths1.printSum();
        simpleMaths1.printDifference();
        simpleMaths1.printTimes();
        simpleMaths1.printDevide();

        SimpleMaths simpleMaths2 = new SimpleMaths(20,5);
        simpleMaths2.printSum();
        simpleMaths2.printDifference();
        simpleMaths2.printTimes();
        simpleMaths2.printDevide();

    }
}
