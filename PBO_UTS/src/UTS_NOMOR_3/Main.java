/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_3;

/**
 *
 * @author Bintang
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek KartuKredit
        KartuKredit kartuKredit = new KartuKredit("1234567890123456", "Bintang Asyrof", 12, 2025, 123);

        // Membuat objek DompetDigital
        DompetDigital dompetDigital = new DompetDigital("D123456789", "tatangacerop@example.com");

        // Membuat objek TransferBank
        TransferBank transferBank = new TransferBank("1234567890", "BCA");

        // Melakukan validasi pembayaran
        if (kartuKredit.validasiPembayaran()) {
            System.out.println("Pembayaran dengan kartu kredit berhasil");
        } else {
            System.out.println("Pembayaran dengan kartu kredit gagal");
        }

        if (dompetDigital.validasiPembayaran()) {
            System.out.println("Pembayaran dengan dompet digital berhasil");
        } else {
            System.out.println("Pembayaran dengan dompet digital gagal");
        }

        if (transferBank.validasiPembayaran()) {
            System.out.println("Pembayaran dengan transfer bank berhasil");
        } else {
            System.out.println("Pembayaran dengan transfer bank gagal");
        }
    }
}
