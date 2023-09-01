/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan2soal02constants;

/**
 *
 * @author LINDA
 */
public class Pertemuan2Soal02Constants {
    public static void main(String[] args) {
    final double CM_PER_INCH = 2.54;   // Deklarasi dan inisialisasi konstanta CM_PER_INCH dengan nilai 2.54
    double paperWidth = 8.5;  // Deklarasi dan inisialisasi variabel paperWidth dengan nilai 8.5
    double paperHeight = 11;  // Deklarasi dan inisialisasi variabel paperHeight dengan nilai 11

    // Menghitung dan mencetak ukuran kertas dalam sentimeter dengan mengalikan lebar dan tinggi kertas dengan CM_PER_INCH
    System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
   } 
}
