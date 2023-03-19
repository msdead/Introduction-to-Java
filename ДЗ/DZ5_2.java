package ДЗ;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DZ5_2 {
    public static void main(String[] args) {

        Map<String, String> data = new HashMap<>();

        data.putIfAbsent("Иванов", "Иван");
        data.putIfAbsent("Петрова", "Светлана");
        data.putIfAbsent("Белова", "Кристина");
        data.putIfAbsent("Мусина", "Анна");
        data.putIfAbsent("Крутова", "Анна");
        data.putIfAbsent("Юрин", "Иван");
        data.putIfAbsent("Лыков", "Петр");
        data.putIfAbsent("Чернов", "Павел");
        data.putIfAbsent("Чернышов", "Петр");
        data.putIfAbsent("Федорова", "Мария");
        data.putIfAbsent("Светлова", "Марина");
        data.putIfAbsent("Савина", "Мария");
        data.putIfAbsent("Рыкова", "Мария");
        data.putIfAbsent("Лугова", "Марина");
        data.putIfAbsent("Владимирова", "Анна");
        data.putIfAbsent("Мечников", "Иван");
        data.putIfAbsent("Петин", "Петр");
        data.putIfAbsent("Ежов", "Иван");

        Map<String, Integer> info = new HashMap<>();
    
        int count = 1;

        for (var element : data.entrySet()) {
            if (!info.containsKey(element.getValue())){
                info.put(element.getValue(), count);
            } else {
                info.get(element.getValue());
                count = 1 + info.get(element.getValue());
                info.put(element.getValue(),count);    
            }
            count = 1;
        }
        System.out.println();
        System.out.println("'Имя' = 'количество сотрудников с данным именем' ");
        System.out.println();
        info.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);
    }
}