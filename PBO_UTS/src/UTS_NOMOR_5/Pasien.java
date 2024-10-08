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
public class Pasien extends Manusia {

    public Pasien(String budi, int par, String jl_Gatot_Subroto, String p001) {
    }
    private String nomorRekamMedis;
    private List<String> riwayatPenyakit = new ArrayList<>();

    // ... konstruktor dan getter/setter

    public void tambahRiwayatPenyakit(String penyakit) {
        riwayatPenyakit.add(penyakit);
    }
}