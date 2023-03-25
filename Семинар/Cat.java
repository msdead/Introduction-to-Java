package Семинар;

public class Cat {
    private String name;
    String poroda;
    private Integer age;

    public Cat(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Cat(String name, Integer age, String string2) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    public Cat() {
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void catSaid(Integer i){
        System.out.printf("%s мяукнул %d раз", this.name, i);
    }

    @Override
    public String toString(){
        return name + " <- Имя   Возраст -> " + age;
    }

    public void golos(int i) {
    }

    public void setName(String string) {
    }

    public Object getName() {
        return null;
    }
}