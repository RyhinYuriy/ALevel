package ALevel;

        import java.util.Scanner;

public class HomeTask1Job2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число от 10 до 99");
        int number = scanner.nextInt();
        int a = number%10;
        int b = (number)/10;
        int c = a+b;

        System.out.println("Сумма цифр равна "+c);

    }
}