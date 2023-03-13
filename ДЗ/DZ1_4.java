package ДЗ;
import java.util.Scanner;

public class DZ1_4 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        String q = iScanner.next();
        System.out.println("Введите 2 число: ");
        String w = iScanner.next();
        System.out.println("Введите ответ: ");
        int e = iScanner.nextInt();
        int i;
        String q1 = q.replace("?", i);
        String w1 = w.replace("?", i );
        
        // int q2 = Integer.parseInt (q1);
        // int w2 = Integer.parseInt (w1);
        
        int q2 = 0;
        int w2 = 0;
        int result1 = 0;
        int result2 = 0;
        // char result3 = 0;
        // char result4 = 0;
        

        // char[] q3 = q.toCharArray();
        // for (int j = 0; j < q3.length; j++) {
        //     result1 = q3[0];
        //     result2 = q3[1];
        // }
       
        // char[] w3 = w.toCharArray();
        // for(int k = 0; k < w3.length; k++) {
        //     result3 = w3[0];
        //     result4 = w3[1];
        // }

        // if(result2 == "0"){

        // }




        for (int i = 0; i < 10; i++) {
            q2 = Integer.parseInt (q1);
            w2 = Integer.parseInt (w1);
            // System.out.println(q2);
            // System.out.println(w2);
            if (q2 + w2 == e);{
                System.out.printf("Для решения уравнения требуется подставить: ", i);
                result1 = q2;
                result2 = w2;
            }
        }
        if (result1 + result2 != e){
            System.out.print("Решения нет!!!");
        }
        
        // // q + w = e
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(e);

     
    }
}