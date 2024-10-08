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
public class Produk {
    private String namaProduk;
    private double harga;
    private int stok;
    private List<Gudang> gudangList = new ArrayList<>();
    private List<Kategori> kategoriList = new ArrayList<>();

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // ... konstruktor dan getter/setter
    
    public void tambahKeGudang(Gudang gudang) {
        gudangList.add(gudang);
        gudang.tambahProduk(this);
    }

    public void tambahKeKategori(Kategori kategori) {
        kategoriList.add(kategori);
        kategori.tambahProduk(this);
    }
}
