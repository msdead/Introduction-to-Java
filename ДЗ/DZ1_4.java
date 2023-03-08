package ДЗ;
import java.util.Scanner;

public class DZ1_4 {
    public static void main(String[] args) {
        System.out.println("Введите свое имя: ");
        Scanner iScanner = new Scanner(System.in);
        String x = iScanner.nextLine();
        System.out.println(x);
        iScanner.close();
    }
}