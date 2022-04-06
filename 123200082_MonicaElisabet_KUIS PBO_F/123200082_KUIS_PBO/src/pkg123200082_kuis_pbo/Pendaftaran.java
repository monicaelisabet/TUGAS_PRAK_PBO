/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123200082_kuis_pbo;

/**
 *2
 * 
 * @author Asus
 */
public class Pendaftaran extends CalonPelamar{
    String nik, nama, status, divisi;
    double cdg, tls, wwncr, total;

    public Pendaftaran(char mode) {
        if (mode == '1') {
            super.tulis = 0.2;
            super.coding =  0.5;
            super.wawancara = 0.3;
            this.divisi = "Android";
        } else {
            super.tulis = 0.4;
            super.coding =  0.35;
            super.wawancara = 0.25;
            this.divisi = "Web";
        }
    }

    public void edit(String nik,
                     String nama,
                     double coding,
                     double tulis,
                     double wawancara) {
        this.nik = nik;
        this.nama = nama;
        this.cdg = coding;
        this.tls = tulis;
        this.wwncr = wawancara;
    }

    public void cek() {
        this.total = tls * this.tulis
                + cdg * this.coding
                + wwncr * this.wawancara;
        if ( total < 85) {
            this.status = "GAGAL\nMohon  maaf  kepada " + nama + ", telah ditolak sebagai divisi "
                    + divisi;
        } else {
            this.status = "LOLOS\nSelamat kepada" + nama + "telah diterima sebagai divisi " + divisi ;
        }
    }
}
