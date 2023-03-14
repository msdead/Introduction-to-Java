package Семинар;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Zad_8 {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++){
            int x = ran.nextInt(10);
            ar.add(x);}
        System.out.println(ar.toString());
        ar.sort(Comparator.naturalOrder());
        System.out.println(ar.toString());
    }
}
