package ДЗ;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DZ2_2 {

    public static void write(String newString) {

        File file = new File("new.txt");
        try{
            FileWriter fr = new FileWriter(file,true);
            fr.write(newString.toString());
            fr.write("\n");
            fr.close();
        }
        catch(IOException e) {
            System.out.println("ERROR");
        }
    }

    public static void repAndWrite(String newString) throws IOException {

        newString = newString.replace(":","");
        newString = newString.replace(",","");
        newString = newString.replace("\"","");
        newString = newString.replace("фамилия","Студент ");
        newString = newString.replace("оценка"," получил ");
        newString = newString.replace("предмет"," по предмету ");
        write(newString);
    }
       
    public static void main(String[] args) throws IOException {
        
        File file = new File("Text.txt");
        Scanner scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String str = sb.toString();
        while (str != null){
            repAndWrite(str);
            sb = new StringBuilder(scanner.nextLine());
            str = sb.toString();}
        scanner.close();
    }
}