package laba11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Stream {
    public static void main(String[] args) throws IOException {
        List<Item> items = new ObjectMapper().readValue(new File("src/main/java/laba11/data.json"), new TypeReference<>() {});

        // Фильтрация по произвольному предикату
        items.stream()
                .filter(item -> item.getYear() == 2015)
                .forEach(System.out::println);
        System.out.println("=========================================================================");

        // Сортировка по произвольному полю
        items.stream()
                .sorted(comparing(Item::getCity))
                .forEach(System.out::println);
        System.out.println("=========================================================================");

        // Ограничение количества выводимых объектов
        items.stream().limit(5).forEach(System.out::println);
        System.out.println("=========================================================================");

        // Преобразование объекта в другой объект
        items.stream().map(Item::getJob).forEach(System.out::println);
        System.out.println("=========================================================================");

        // Топ-10 максимальных зарплат опрошенных, младше 25 лет, в городе Ташкент
        items.stream()
                .filter(item -> item.getAge() < 25 && item.getCity().equals("Ташкент"))
                .sorted(comparing(Item::getSalary))
                .map(Item::getSalary)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("=========================================================================");

        // Количество опрошенных, получающих зарплаты, выше 50 тыс., по профессии Повар
        long countCooking = items.stream()
                .filter(item -> item.getJob().equals("Повар") && item.getSalary() > 50000)
                .count();
        System.out.println(countCooking);
        System.out.println("=========================================================================");

        // Максимальная зарплата среди опрошенных из города Астана, в возрасте от 25 до 40
       Optional<Integer> maxSalary = items.stream()
               .filter(item -> item.getCity().equals("Астана") && item.getAge() > 25 && item.getAge() < 40)
               .map(Item::getSalary)
               .max(Comparator.naturalOrder());
        maxSalary.ifPresent(System.out::println);
        System.out.println("=========================================================================");

        // Минимальный возраст среди опрошенных из города София, получающих зарплату выше 100 тыс.
        Optional<Integer> minAge = items.stream()
                .filter(item -> item.getCity().equals("София") && item.getSalary() > 100000)
                .map(Item::getAge)
                .min(Comparator.naturalOrder());
        minAge.ifPresent(System.out::println);
        System.out.println("=========================================================================");

        // Сгруппировать все данные по произвольному строковому полю
        Map<String, List<Item>> groupJob = items.stream()
                .collect(groupingBy(Item::getJob));
        groupJob.forEach((key, val) -> System.out.println(key + ": " + val));
        System.out.println("=========================================================================");

        // Сгруппировать все данные по произвольному строковому полю, подсчитав количество элементов в каждой группе
        Map<String, Long> countGroupJob = items.stream()
                .collect(groupingBy(Item::getJob, counting()));
        countGroupJob.forEach((key, val) -> System.out.println(key + ": " + val));
        System.out.println("=========================================================================");

        // Сгруппировать все данные по городам, подсчитав максимальную зарплату, полученную в нем
        Map<String, Optional<Integer>> maxSalaryCity = items.stream()
                .collect(groupingBy(Item::getCity,
                        mapping(Item::getSalary, maxBy(Comparator.naturalOrder()))));

        maxSalaryCity.forEach((key, val) -> System.out.println(key + ": " + val));
        System.out.println("=========================================================================");


        // Сгруппировать все данные по городам, подсчитав среднюю зарплату по каждой профессии
        Map<String, Map<String, Double>> avgSalaryCity = items.stream()
                .collect(groupingBy(Item::getCity,
                        groupingBy(Item::getJob,
                                averagingInt(Item::getSalary))));

        avgSalaryCity.forEach((key, val) -> System.out.println(key + ": " + val));

    }
}
