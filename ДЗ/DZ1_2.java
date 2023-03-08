package ДЗ;

public class DZ1_2 {
    public static void main(String[] args) {
        int p = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    p = p + 1;
                }
            }
        if (p == 2){
            System.out.println(i);
        }
        p = 0;
        }
    }
}