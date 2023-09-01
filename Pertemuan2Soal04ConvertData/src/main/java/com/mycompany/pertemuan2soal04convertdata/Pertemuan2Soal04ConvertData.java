/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan2soal04convertdata;

/**
 *
 * @author LINDA
 */
public class Pertemuan2Soal04ConvertData {

    // Cara untuk mengonversi dari long ke short
    static short methodOne(long l)
    {
        int i = (int) l;  // Mengonversi dari long ke int
        return (short)i;  // Mengonversi dari int ke short
    }
    public static void main(String[] args)
    {
        double d = 10.25; // Mendeklarasikan variabel d bertipe double dengan nilai 10.25
        float f = (float) d;  // Mengonversi dari double ke float
        byte b = (byte) methodOne((long) f); // Mengonversi dari float ke long melalui metode, lalu dari long ke byte
        System.out.println(b); // Mencetak nilai b ke layar
    }
}
