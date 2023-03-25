package Семинар;

public class Zad_19 {

    public class main {

        public static void main(String[] args) {
        Cat cat_1 = new Cat();
        Cat cat_2 = new Cat();
        cat_1.setName("Murzik");
        cat_2.setName("Murka");
        cat_1.setAge(3);
        cat_2.setAge(7);
        System.out.printf("Name of cat is: %s, age: %d \n", cat_1.getName(), cat_1.getAge());
        System.out.printf("Name of cat is: %s, age: %d \n", cat_2.getName(), cat_2.getAge());
        // cat_1.madeInject();
        cat_2.golos(3);
        // cat_1.madeInject();
        }
    }
}