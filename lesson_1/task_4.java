package lesson_1;

import java.util.Scanner;

/* (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
Под знаком вопроса - всегда одинаковая ЦИФРА.
Введите уравнение: ?? + ?? = 44
Решение: 22 + 22 = 44*/
public class task_4 {
    public static void main(String[] args) {
        System.out.println("введите число : ");
        Scanner sc = new Scanner(System.in);
        int summ = sc.nextInt();
        int number1 = 0;
        int number2 = 0;

        for (int i = 11; i < summ-10; i++) {
            for (int j = 11; j < summ-10; j++) {
                if (i%10==j/10 & i+j==summ) {
                    number1 = i;
                    number2 = j;
                    System.out.printf("%d + %d = %d", number1, number2, summ);
                    System.out.println();
                }
                } 
        }
        System.out.println();
    }
}
