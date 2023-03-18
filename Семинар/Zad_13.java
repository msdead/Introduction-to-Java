package Семинар;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Zad_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Deque <String> queue = new LinkedList<String>();
        
        System.out.println("Enter string: ");
        String str = scn.nextLine();
        while (! str.contains("print")) {
            queue.add(str);
            System.out.print(queue.toString());
            System.out.println("Enter new string: ");
            str = scn.nextLine();
        }
        while(! queue.isEmpty()) {
            System.out.println(queue.pollLast());
        }
        scn.close();
        }
    
}
