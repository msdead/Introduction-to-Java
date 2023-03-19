package Семинар;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad_15 {
    
    static boolean isIsomorpf(String strFirst, String strSecond) {
        if (strFirst.length() != strSecond.length()) {
            return false;
        }
        Map<Character, Character> data = new HashMap<>();
        for (int i = 0; i < strFirst.length(); i++) {
            if (!data.containsKey(strFirst.charAt(i))) {
                data.put(strFirst.charAt(i), strSecond.charAt(i));
            } else {
                if (data.get(strFirst.charAt(i)) != strSecond.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first word!: ");
        String strFist = scn.nextLine();
        System.out.println("Enter second word!: ");
        String strSecond = scn.nextLine();
        if (isIsomorpf(strFist, strSecond)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scn.close();
    }
}
