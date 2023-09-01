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
        
        // Input strings
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        
        // Step 1: Sum of lengths
        int sumOfLengths = A.length() + B.length();
        System.out.println(sumOfLengths);
        
        // Step 2: Check lexicographical order
        String result = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(result);
        
        // Step 3: Capitalize the first letters
        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        scanner.close();
    }
    
    // Helper method to capitalize the first letter
    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
