// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

package Семинар;

import java.util.Scanner;

public class Zad_1 {
    
    public static void main(String[] args) {
        System.out.println("Введите свое имя: ");
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            String name = iScanner.nextLine();
            System.out.printf("Привет! %s ", name);
        }
    }
}