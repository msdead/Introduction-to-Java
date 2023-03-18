package ДЗ;

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DZ4_3 {

    public static Deque <Integer> calculation(Scanner iScanner,Deque <Integer> queue) {
        int x = queue.peekLast();
        System.out.println();
        System.out.println(x);
        System.out.println("Введите знак( + | - | / | * ): ");
        String z = iScanner.next();
        System.out.println("Введите число: ");
        int y = iScanner.nextInt();

        char a = '+';
        boolean a1 = z.contains(String.valueOf(a));
        char b = '-';
        boolean b1 = z.contains(String.valueOf(b));
        char c = '/';
        boolean c1 = z.contains(String.valueOf(c));
        char d = '*';
        boolean d1 = z.contains(String.valueOf(d));
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
        queue.add(sum);
        System.out.println("Результат:");
        System.out.println(sum);
        System.out.println();
        return queue;
    }

    public static Deque <Integer> cancel(Deque <Integer> queue) {
        queue.pollLast();
        int sum = queue.peekLast();
        System.out.println("Результат:");
        System.out.println(sum);
        System.out.println();
        return queue;
    }

    public static void main(String[] args) throws IOException {
        Deque <Integer> queue = new LinkedList<Integer>();
        Scanner iScanner = new Scanner(System.in);
        
        System.out.println("Введите число: ");
        int x = iScanner.nextInt();
        System.out.println("Введите знак( + | - | / | * ): ");
        String z = iScanner.next();
        System.out.println("Введите число: ");
        int y = iScanner.nextInt();

        char a = '+';
        boolean a1 = z.contains(String.valueOf(a));
        char b = '-';
        boolean b1 = z.contains(String.valueOf(b));
        char c = '/';
        boolean c1 = z.contains(String.valueOf(c));
        char d = '*';
        boolean d1 = z.contains(String.valueOf(d));
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
        queue.add(sum);
        System.out.println("Результат:");
        System.out.println(sum);
        
        int choice = 1;
        
        while (choice != 0) {
            System.out.println("Введите необходимое действие: ");
            System.out.println("0. Для завершения работы.");
            System.out.println("1. Для продолжения вычисления.");
            System.out.println("2. Для отмены предыдущего вычисления.");
            
            choice = iScanner.nextInt();
            
            if (choice == 1){
                queue = calculation(iScanner,queue);
            }
            if (choice == 2){
                queue = cancel(queue);
            }
        }
        iScanner.close();
    }
}
