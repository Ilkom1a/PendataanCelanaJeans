/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataancelanajeans;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PendataanCelanaControl {
    String[] header = {"Nama Konsumen", "Alamat", "Jenis Celana", "Ukuran", "QTY", "Harga"};
    public interface PendataanCelana {
    public void read (JTable tb);
    public void create(PendataanCelana Hary);
    public void update(PendataanCelana Hary);
    public void delete(String Alamat);
    public void search(JTable tblDATA, String Namakonsumen);
    }
    private ArrayList<PendataanCelanaJeans> list = new ArrayList();
    
//  untuk menampilkan data pada tabel
    public void read(JTable tb) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);

        for (int i = 0; i < list.size(); i++) {
            Object[] Hary = new Object[6];
            Hary[0] = list.get(i).getNamakonsumen();
            Hary[1] = list.get(i).getAlamat();
            Hary[2] = list.get(i).getJeniscelana();
            Hary[3] = list.get(i).getUkuran();
            Hary[4] = list.get(i).getQty();
            Hary[5] = list.get(i).getHarga();
            dtm.addRow(Hary);
        }
        tb.setModel(dtm);
    }
    //  untuk menambahkan data
    public void create(PendataanCelanaJeans br) {
        list.add(br);
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
    }
    //  untuk ubah data
    public void update(PendataanCelanaJeans br) {
        for (int i = 0; i < list.size(); i++) {
            if (br.getNamakonsumen() == list.get(i).getNamakonsumen()) {
                list.set(i, br);
            }
        }

        JOptionPane.showMessageDialog(null, "Berhasil Diubah!");
    }

    //  untuk ubah data
    public void delete(int Qty) {
        for (int i = 0; i < list.size(); i++) {
            if ( Qty == list.get(i).getQty()) {
                list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Berhasil Dihapus!");
    }

//    untuk melakukan pencarian berdasarkan ID BARANG
    public void search(JTable tb, int Qty) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);

        for (int i = 0; i < list.size(); i++) {
            if (Qty == list.get(i).getQty()) {
                Object[] Hary = new Object[6];
            Hary[0] = list.get(i).getNamakonsumen();
            Hary[1] = list.get(i).getAlamat();
            Hary[2] = list.get(i).getJeniscelana();
            Hary[3] = list.get(i).getUkuran();
            Hary[4] = list.get(i).getQty();
            Hary[5] = list.get(i).getHarga();
            dtm.addRow(Hary);
            }
        }

        tb.setModel(dtm);
    }
}

