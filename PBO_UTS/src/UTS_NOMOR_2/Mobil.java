/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_2;

/**
 *
 * @author Bintang
 */
public class Mobil extends Kendaraan {

        public Mobil(int kecepatanMaksimal) {
            super(kecepatanMaksimal);
        }

        @Override
        public void bergerak() {
            System.out.println("Mobil melaju di jalan raya...");
        }
    }