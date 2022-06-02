package Toko_Karo.controller;

import Toko_Karo.DAO.DAO_Toko_Karo;
import Toko_Karo.model.M_Pelanggan_Toko_Karo;
import Toko_Karo.model.M_Table_Model_Pelanggan_Toko_Karo;
import Tampilan_Toko_Karo.view.Tampilan_Pelanggan_Toko_Karo;
import java.util.List;
import javax.swing.JOptionPane;
import Toko_Karo.DAOImplement.Implement_Pelanggan_Toko_Karo;

/**
 */
public class C_Pelanggan_Toko_Karo {
    
    Tampilan_Pelanggan_Toko_Karo frame_pelanggan;
    Implement_Pelanggan_Toko_Karo implement_pelanggan;
    List<M_Pelanggan_Toko_Karo> list_pelanggan;
    
    public C_Pelanggan_Toko_Karo(Tampilan_Pelanggan_Toko_Karo frame_pelanggan) {
        this.frame_pelanggan = frame_pelanggan;
        implement_pelanggan = new DAO_Toko_Karo();
        list_pelanggan = implement_pelanggan.getALL();
    }
    
    //Reset Kosongkan Field
    public void reset() {
        frame_pelanggan.getTxtID().setText("");
        frame_pelanggan.getTxtNamaBarang().setText("");
        frame_pelanggan.getTxtNamaKasir().setText("");
        frame_pelanggan.getTxtQty().setText("");
        frame_pelanggan.getTxtPrice_per_qty().setText("");
        frame_pelanggan.getTxtDiscount().setText("");
        frame_pelanggan.getTxtPrice_total().setText("");
    }
    
    //Tampil Data Ke Tabel
    public void isiTable() {
        list_pelanggan = implement_pelanggan.getALL();
        M_Table_Model_Pelanggan_Toko_Karo tmb = new M_Table_Model_Pelanggan_Toko_Karo(list_pelanggan);
        frame_pelanggan.getTabelDataPelanggan().setModel(tmb);
    }
    
    //Menampilkan Data Yang Di Pilih Dari Tabel
    public void isiField(int row) {
        frame_pelanggan.getTxtID().setText(list_pelanggan.get(row).getId().toString());
        frame_pelanggan.getTxtNamaBarang().setText(list_pelanggan.get(row).getNama_barang());
        frame_pelanggan.getTxtNamaKasir().setText(list_pelanggan.get(row).getNama_kasir());
        frame_pelanggan.getTxtQty().setText(list_pelanggan.get(row).getQty().toString());
        frame_pelanggan.getTxtPrice_per_qty().setText(list_pelanggan.get(row).getPrice_per_qty().toString());
        frame_pelanggan.getTxtDiscount().setText(list_pelanggan.get(row).getDiscount().toString());
        frame_pelanggan.getTxtPrice_total().setText(list_pelanggan.get(row).getPrice_total().toString());
    }
    
    //Insert Data Dari Frame Ke Database
    public void insert() {
        
        if (!frame_pelanggan.getTxtNamaBarang().getText().trim().isEmpty()& !frame_pelanggan.getTxtNamaKasir().getText().trim().isEmpty()& !frame_pelanggan.getTxtNamaKasir().getText().trim().isEmpty()) {
          
        M_Pelanggan_Toko_Karo b = new M_Pelanggan_Toko_Karo();
        b.setId(frame_pelanggan.getTxtID().getText());
        b.setNama_barang(frame_pelanggan.getTxtNamaBarang().getText());
        b.setNama_kasir(frame_pelanggan.getTxtNamaKasir().getText());
        b.setQty(frame_pelanggan.getTxtQty().getText().toString());
        b.setPrice_per_qty(frame_pelanggan.getTxtPrice_per_qty().getText().toString());
        b.setDiscount(frame_pelanggan.getTxtDiscount().getText().toString());
        b.setPrice_total(frame_pelanggan.getTxtPrice_total().getText().toString());

        implement_pelanggan.insert(b);
        JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
        
        } else {
            JOptionPane.showMessageDialog(frame_pelanggan, "Data Tidak Boleh Ada Yang Kosong !");
        }
    }
    
    //Update Data Ketika Data Di Ubah Pada Frame Di Ubah Ke Database
    public void update() {
      
        if (!frame_pelanggan.getTxtID().getText().trim().isEmpty()) {
             
        M_Pelanggan_Toko_Karo b = new M_Pelanggan_Toko_Karo();
        b.setId(frame_pelanggan.getTxtID().getText());
        b.setNama_barang(frame_pelanggan.getTxtNamaBarang().getText());
        b.setNama_kasir(frame_pelanggan.getTxtNamaKasir().getText());
        b.setQty(frame_pelanggan.getTxtQty().getText().toString());
        b.setPrice_per_qty(frame_pelanggan.getTxtPrice_per_qty().getText().toString());
        b.setDiscount(frame_pelanggan.getTxtDiscount().getText().toString());
        b.setPrice_total(frame_pelanggan.getTxtPrice_total().getText().toString());
        implement_pelanggan.update(b);
        
        JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
        } else {
            JOptionPane.showMessageDialog(frame_pelanggan, "Silahkan Pilih Data Yang Akan Di Ubah !");
        }
    }
    
    // Menghapus Data pada Database
    public void delete() {
        if (!frame_pelanggan.getTxtID().getText().trim().isEmpty()) {
            String id = (frame_pelanggan.getTxtID().getText());
            implement_pelanggan.delete(id);
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } else {
            JOptionPane.showMessageDialog(frame_pelanggan, "Silahkan Pilih Data Yang Akan Di Hapus !");
        }
    }
    
    public void isiTableCariNama() {
        list_pelanggan = implement_pelanggan.getCariNama(frame_pelanggan.getTxtCariNamaPelanggan().getText());
        M_Table_Model_Pelanggan_Toko_Karo tmb = new M_Table_Model_Pelanggan_Toko_Karo(list_pelanggan);
        frame_pelanggan.getTabelDataPelanggan().setModel(tmb);
    }
    
    //public void CekHarga(){
//        int pc = 0;
//        int pcc = 0;
//        int pccc = 0;
//        int ab = 0;
//        //M_Pelanggan b = new M_Pelanggan_Toko_Karo();
//        String p = frame_pelanggan.getTxtQty().toString();
//        pc = Integer.parseInt(frame_pelanggan.getTxtQty().getText());
//        //String pp = txtPrice_per_qty.toString();
//         pcc = Integer.parseInt(frame_pelanggan.getTxtPrice_per_qty().getText());
//        String ppp = frame_pelanggan.getTxtDiscount().toString();
//        pccc = Integer.parseInt( frame_pelanggan.getTxtDiscount().getText());
//        ab = ((pc*pcc) - (pc*pcc*pccc/100));
//        //String ac = ab.toString();
//        b.setPrice_Total(frame_pelanggan.getTxtPrice_total().setText(""+ab));
    //}
    
    public void carinama() {
        if (!frame_pelanggan.getTxtCariNamaPelanggan().getText().trim().isEmpty()) {
            implement_pelanggan.getCariNama(frame_pelanggan.getTxtCariNamaPelanggan().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame_pelanggan, "SILAHKAN PILIH DATA !");
        }
    }
}
