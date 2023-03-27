package ДЗ;

import java.util.Scanner;

public class DZ_6_1 {

    public static void main(String[] args) {
        
        Integer ozu;
        long hddvolume;
        String os;
        String color;
        Scanner scn = new Scanner(System.in);
        
        NoteBook notebook1 = new NoteBook(8, 256, "windows", "black");
        NoteBook notebook2 = new NoteBook(8, 512, "windows", "blue");
        NoteBook notebook3 = new NoteBook(16, 512, "linux", "silver");
        NoteBook notebook4 = new NoteBook(16, 1024, "linux", "silver");
        NoteBook notebook5 = new NoteBook(32, 1024,"windows", "black");

        System.out.println("Здравствуйте! Давайте подберем вам ноутбук");
        System.out.println("Выберете интересующий вас параметр: ");
        System.out.println("1. ОЗУ");
        System.out.println("2. Объем Жесткого Диска");
        System.out.println("3. Операционная система");
        System.out.println("4. Цвет");
        
        int answer = scn.nextInt();
        
        while(answer < 1 || answer > 4){
            System.out.println("Выберете интересующий вас параметр: ");
            System.out.println("1. ОЗУ");
            System.out.println("2. Объем Жесткого Диска");
            System.out.println("3. Операционная система");
            System.out.println("4. Цвет");
            answer = scn.nextInt();
        }
        if (answer == 1){
            System.out.println("Выберете необходимое количество памяти ОЗУ: ");
            System.out.println("1. 8 Гб");
            System.out.println("2. 16 Гб");
            System.out.println("3. 32 Гб");
            answer = scn.nextInt();
            while (answer < 1 || answer > 3){
                System.out.println("Выберете необходимое количество памяти ОЗУ: ");
                System.out.println("1. 8 Гб");
                System.out.println("2. 16 Гб");
                System.out.println("3. 32 Гб");
                answer = scn.nextInt();}
            if (answer == 1){
                ozu = 8;
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(ozu, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
            if (answer == 2){
                ozu = 16;
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(ozu, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
            if (answer == 3){
                ozu = 32;
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(ozu, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
        }

        if (answer == 2){
            System.out.println("Выберете необходимый объем жесткого диска: ");
            System.out.println("1. 256 Гб");
            System.out.println("2. 512 Гб");
            System.out.println("3. 1024 Гб");
            answer = scn.nextInt();
            while (answer < 1 || answer > 3){
                System.out.println("Выберете необходимый объем жесткого диска: ");
                System.out.println("1. 256 Гб");
                System.out.println("2. 512 Гб");
                System.out.println("3. 1024 Гб");
                answer = scn.nextInt();}
            if (answer == 1){
                hddvolume = 256;
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(hddvolume, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
            if (answer == 2){
                hddvolume = 512;
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(hddvolume, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
            if (answer == 3){
                hddvolume = 1024;
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(hddvolume, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
        }

        if (answer == 3){
            System.out.println("Выберете операционную систему: ");
            System.out.println("1. windows");
            System.out.println("2. linux");
            answer = scn.nextInt();
            while (answer < 1 || answer > 2){
                System.out.println("Выберете операционную систему: ");
                System.out.println("1. windows");
                System.out.println("2. linux");
                answer = scn.nextInt();}  
          if (answer == 1){
                os = "windows";
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(os, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
            if (answer == 2){
                os = "linux";
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(os, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
        }

        if (answer == 4){
            System.out.println("Выберете интересующий вас цвет: ");
            System.out.println("1. Черный");
            System.out.println("2. Синий");
            System.out.println("3. Серебристый");
            answer = scn.nextInt();
            while (answer < 1 || answer > 3){
                System.out.println("Выберете интересующий вас цвет: ");
                System.out.println("1. Черный");
                System.out.println("2. Синий");
                System.out.println("3. Серебристый");
                answer = scn.nextInt();}
            if (answer == 1){
                color = "black";
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(color, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
            if (answer == 2){
                color = "blue";
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(color, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
            if (answer == 3){
                color = "silver";
                System.out.println("Вам подойдет ноутбук: ");
                NoteBook.PrintResult(color, notebook1, notebook2, notebook3, notebook4, notebook5);
                answer = 0;
            }
        }
        scn.close();
    }
}
