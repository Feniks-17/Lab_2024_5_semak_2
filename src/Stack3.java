import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Stack3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number < 0) {
            try {
                String input = scanner.nextLine();
                number = parseInt(input); //преобразование строки в число
                if (number < 0) {
                    System.out.println("Введите неотрицательное число: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите число: ");
            }
        }

        String binaryRepresentation = binaryNumber(number); //двоичное представление числа
        System.out.println("Двоичное представление числа " + number + " это: " + binaryRepresentation);
    }

    public static String binaryNumber (int n) {
        if (n == 0) {
            return "0";
        }

        Deque<Integer> stack = new ArrayDeque<>();

        while (n > 0) {
            int remainder = n % 2; //остаток
            stack.push(remainder);
            n = n / 2;
        }

        StringBuilder binaryString = new StringBuilder(); //динамическая строка
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop());
        }

        return binaryString.toString();
    }
}
