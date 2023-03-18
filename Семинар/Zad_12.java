package Семинар;

import java.util.LinkedList;
import java.util.Scanner;

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.

public class Zad_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<String> listlink = new LinkedList<>();
        System.out.println("Enter string: ");
        String str = scn.nextLine();
        while (!scn.equals("stop")) {
            if (!str.contains("print~")) {
                listlink.add(str);
            } else {
                String st = str.substring(6);
                System.out.println(st);
                int index = Integer.parseInt(st);
                System.out.println(listlink.get(index));
                listlink.remove(index);
            }
            System.out.print(listlink.toString());
            System.out.println("Enter new string: ");
            str = scn.nextLine();
        }
        scn.close();
    }
}