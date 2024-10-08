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
public class Kategori {
    private String namaKategori;
    private List<Produk> daftarProduk = new ArrayList<>();

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    // ... konstruktor dan getter/setter
    
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }
}