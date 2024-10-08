/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_3;

/**
 *
 * @author Bintang
 */
public class TransferBank extends Transaksi implements Pembayaran {

    public TransferBank(String string, String bca) {
    }

    private String nomorRekening;
    private String namaBank;

    @Override
    public boolean validasiPembayaran() {
        // Implementasi validasi nomor rekening dan nama bank
        return isValidBankAccount(nomorRekening, namaBank);
    }

    private boolean isValidBankAccount(String nomorRekening, String namaBank) {
        // Validasi Biasa
        if (nomorRekening == null || nomorRekening.isEmpty() || namaBank == null || namaBank.isEmpty()) {
            return false; // Kesalahan Input
        }

        // Cek untuk mengetahui
        if (namaBank.equalsIgnoreCase("Bank Mandiri")) {

        } else if (namaBank.equalsIgnoreCase("Bank BCA")) {

        } else if (namaBank.equalsIgnoreCase("Bank BRI")) {

        }
        return true; 
    }
}
