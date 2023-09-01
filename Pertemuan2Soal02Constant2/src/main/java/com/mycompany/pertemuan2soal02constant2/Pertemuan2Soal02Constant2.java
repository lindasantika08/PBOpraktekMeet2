/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan2soal02constant2;

/**
 *
 * @author LINDA
 */
public class Pertemuan2Soal02Constant2 {

    public static final double CM_PER_INCH = 2.54; // Konstanta untuk mengonversi inci ke sentimeter
    public static void main(String[] args) {
        double paperWidth = 8.5;  // Deklarasi variabel lebar kertas dalam inci
        double paperHeight = 11;  // Deklarasi variabel tinggi kertas dalam inci
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);  // Menghitung dan mencetak ukuran kertas dalam sentimeter
        }
}

