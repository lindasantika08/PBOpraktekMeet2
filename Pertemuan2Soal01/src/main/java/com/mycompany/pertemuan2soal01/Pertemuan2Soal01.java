/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan2soal01;

/**
 *
 * @author LINDA
 */

import java.util.Scanner;

public class Pertemuan2Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Membaca umlah test case dari input

        // loop untuksetiap test case
        for (int i = 0; i < t; i++) {
            try {
                long n = scanner.nextLong(); // Nilai input
                
                System.out.println(n + " can be fitted in:");
                
                // Pengecekan tipe data yang cocok untuk nilai 'n'
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Tangkap kesalahan jika terjadi dan beri pesan
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}

