package Toko_Karo.DAOImplement;

import Toko_Karo.model.M_Pelanggan_Toko_Karo;
import java.util.List;

/**
 */

public interface Implement_Pelanggan_Toko_Karo {
    public void insert(M_Pelanggan_Toko_Karo b);

    public void update(M_Pelanggan_Toko_Karo b);

    public void delete(String id);
    
    //public void CekHarga(M_Pelanggan_Toko_Karo b);

    public List<M_Pelanggan_Toko_Karo> getALL();

    public List<M_Pelanggan_Toko_Karo> getCariNama(String nama);
}
