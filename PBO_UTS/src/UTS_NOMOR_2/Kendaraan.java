/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_NOMOR_2;

/**
 *
 * @author Bintang
 */
public class Kendaraan {

    private int kecepatanMaksimal;

    public Kendaraan(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public int getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }

    public void setKecepatanMaksimal(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak...");
    }
}
    




    
