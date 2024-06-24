/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwf.perpustakaan;

/**
 *
 * @author D-17
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new PerpustakaanUmum();
        perpustakaan.pinjamBuku("Petualangan Sirena");
        perpustakaan.kembalikanBuku("Tenggelamnya Kapal Van Der Ser");
        perpustakaan.lihatDaftarBuku();
        
        
        PerpustakaanDigital perpustakaanDigital = new PerpustakaanDigital();
        perpustakaanDigital.pinjamBuku("Upin Dan Budi");
        perpustakaanDigital.kembalikanBuku("Si Buta dari tadi");
        perpustakaanDigital.lihatDaftarBuku();
    }
}
