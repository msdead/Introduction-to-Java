package ДЗ;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DZ4_1 {
    public static  Deque <String> revers(Deque <String> queue) {
        Deque <String> newqueue = new LinkedList<String>();
        while(! queue.isEmpty()) {
            String str = queue.pollLast();
            newqueue.add(str);
            }
        return newqueue;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Deque <String> queue = new LinkedList<String>();
        
        System.out.println("Введите строку: ");
        String str = scn.nextLine();
        while (! str.contains("print")) {
            queue.add(str);
            System.out.println(queue.toString());
            System.out.println("Введите 'print' чтобы закончить ввод. Или введите новую строку: ");
            str = scn.nextLine();
        }
        queue = revers(queue);
        System.out.println(queue.toString());
        scn.close();
    }
}
