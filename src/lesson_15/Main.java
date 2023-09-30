package lesson_15;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью Stream'ов:
//- Удалить дубликаты
//- Оставить только четные элементы
//- Вывести сумму оставшихся элементов в стриме
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10, 2, 5, 7, -1, 40, 10));
        Optional<Integer> optionalInteger = integerList.stream()
                .distinct()
                .filter(integer -> integer % 2 == 0)
                .reduce(Integer::sum);
        optionalInteger.ifPresent(System.out::println);
//Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
//этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//Среди отобранных значений отобрать только те, которые имеют нечетное количество
//букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
        Map<Integer, String> myMap = new HashMap<>(Map.of(1, "Alex", 2, "Michail", 3, "Yura", 13, "Maxim"));
        Set<Integer> ids = new HashSet<>(Arrays.asList(1, 2, 5, 8, 9, 13));
        List<String> listNames = new LinkedList<>();
        for (int id : ids
        ) {
            if (myMap.containsKey(id)) {
                listNames.add(myMap.get(id));
            }
        }
        List <String> resultListNames = listNames.stream()
                .filter(name -> name.length() % 2 != 0)
                .map((name) -> String.valueOf(new StringBuilder(name).reverse()))
                .collect(Collectors.toList());
        System.out.println(resultListNames);

    }
}
