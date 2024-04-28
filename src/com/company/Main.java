package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


    System.out.println("--------- Witamy w kreatorze zestawu Komputerowego --------");
    System.out.println();
        boolean exit=false;
        do{
    System.out.println("Który z podzespołów chcesz wybrać ?");

    System.out.println("1. Obudowa");
    System.out.println("2. Plyta Glowna");
    System.out.println("3. Zasilacz");
    System.out.println("4. Procesor");
    System.out.println("5. Karta Graficzna");
    System.out.println("6. Zakoncz");



Scanner input = new Scanner(System.in);
String Wybor;
Wybor = input.nextLine();


String PlytaWybor;
String ZasilaczWybor;
String ProcesorWybor;
String KartaWybor;
String ObodowaWybor;


        switch(Wybor){
            case "Obudowa":
            case "1":
                System.out.println("Wybierz Obudowe: ");

                    Obudowy NZXT = new Obudowy();
                    System.out.print("1. ");
                    NZXT.Producent = "NZXT";
                    NZXT.Nazwa = "H5 Flow";
                    NZXT.Koszt = 389;
                    NZXT.Standard = "ATX";
                    NZXT.info();

                    System.out.print("2. ");
                    Obudowy MSI = new Obudowy();
                    MSI.Producent = "MSI";
                    MSI.Nazwa = "Mag Forge 112R";
                    MSI.Koszt = 299;
                    MSI.Standard = "microATX";
                    MSI.info();

                    System.out.print("3. ");
                    Obudowy ENDORFY = new Obudowy();
                    ENDORFY.Producent = "ENDORFY";
                    ENDORFY.Nazwa = "Signum 300 ARGB ";
                    ENDORFY.Koszt = 369;
                    ENDORFY.Standard = "ITX";
                    ENDORFY.info();

                    Scanner input2 = new Scanner(System.in);
                    ObodowaWybor = input.nextLine();

                break;

            case "Plyta Glowna":
            case "2":
                System.out.println("Wybierz Płyte Główną: ");
                System.out.print("1. ");
                PlytaGlowna GIGABYTE = new PlytaGlowna();
                GIGABYTE.Producent = "GIGABYTE";
                GIGABYTE.Nazwa = "Z790 UD AX ";
                GIGABYTE.Koszt = 895;
                GIGABYTE.Standard = "ATX";
                GIGABYTE.info();

                System.out.print("2. ");
                PlytaGlowna ASUS = new PlytaGlowna();
                ASUS.Producent = "GIGABYTE";
                ASUS.Nazwa = "Z790 UD AX ";
                ASUS.Koszt = 532;
                ASUS.Standard = "ATX";
                ASUS.info();

                System.out.print("3. ");
                PlytaGlowna ASROCK = new PlytaGlowna();
                ASROCK.Producent = "ASROCK";
                ASROCK.Nazwa = "B760M";
                ASROCK.Koszt = 679;
                ASROCK.Standard = "microATX ";
                ASROCK.info();

                Scanner input3 = new Scanner(System.in);
                PlytaWybor = input.nextLine();
                break;

            case "Zasilacz":
            case "3":

                System.out.println("Wybierz Zasilacz: ");
                System.out.print("1. ");
                Zasilacz CORSAIR = new Zasilacz();
                CORSAIR.Producent = "CORSAIR";
                CORSAIR.Nazwa = "CV650";
                CORSAIR.Koszt = 299;
                CORSAIR.Moc = 650 ;
                CORSAIR.info();

                System.out.print("2. ");
                Zasilacz ADATA = new Zasilacz();
                ADATA.Producent = "ADATA";
                ADATA.Nazwa = "XPG Core Reactor II";
                ADATA.Koszt = 574;
                ADATA.Moc = 850 ;
                ADATA.info();

                System.out.print("3. ");
                Zasilacz CHIEFTEC = new Zasilacz();
                CHIEFTEC.Producent = "CHIEFTEC";
                CHIEFTEC.Nazwa = "GPX-750FC";
                CHIEFTEC.Koszt = 440;
                CHIEFTEC.Moc = 750 ;
                CHIEFTEC.info();

            Scanner input4 = new Scanner(System.in);
            ZasilaczWybor = input.nextLine();
                break;

            case "Procesor":
            case "4":
                System.out.println("Wybierz Procesor: ");
                System.out.print("1. ");
                Procesor Intel = new Procesor();
                Intel.Producent = "Intel";
                Intel.Nazwa = "Core i5-14500 ";
                Intel.Koszt = 1116;
                Intel.Rdzenie = 14;
                Intel.Watki = 20;
                Intel.Taktowanie = 2.6;
                Intel.TypG = "Socket 1700";
                Intel.info();

                System.out.print("2. ");
                Procesor AMD = new Procesor();
                AMD.Producent = "AMD";
                AMD.Nazwa = "Ryzen 7 7800X3D ";
                AMD.Koszt = 1649;
                AMD.Rdzenie = 8;
                AMD.Watki = 16;
                AMD.Taktowanie = 4.2;
                AMD.TypG = "Socket AM5";
                AMD.info();

                Scanner input5 = new Scanner(System.in);
                ProcesorWybor = input.nextLine();
                break;

            case "Karta Graficzna":
            case "5":

                System.out.println("Wybierz Karte Graficzna: ");
                System.out.print("1. ");
                KartaGraficzna PALIT = new KartaGraficzna();
                PALIT.Producent = "PALIT";
                PALIT.Nazwa = "GeForce RTX 4070";
                PALIT.Koszt = 1649;
                PALIT.TypZ = "PCI Express 4.0 x16 ";
                PALIT.Chlodzenie = "Aktywne";
                PALIT.RAM = 12288;
                PALIT.info();


                System.out.print("2. ");
                KartaGraficzna INNO3D = new KartaGraficzna();
                INNO3D.Producent = "INNO3D";
                INNO3D.Nazwa = "GeForce RTX 4060";
                INNO3D.Koszt = 1799;
                INNO3D.TypZ = "PCI Express 4.0 x8";
                INNO3D.Chlodzenie = "Aktywne";
                INNO3D.RAM = 8192;
                INNO3D.info();


            Scanner input6 = new Scanner(System.in);
            KartaWybor = input.nextLine();
                break;



            case "6":
                exit=true;
                break;

        }


        }while(!exit);



    }

    }
