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

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        char[] q1 = q.toCharArray();
        char[] w1 = w.toCharArray();

        a = Character.digit(q1[0], 10);
        b = Character.digit(q1[1], 10);
        c = Character.digit(w1[0], 10);
        d = Character.digit(w1[1], 10);

        if(b == d){
            b = (e - a * 10 - c * 10)/2;
            d = b;
            if((a * 10 + b)+(c * 10 + d) == e){
                System.out.printf("Под знак ? необходимо поместить цифру: " + b);}
            else System.out.println("Решения нет");
        }

        if(a == c){
            a = (e - b - d)/10/2;
            c = a;
            if((a * 10 + b)+(c * 10 + d) == e){
                System.out.printf("Под знак ? необходимо поместить цифру: " + a);}
            else System.out.println("Решения нет");
        }

        if (a == d && a == -1 && d == -1){
            a = (e - c * 10 - c)/10;
            d = (e - c * 10 - c)%10;
            if((a * 10 + b)+(c * 10 + d) == e){
                System.out.printf("Под знак ? необходимо поместить цифру: " + a);}
            else System.out.println("Решения нет");
        }

        if(b == c && b == -1 && c == -1){
            b = (e - a * 10 - d)%10;
            c = (e - a * 10 - d)/10;
            if((a * 10 + b)+(c * 10 + d) == e){
                System.out.printf("Под знак ? необходимо поместить цифру: " + b);}
            else System.out.println("Решения нет");
        }

        iScanner.close();
    }
}




// public static void main(String[] args) {

//     Scanner iScanner = new Scanner(System.in);
//     System.out.print("Enter equation like '2? + ?5 = 69': ");
//     String equation = iScanner.nextLine(); //2? + ?5 = 69.
//     String message = "Решения нет!";
//     for (int i = 0; i < 10; i++) {
//         String result = equation.replace("?", Integer.toString(i));
//         // 20 + 05 = 69
//         String[] arr = result.split(" ");
//         if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]))
//             message = result;
//     }
//     System.out.println(message);
//     }