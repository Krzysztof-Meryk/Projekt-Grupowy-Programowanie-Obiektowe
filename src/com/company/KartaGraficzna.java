package com.company;


    public class KartaGraficzna {
        String Producent ;
        String Nazwa;
        int Koszt;
        String TypZ;
        String Chlodzenie;
        int RAM;

        public void infoKarta() {
            System.out.println("Producent: " + Producent + ", Nazwa: " + Nazwa + ", Cena: " + Koszt + ", Typ złącza: " + TypZ + ", Chlodzenie: " + Chlodzenie + ", RAM: " + RAM);
        }
    }
