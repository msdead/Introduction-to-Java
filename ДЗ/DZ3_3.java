package ДЗ;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class DZ3_3 {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++){
            int x = ran.nextInt(10);
            ar.add(x);}
        System.out.println(ar.toString());
        ar.sort(Comparator.naturalOrder());
        int min = 0;
        int max = ar.size();
        double f = 0;
        for (int i = 0; i < ar.size(); i++) {
            min = ar.get(0);
            max = ar.get(ar.size() - 1);
            f = f + ar.get(i);            
        }
        f = f / ar.size();
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("F: " + f);
    }
}
