
package Temperatur;

import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //boolean menu = true;
        System.out.println("===============================");
        System.out.println("=                             =");
        System.out.println("=  Program Konversi Suhu Air  =");
        System.out.println("=                             =");
        System.out.println("===============================");
        System.out.println("\n------------");
        System.out.println("|Input Data|");
        System.out.println("------------");
        System.out.println("Suhu Dalam Celcius : ");
        double celcius = scanner.nextDouble();
        Konversi konversiAirbef = new Konversi(celcius);
        while (true) {
        System.out.println("\n========");
        System.out.println("= Opsi =");
        System.out.println("========");
        System.out.println("1. Lihat Data Konversi");
        System.out.println("2. Edit data konversi");
        System.out.println("3. Exit");
        System.out.println("Pilih : ");
        int pilih = scanner.nextInt();
            switch (pilih) {
                case 1 -> {
                    System.out.println("Suhu dalam Celcius\t : " + konversiAirbef.celcius + "\t    °C");
                    System.out.println("Suhu dalam Fahrenheit\t : " + konversiAirbef.fahrenheit + "\t    °F");
                    System.out.println("Suhu dalam Reamur\t : " + konversiAirbef.reamur + "\t    °R");
                    System.out.println("Suhu dalam Kelvin\t : " + konversiAirbef.kelvin + "  °K");
                    System.out.println(konversiAirbef.kondisiAir);
                    break;
                }
                case 2 -> {
                    System.out.println("\n------------");
                    System.out.println("|Input Data|");
                    System.out.println("------------");
                    System.out.println("Suhu Dalam Celcius : ");
                    double celciusaft = scanner.nextDouble();
                    Konversi konversiAiraft = new Konversi(celciusaft);
                    System.out.println("Suhu dalam Celcius  : " + konversiAiraft.celcius + "\t°C");
                    System.out.println("Suhu dalam Fahrenheit    : " + konversiAiraft.fahrenheit + "\t°F");
                    System.out.println("Suhu dalam Reamur\t  : " + konversiAiraft.reamur + "\t°R");
                    System.out.println("Suhu dalam Kelvin\t  : " + konversiAiraft.kelvin + "\t°K");
                    System.out.println(konversiAiraft.kondisiAir);
                    break;
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Opsi tidak ada. Mohon masukkan opsi yang tersedia");
            }
        }
    }


}