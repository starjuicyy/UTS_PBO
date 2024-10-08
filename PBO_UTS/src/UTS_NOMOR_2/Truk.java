/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NOMOR_2;

/**
 *
 * @author Bintang
 */
    public class Truk extends Kendaraan {

        private int kapasitasMuatan;

        public Truk(int kecepatanMaksimal, int kapasitasMuatan) {
            super(kecepatanMaksimal);
            this.kapasitasMuatan = kapasitasMuatan;
        }

        // Getter untuk kapasitasMuatan
        public int getKapasitasMuatan() {
            return kapasitasMuatan;
        }

        // Setter untuk kapasitasMuatan
        public void setKapasitasMuatan(int kapasitasMuatan) {
            this.kapasitasMuatan = kapasitasMuatan;
        }

        @Override
        public void bergerak() {
            System.out.println("Truk mengangkut barang di jalan raya...");
        }
    }