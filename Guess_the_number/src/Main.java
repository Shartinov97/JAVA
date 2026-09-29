import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        final int attempt = 7;
        final int range = 100;
        int choice = 0;
        int player = 0;
        int num = 0;
        int res = 0;
        System.out.println("Добро пожаловоапть в игру 'Угадай число'");
        do {
            int computer = rand.nextInt(range) + 1;
            System.out.println(computer);
            do {
                try {
                    res = attempt - num;
                    System.out.println("Осталось попыток: " + res);
                    System.out.print("Ведите число от 1 до 100: ");
                    player = scanner.nextInt();
                    num++;
                    if (player > 0 && player < 101){
                        if (player > computer){
                            System.out.println("Больше");
                        }
                        else if (player < computer){
                            System.out.println("Меньше");
                        }
                        else if (player == computer){
                            System.out.println("Вы угадали за " + num + " попыток");
                        }

                    }
                    else {
                        System.out.println("Ошибка, число за диапозоном чисел ддя угадывания");
                    }

                }catch (InputMismatchException e){
                    System.out.println("пожалуйста введите число");
                    scanner.next();
                }
            }while (player != computer || res != 0);
            System.out.println("Хотите продолжить игру?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            choice = scanner.nextInt();
        }while (choice != 2);
    }
}
