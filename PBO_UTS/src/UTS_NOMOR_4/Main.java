/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_4;

/**
 *
 * @author Bintang
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Buku Java", 100000, 50);
        Produk produk2 = new Produk("Buku Matdis", 15000, 10);
        
        Gudang gudang1 = new Gudang("Jakarta");
        Gudang gudang2 = new Gudang("Bandung");

        Kategori kategori1 = new Kategori("Programming");
        Kategori kategori2 = new Kategori("Teknologi");

        produk1.tambahKeGudang(gudang1);
        produk1.tambahKeGudang(gudang2);
        produk1.tambahKeKategori(kategori1);
        produk1.tambahKeKategori(kategori2);

        // ... dan seterusnya
    }
}