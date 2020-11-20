/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataancelanajeans;

public class PendataanCelanaJeans {
    private String namakonsumen;
    private String alamat;
    private String jeniscelana;
    private String ukuran;
    private int qty;
    private int harga;

    public String getNamakonsumen() {
        return namakonsumen;
    }

    public void setNamakonsumen(String namakomsumen) {
        this.namakonsumen = namakomsumen;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniscelana() {
        return jeniscelana;
    }

    public void setJeniscelana(String jeniscelana) {
        this.jeniscelana = jeniscelana;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getHarga() {
        return harga*qty;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }   
}
