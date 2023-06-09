package lesson_1;

import java.util.Scanner;

/* Реализовать простой калькулятор (+-/*) */

public class task_3 {
    public static void main(String[] args) throws java.io.IOException{
        char action;
        Scanner sk = new Scanner(System.in);
        System.out.println("Введите число 1 : ");
        int number_1 = sk.nextInt();
        System.out.println("Введите действие : ");
        action = sk.next().charAt(0);
        System.out.println("Введите число 2 : ");
        int number_2 = sk.nextInt();

        switch (action) {
            case '+': System.out.println(number_1+number_2);

                break;
            case '-': System.out.println(number_1-number_2);
                
                break;
            case '*': System.out.println(number_1*number_2);
                
                break;
            case '/': System.out.println(number_1/number_2);
                
                break;
        
            default: System.out.println("ошибка ввода");
                break;
        }
        
    }
}
