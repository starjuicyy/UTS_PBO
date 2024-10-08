/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bintang
 */
public class Ruangan {

    public Ruangan(int par, int par1) {
    }
    private int nomorRuangan;
    private int kapasitas;
    private List<Pasien> daftarPasien = new ArrayList<>();

    // ... konstruktor dan getter/setter

    public void tambahPasien(Pasien pasien) throws RuanganPenuhException {
        if (daftarPasien.size() >= kapasitas) {
            throw new RuanganPenuhException("Ruangan sudah penuh");
        }
        daftarPasien.add(pasien);
    }

    public int getNomorRuangan() {
        return nomorRuangan;
    }

    public Iterable<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
}