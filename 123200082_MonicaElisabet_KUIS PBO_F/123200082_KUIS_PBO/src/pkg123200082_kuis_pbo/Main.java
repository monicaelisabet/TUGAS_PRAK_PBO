package pkg123200082_kuis_pbo;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char menu, menu2;
        String nik, nama;
        double tulis, coding, wawancara;
        do {
            System.out.println("FORM PENDAFTARAN PT. KARO DEV");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.println("0. exit");
            System.out.print("Pilih jenis Form: ");

            menu = in.next().charAt(0);
            if (menu == '0') {
                System.exit(0);
            }
            Pendaftaran pendaftar = null;
            if (menu == '1') {
                pendaftar = new Pendaftaran(menu);
            } else if (menu == '2') {
                pendaftar = new Pendaftaran(menu);
            }

            System.out.println("");
            System.out.println("FORM INPUT DATA");
            System.out.println("");

            System.out.print("Input NIK: ");
            nik = in.next();
            System.out.print("Input Nama: ");
            in.nextLine();
            nama = in.nextLine();
            System.out.print("Nilai tes Tulis: ");
            tulis = in.nextDouble();
            System.out.print("Nilai tes Coding: ");
            coding = in.nextDouble();
            System.out.print("Nilai tes Wawancara: ");
            wawancara = in.nextDouble();

            pendaftar.edit(nik, nama, coding, tulis, wawancara);

            if (menu == '1') {
                pendaftar.cek();
            } else if (menu == '2') {
                pendaftar.cek();
            }
            do {
                
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("0. Exit");
                System.out.print("Pilih : ");
                menu2 = in.next().charAt(0);

                if (menu2 == '1') {
                    System.out.print("Nilai tes Tulis: ");
                    tulis = in.nextDouble();
                    System.out.print("Nilai tes Coding: ");
                    coding = in.nextDouble();
                    System.out.print("Nilai tes Wawancara: ");
                    wawancara = in.nextDouble();
                    in.nextLine();

                    pendaftar.edit(nik, nama, coding, tulis, wawancara);

                    if (menu == '1') {
                        pendaftar.cek();
                    } else if (menu == '2') {
                        pendaftar.cek();
                    }
                } else if (menu2 == '2') {
                    System.out.println("\nNilai akhir: " + pendaftar.total);
                    System.out.println("KETERANGAN : " + pendaftar.status + "\n");
                }
            } while (menu2 != '0');
            System.out.println("");
        } while (menu != '0');
        System.out.println("");
    }

}

