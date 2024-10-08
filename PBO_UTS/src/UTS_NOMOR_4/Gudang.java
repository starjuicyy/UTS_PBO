/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bintang
 */
public class Gudang {
    private String lokasiGudang;
    private List<Produk> daftarProduk = new ArrayList<>();

    public Gudang(String lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
    }

    // ... konstruktor dan getter/setter
    
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
}