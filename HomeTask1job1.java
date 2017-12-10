package ALevel;

import java.util.Random;
import java.util.Scanner;

public class HomeTask1job1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число");
        int generatednumber = 1+ (int) (Math.random() * 10);
        System.out.println("Введите число от 1 до 10");
        int number = scanner.nextInt();


        if (generatednumber == number) {
            System.out.print(generatednumber);
            System.out.print(" равно ");
            System.out.println(number);
            System.out.println("Молодец! Угадал");
        } else {
            System.out.print(generatednumber);
            System.out.print(" не равно ");
            System.out.println(number);
            System.out.println("Извини, интуиция не сработала");
            // System.out.println("Введите число от 1 до 10");
        }

        // while (number != generatednumber) ;

    }

    //System.out.println(number);
    //System.out.println(generatednumber);

}
