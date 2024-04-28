package com.company;

public class Procesor {
    String Producent = "Default";
    String Nazwa;
    int Koszt;
    int Rdzenie;
    int Watki;
    double Taktowanie;
    String TypG;
    public void info() {
        System.out.println("Producent: " + Producent + ", Nazwa: " + Nazwa + ", Cena: " + Koszt + ", Liczba Rdzeni: " + Rdzenie + ", Liczba Wątków: " + Watki + "Taktowanie: " + Taktowanie + ", Typ Gniazda: " + TypG);
    }
}
