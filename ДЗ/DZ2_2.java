package ДЗ;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.Spring;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DZ2_2 {

    public static void write(String[] word) {
        File file = new File("new.txt");
        String joinedString = Arrays.toString(word);
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



    public static void main(String[] args) throws IOException {
        
        File file = new File("Text.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] word = line.split(":");
        System.out.println(Arrays.toString(word));
        write(word);
        while (line != null) {
            line = scanner.nextLine();
            word = line.split(":");
            write(word);
            System.out.println(Arrays.toString(word));
        }
    }


//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("new.txt");
//         sb.replace(0, 0, null)
//    }
}