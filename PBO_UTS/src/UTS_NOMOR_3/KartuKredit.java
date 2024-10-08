/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_3;

/**
 *
 * @author Bintang
 */
public class KartuKredit extends Transaksi implements Pembayaran {


    public KartuKredit(String string, String john_Doe, int par, int par1, int par2) {
    }

    private String nomorKartu;

    @Override
    public boolean validasiPembayaran() {
        String cardNumber = "1234567890123456";
        if (LuhnAlgorithm.isValid(cardNumber)) {
            System.out.println("Nomor kartu valid");
        } else {
            System.out.println("Nomor kartu tidak valid");
        }
        return isValidCardNumber(nomorKartu);
    }

    private boolean isValidCardNumber(String nomorKartu) {
    if (nomorKartu == null || nomorKartu.isEmpty()) {
        return false; // Nomor kartu tidak valid jika nol atau kosong
    }

    int sum = 0;
    boolean alternate = false;

    for (int i = nomorKartu.length() - 1; i >= 0; i--) {
        int digit = Character.digit(nomorKartu.charAt(i), 10);
        if (alternate) {
            digit *= 2;
            if (digit > 9) {
                digit -= 9;
            }
        }
        sum += digit;
        alternate = !alternate;
    }

    return (sum % 10) == 0;
}

    
}
