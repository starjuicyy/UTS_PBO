/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_2;

/**
 *
 * @author Bintang
 */
public class Main {

        public static void main(String[] args) {
            Kendaraan kendaraan1 = new Mobil(200);
            Kendaraan kendaraan2 = new SepedaMotor(120);
            Kendaraan kendaraan3 = new Truk(80, 10000);

            kendaraan1.bergerak();
            kendaraan2.bergerak();
            kendaraan3.bergerak();
        }
    }
