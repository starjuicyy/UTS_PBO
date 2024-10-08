/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_2;

/**
 *
 * @author Bintang
 */
    public class SepedaMotor extends Kendaraan {

        public SepedaMotor(int kecepatanMaksimal) {
            super(kecepatanMaksimal);
        }

        @Override
        public void bergerak() {
            System.out.println("Sepeda motor meluncur di aspal...");
        }
    }