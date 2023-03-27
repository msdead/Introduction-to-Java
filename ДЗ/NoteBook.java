package ДЗ;

public class NoteBook {
    private Integer ozu;
    private long hddvolume;
    private String os;
    private String color;

    @Override
    public String toString() {
        return String.format("ОЗУ:%d  Объем ЖД:%d  ОС:%s  Цвет:%s", ozu, hddvolume, os, color);
    }

    public NoteBook(Integer ozu, long hddvolume, String OS, String color) {
        this.ozu = ozu;
        this.hddvolume = hddvolume;
        this.os = OS;
        this.color = color;
    }

    public boolean FindOzu(int x) {
        if (this.ozu == x){
            return true;
        }
        return false;  
    }

    public boolean FindHDDvolume(long h) {
        if (this.hddvolume == h){
            return true;
        }
        return false;  
    }

    public boolean FindOs(String s) {
        if (this.os == s){
            return true;
        }
        return false;  
    }

    public boolean FindColor(String c) {
        if (this.color == c){
            return true;
        }
        return false;  
    }

    public boolean OzuOrColor(String r){
        if(this.os == r){
            return FindOs(r);
        }
        if(this.os == r){
            return FindColor(r);
        }
        return false;
    }


    public static void PrintResult(String x, NoteBook notebook1, NoteBook notebook2, NoteBook notebook3, NoteBook notebook4, NoteBook notebook5){
        if (notebook1.OzuOrColor(x) == true){
            System.out.println(notebook1);}
        if (notebook2.OzuOrColor(x) == true){
            System.out.println(notebook2);}
        if (notebook3.OzuOrColor(x) == true){
            System.out.println(notebook3);}
        if (notebook4.OzuOrColor(x) == true){
            System.out.println(notebook4);}
        if (notebook5.OzuOrColor(x) == true){
            System.out.println(notebook5);}
    }
    
    public static void PrintResult(int x, NoteBook notebook1, NoteBook notebook2, NoteBook notebook3, NoteBook notebook4, NoteBook notebook5){
        if (notebook1.FindOzu(x) == true){
            System.out.println(notebook1);}
        if (notebook2.FindOzu(x) == true){
            System.out.println(notebook2);}
        if (notebook3.FindOzu(x) == true){
            System.out.println(notebook3);}
        if (notebook4.FindOzu(x) == true){
            System.out.println(notebook4);}
        if (notebook5.FindOzu(x) == true){
            System.out.println(notebook5);}
    }

    public static void PrintResult(long x, NoteBook notebook1, NoteBook notebook2, NoteBook notebook3, NoteBook notebook4, NoteBook notebook5){
        if (notebook1.FindHDDvolume(x) == true){
            System.out.println(notebook1);}
        if (notebook2.FindHDDvolume(x) == true){
            System.out.println(notebook2);}
        if (notebook3.FindHDDvolume(x) == true){
            System.out.println(notebook3);}
        if (notebook4.FindHDDvolume(x) == true){
            System.out.println(notebook4);}
        if (notebook5.FindHDDvolume(x) == true){
            System.out.println(notebook5);}
    }
}