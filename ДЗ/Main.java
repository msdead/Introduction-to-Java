package ДЗ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) throws IOException {
       
        try (FileWriter fw = new FileWriter("new.txt",false)){
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
           
        }


        Logger logger = Logger.getLogger(Ex0043.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler ();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter ();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование" );
        logger.info("Тестовое логирование" );



















        // File file = new File("Text.txt");
        // Scanner scanner = new Scanner(file);
        // String line = scanner.nextLine();








}