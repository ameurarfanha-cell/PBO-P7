/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 *
 * @author OS
 */
class Mobil {
    String merk;
    String warna;

    Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    void tampil() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Mobil m1 = new Mobil("Toyota", "Merah"); // objek 1
        Mobil m2 = new Mobil("Honda", "Hitam");  // objek 2
        m1.tampil();
        m2.tampil();
    }
}
