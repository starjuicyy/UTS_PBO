/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_3;

/**
 *
 * @author Bintang
 */
public class DompetDigital extends Transaksi implements Pembayaran {

    public DompetDigital(String d123456789, String johndoeexamplecom) {
    }
    private String nomorDompet;
    private double saldo;

    @Override
    public boolean validasiPembayaran() {
        return saldo >= nominalTransaksi;
    }
}
