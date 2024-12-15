import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Строка s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Строка s2: ");
        String s2 = scanner.nextLine();

        boolean result = palindrome(s1, s2);
        System.out.println("Можно ли сделать s1 палиндромом s2? \n" + result);

    }

    public static boolean palindrome(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> countMap1 = new HashMap<>();
        Map<Character, Integer> countMap2 = new HashMap<>();

        //заполняем map символами и частотами их встречаемости в s1 и s2 соответственно
        for (char c : s1.toCharArray()) {
            countMap1.put(c, countMap1.getOrDefault(c, 0) + 1); //получаем значение (по умолчанию 0) и добавляем 1
        }

        for (char c : s2.toCharArray()) {
            countMap2.put(c, countMap2.getOrDefault(c, 0) + 1);
        }

        //сравниваем между собой элементы двух map
        return countMap1.equals(countMap2);
    }
}
