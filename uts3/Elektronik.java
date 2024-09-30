/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.zuhdan;

/**
 *
 * @author ACER
 */
public class Elektronik extends Produk {
    private int garansi; // garansi dalam tahun
    public Elektronik(String namaProduk, double harga, int garansi) {
    super(namaProduk, harga);
    this.garansi = garansi;
    }
    @Override
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Garansi: " + garansi + " tahun");
 }
}
