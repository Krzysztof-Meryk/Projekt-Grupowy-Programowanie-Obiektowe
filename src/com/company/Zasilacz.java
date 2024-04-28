package com.company;

public class Zasilacz {
    String Producent = "Default";
    String Nazwa;
    int Koszt;
    int Moc;
    public void info() {
        System.out.println("Producent: " + Producent + ", Nazwa: " + Nazwa + ", Cena: " + Koszt + ", Moc: " + Moc);
    }
}
