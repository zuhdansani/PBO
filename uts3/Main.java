/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.zuhdan;

/**
 *
 * @author ACER
 */
public class Main {
    
     public static void main(String[] args) {
     // Polimorfisme dengan Produk
     Produk produk1 = new Elektronik("SoundHoreg", 5000000, 2);
     Produk produk2 = new Makanan("BengawanSolo", 1500, "2024-10-05");
     // Polimorfisme dengan Pegawai
     Pegawai pegawai1 = new PegawaiTetap("Parman", 6500000, 1000000);
     PegawaiKontrak pegawai2 = new PegawaiKontrak("Nasution", 2800000, 12);
     // Menampilkan informasi produk
     System.out.println("Output Produk:");
     produk1.tampilkanInfo();
     System.out.println();
     produk2.tampilkanInfo();
     System.out.println();
     // Menampilkan informasi pegawai
     System.out.println("Output Pegawai:");
     pegawai1.tampilkanInfo();
     System.out.println();
     pegawai2.tampilkanInfo();
 }
}

