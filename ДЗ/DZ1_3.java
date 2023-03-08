package ДЗ;

import java.util.Scanner;

public class DZ1_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = iScanner.nextInt();
        System.out.println("Введите знак( + | - | / | * ): ");
        String z = iScanner.next();
        char a = '+';
        boolean a1 = z.contains(String.valueOf(a));
        char b = '-';
        boolean b1 = z.contains(String.valueOf(b));
        char c = '/';
        boolean c1 = z.contains(String.valueOf(c));
        char d = '*';
        boolean d1 = z.contains(String.valueOf(d));
        System.out.println("Введите число: ");
        int y = iScanner.nextInt();
        int sum = 0;

        if (a1 == true){
            sum = x + y;
        }
        if (b1 == true){
            sum = x - y;
        }
        if (c1 == true){
            sum = x / y;
        }
        if (d1 == true){
            sum = x * y;
        }
        System.out.println(sum);
        iScanner.close();
    }
}