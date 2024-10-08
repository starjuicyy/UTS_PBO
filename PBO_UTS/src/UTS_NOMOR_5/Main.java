/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_5;

/**
 *
 * @author Bintang
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek
        Dokter dokter = new Dokter("Andi", 30, "Jl. Sudirman", "Spesialis Penyakit Dalam", "12345");
        Pasien pasien1 = new Pasien("Budi", 25, "Jl. Gatot Subroto", "P001");
        Pasien pasien2 = new Pasien("Cici", 35, "Jl. Ahmad Yani", "P002");

        // Menambahkan riwayat penyakit
        pasien1.tambahRiwayatPenyakit("Demam");
        pasien1.tambahRiwayatPenyakit("Flu");

        // Membuat ruangan
        Ruangan ruangan = new Ruangan(101, 20);

        // Menambahkan pasien ke ruangan
        try {
            ruangan.tambahPasien(pasien1);
            ruangan.tambahPasien(pasien2);
        } catch (RuanganPenuhException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Melakukan diagnosa
        String diagnosa = dokter.diagnosaPenyakit(pasien1);
        System.out.println(diagnosa);

        // Menampilkan informasi pasien di ruangan
        System.out.println("Pasien di ruangan " + ruangan.getNomorRuangan() + ":");
        for (Pasien pasien : ruangan.getDaftarPasien()) {
            pasien.tampilkanInformasi();
        }
    }
}