package lesson_1;

import java.text.Format;
import java.util.Scanner;

/* Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)*/

public class task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int count1 = 1;
        for (int i = 1; i < number+1; i++) {
            count+=i;
        }
        for (int i = 1; i < number+1; i++) {
            count1*=i;
        }
        System.out.printf("треугольное %d ,  факториал %d", count, count1);
        System.out.println();      
    }
}
