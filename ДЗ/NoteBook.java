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

    public boolean findOzu(Integer o) {
        if (this.ozu == o){
            return true;
        }
        return false;  
    }

    public boolean findHDDvolume(long h) {
        if (this.hddvolume == h){
            return true;
        }
        return false;  
    }

    public boolean findOs(String s) {
        if (this.os == s){
            return true;
        }
        return false;  
    }

    public boolean findColor(String c) {
        if (this.color == c){
            return true;
        }
        return false;  
    }
}