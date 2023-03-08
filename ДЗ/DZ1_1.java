package ДЗ;

import java.util.Scanner;

public class DZ1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = iScanner.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i < n + 1; i++) {
            sum = sum + i;
            product = product * i;            
        }
        System.out.println(sum);
        System.out.println(product);
        iScanner.close();
    }
}