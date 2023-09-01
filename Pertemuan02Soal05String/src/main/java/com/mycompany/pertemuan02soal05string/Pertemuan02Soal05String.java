/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan02soal05string;

/**
 *
 * @author LINDA
 */
import java.util.Scanner;

public class Pertemuan02Soal05String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua string dari pengguna
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        
        // Step 1:(Menghitung jumlah panjang string A dan B
        int sumOfLengths = A.length() + B.length();
        System.out.println(sumOfLengths);
        
        // Step 2: Memeriksa urutan leksikografis antara A dan B
        // Jika A > B dalam urutan leksikografis, maka "Yes", jika tidak, maka "No"
        String result = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(result);
        
        // Mengkapitalisasi huruf pertama dari kedua string
        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        scanner.close();
    }
    
    //Metode pembantu untuk mengkapitalisasi huruf pertama
    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        //Mengubah huruf pertama menjadi huruf besar dan menggabungkannya dengan sisa string
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
