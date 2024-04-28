import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task2(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task3("ехал грека через реку видит грека в реке рак сунул грека руку в реку рак за руку греку цап");
        task4(List.of("один", "два", "два", "три", "три", "три"));
    }

    public static void task1(Collection<Integer> numbers) {
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2(Collection<Integer> numbers) {
        Set<Integer> numsSet = new HashSet<>(numbers);
        for (Integer i : numsSet) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task3(String text) {
        Set<String> words = new HashSet<>(List.of(text.split(" ")));
        System.out.println(words);
    }

    public static void task4(Collection<String> strings) {
        Map<String, Integer> stringsCount = new HashMap<>();
        for (String string : strings) {
            if (!stringsCount.containsKey(string)) {
                stringsCount.put(string, 1);
            } else {
                stringsCount.put(string, stringsCount.get(string) + 1);
            }
        }
        System.out.println(stringsCount.values());
    }
}