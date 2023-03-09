package ДЗ;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DZ2_1 {

    public static void write(int[]arg) {
        File file = new File("log_file.txt");
        String joinedString = Arrays.toString(arg);
        try{
            FileWriter fr = new FileWriter(file,true);
            fr.write(joinedString.toString());
            fr.write("\n");
            fr.close();
        }
        catch(IOException e) {
            System.out.println("ERROR");
        }
    }

    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число длинны массива: ");
        int size = iScanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа через ENTER: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = iScanner.nextInt();
        }
        iScanner.close();

        write(array);

        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    write(array);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}