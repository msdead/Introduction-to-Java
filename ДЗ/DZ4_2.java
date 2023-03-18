package ДЗ;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DZ4_2 {

    public static Deque <String> enqueue(Deque <String> queue,Scanner scn) {
        scn.nextLine();
        System.out.println("Введите строку: ");
        String str = scn.nextLine();
        queue.add(str);
        return queue;
    }

    public static Deque <String> dequeue(Deque <String> queue) {
        String str = queue.pollFirst();
        System.out.println(str + " - удален из очереди."); 
        return queue;
    }

    public static Deque <String> first(Deque <String> queue) {
        String str = queue.peekFirst();
        System.out.println(str + " - первый элемент в очереди.");       
        return queue; 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Deque <String> queue = new LinkedList<String>();

        int choice = 1;
        while (choice != 0) {
            System.out.println("Введите необходимое действие: ");
            System.out.println("0. Для завершения работы.");
            System.out.println("1. Для добавления элемента в конец очереди.");
            System.out.println("2. Для возвращения первого элемента и удаления из очереди.");
            System.out.println("3. Для возвращения первого элемента без удаления из очереди.");
            
            choice = scn.nextInt();
            
            if (choice == 1){
                queue = enqueue(queue,scn);
            }
            if (choice == 2){
                queue = dequeue(queue);
            }
            if (choice == 3){
                queue = first(queue);
            }

        }
        System.out.print("Итоговая очередь: "+ queue.toString());
        scn.close();
    }
}
