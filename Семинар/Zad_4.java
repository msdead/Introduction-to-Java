// Дано четное число N (>0) и символы с1 и с2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов с1 и с2, начиная с с1.

package Семинар;

import java.util.Scanner;


public class Zad_4 {
    public static String builders(String a, String b, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N/2; i++) {
            sb.append(a);
            sb.append(b);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.printf("Введите число N: ");
        Scanner iScanner = new Scanner(System.in);
        int N = iScanner.nextInt();
        String a = "c1", b = "c2";
        System.out.printf(builders(a, b, N));
        iScanner.close();
    }
}
