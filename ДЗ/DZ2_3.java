package ДЗ;
import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;


public class DZ2_3 {

    public static void main(String[] args) throws IOException {
       
        Logger logger = Logger.getLogger(DZ2_3.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = iScanner.nextInt();
        System.out.println("Введите знак( + | - | / | * ): ");
        String z = iScanner.next();
        char a = '+';
        boolean a1 = z.contains(String.valueOf(a));
        char b = '-';
        boolean b1 = z.contains(String.valueOf(b));
        char c = '/';
        boolean c1 = z.contains(String.valueOf(c));
        char d = '*';
        boolean d1 = z.contains(String.valueOf(d));
        System.out.println("Введите число: ");
        int y = iScanner.nextInt();
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
        System.out.println(sum);
        iScanner.close();
        
        String result = Integer.toString(sum);
        logger.info("Результат решения = " + result);
    }
}

// public static void main(String[] args) throws IOException{
//     Logger ll = Logger.getLogger(lg.class.getName());
//     String logsPath = "log.txt";
//     FileHandler fh = new FileHandler(logsPath, false);
//     ll.addHandler(fh);
//     SimpleFormatter formatter = new SimpleFormatter();
//     // XMLFormatter form = new XMLFormatter();
//     fh.setFormatter(formatter);
    
//     ll.log(Level.INFO,"element: " + i);
//     ll.log(Level.WARNING, "logger off" );
    
//     ll.info("test" );
//     ll.warning("logsPath");
    
    
//     }