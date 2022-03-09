package Main;

/**
 *
 * @author Asus
 */
public class Lingkaran implements MenghitungBangun {
    private double jari, hasilLuas, hasilKel;
    
    public Lingkaran(double r){
        jari = r;
    }
    
    // Encaptulation
    public void setJari(int r){
        jari = r;
    }
    
    public double getJari(){
        return jari;
    }
    
    public double getDiameter(){
        return 2*jari;
    }

    @Override
    public double hitungLuas() {
        hasilLuas = PHI * (jari * jari);
        return hasilLuas;
    }

    @Override
    public double hitungKeliling() {
        return hasilKel = PHI * (2*jari);
    }
}
