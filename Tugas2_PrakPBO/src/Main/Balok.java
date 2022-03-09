package Main;

/**
 *
 * @author Asus
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi, hasilVol, hasilL_Permukaan;
    
    public Balok(double p, double l, double t){
        super(p , l);
        tinggi = t;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVol() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double hitungL_Permukaan() {
        return 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}
