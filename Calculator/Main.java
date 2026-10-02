import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите математическую операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        double result = 0;
        boolean hasError = false; // Флаг для отслеживания ошибок

        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            if (number2 != 0.0) {
                result = number1 / number2; // Исправлено на деление
            } else {
                System.out.println("Ошибка, деление на 0 невозможно");
                hasError = true;
            }
        } else {
            System.out.println("Ошибка: неизвестная операция. Используйте +, -, * или /");
            hasError = true;
        }

        // Выводим результат только если не было ошибок
        if (!hasError) {
            System.out.println("Результат: " + result);
        }

        scanner.close(); // Закрыли ресурс
    }
}
