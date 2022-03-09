package Main;


import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int ulang;
        do{
            
            System.out.println("==================");
            System.out.println("=                =");
            System.out.println("=   Menu Utama   =");
            System.out.println("=                =");
            System.out.println("==================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");

            System.out.print("Pilih: ");
            int pilih = in.nextInt();

            switch(pilih){
                case 1:
                    double pjg, lbr, tngi;
                    System.out.print("Input Panjang: ");
                    pjg = in.nextInt();
                    System.out.print("Input Lebar: ");
                    lbr = in.nextInt();
                    System.out.print("Input Tinggi: ");
                    tngi = in.nextInt();
                    Balok b = new Balok(pjg, lbr, tngi);

                    System.out.println("Luas Persegi Panjang= " + b.hitungLuas());
                    System.out.println("Keliling Persegi Panjang= " + b.hitungKeliling());
                    System.out.println("Volume Balok= " + b.hitungVol());
                    System.out.println("Luas Permukaan Balok= " + b.hitungL_Permukaan());
                    break;
                case 2:
                    double r;
                    System.out.print("Input Tinggi: ");
                    tngi = in.nextInt();
                    System.out.print("Input Jari - jari: ");
                    r = in.nextInt();
                    Tabung tbg = new Tabung(r, tngi);

                    System.out.println("Luas Lingkaran= " + tbg.hitungLuas());
                    System.out.println("Keliling Lingkaran= " + tbg.hitungKeliling());
                    System.out.println("Volume Tabung= " + tbg.hitungVol());
                    System.out.println("Luas Permukaan Tabung= " + tbg.hitungL_Permukaan());
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulang = in.nextInt();
        }while(ulang == 1);
    }
}
