package Семинар;

import java.util.ArrayList;

public class Zad_10 {
    static void ex3(){
        ArrayList list = new ArrayList<>();
        list.add("asdad5");
        list.add("asdad4");
        list.add("asdad3");
        list.add(22);
        list.add(22);
        list.add(22);
        list.add("asdad2");
        list.add("asdad1");
        list.add(22);
        
        System.out.println(list);
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
