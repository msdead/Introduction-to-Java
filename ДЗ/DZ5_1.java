package ДЗ;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class DZ5_1 {

    public static Map<String, TreeSet<Integer>> addition (Map<String, TreeSet<Integer>> data,Scanner scn) {
        
        System.out.println("Введите фамилию: ");
        String famil = scn.next();
        System.out.println("Введите номер: ");
        Integer number = scn.nextInt();

        if (!data.containsKey(famil)) {
            data.put(famil, new TreeSet<Integer>());
        }
        data.get(famil).add(number);

        return data;
    }
    
    public static void main(String[] args) {

        Map<String, TreeSet<Integer>> data = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        
        int choice = 1;
        while (choice != 2) {
            System.out.println("Введите необходимое действие: ");
            System.out.println("1. Добавление номера.");
            System.out.println("2. Вывод всего.");

            choice = scn.nextInt();
            
            if (choice == 1){
                addition(data,scn);
            }
            if (choice == 2){
                for (var element : data.entrySet()) {
                    System.out.printf("%s: %s \n", element.getKey(), element.getValue());
                }
            }
        }
    }
}
