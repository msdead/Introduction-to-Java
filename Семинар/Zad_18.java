package Семинар;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве
// и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class Zad_18 {
   
    static ArrayList<Integer> createArrayRandomNumbers(int n) {
        ArrayList<Integer> listTest = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listTest.add((int) (Math.random() * ((n) + 1)));
        }
        return listTest;
    }

    static double getUniqueNumbers(ArrayList<Integer> listTest) {
        Set<Integer> setUniqueNumbers = new HashSet<>(listTest);
        return (double) setUniqueNumbers.size() / listTest.size();
    } 
    
    public static void main(String[] args) {
        ArrayList<Integer> listTest = createArrayRandomNumbers(130);
        System.out.println(listTest.toString());
        System.out.printf("%.2f%%", getUniqueNumbers(listTest) * 100);
    }
}