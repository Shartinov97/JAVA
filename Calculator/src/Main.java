import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математическую операцию(+,-,*,/): ");
        char znak = scanner.next().charAt(0);
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите первое число: ");
        double number2 = scanner.nextDouble();
        double result = 0;
        if (znak == '+'){
            result = number1 + number2;
        }

        else if (znak == '-'){
            result = number1 - number2;
        }

        else if (znak == '*'){
            result = number1 * number2;
        }

        else if (znak == '/'){
            if (number2 != 0.0){
                result = number1 - number2;
            }
            else {
                System.out.println("Ошибка, деление на 0 невозможно");
            }
        }

        System.out.println("Результат: " + result);
    }
}
