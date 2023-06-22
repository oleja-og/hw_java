package lesson_4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
2) Сложите два числа и верните сумму в виде связанного списка.
Одно или два числа могут быть отрицательными.

Даны два Deque, цифры в обратном порядке.
[3,2,1] - пример Deque
[5,4,3]- пример второго Deque
1) 123 * 345 = 42 435
Ответ всегда - связный список, в обычном порядке
[4,2,4,3,5] - пример ответа*/
public class task_1 {

    public static void main(String[] args) {
        Deque number1 = rnd(args);
        Deque number2 = rnd(args);
        System.out.println(number1);
        System.out.println(number2);
        String stroka = action(revers_deque(number1), revers_deque(number2));
        convertlist(stroka);
        
    }
    public static Deque<String> rnd(String[] args) {
        System.out.println("Введите число  : ");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        Deque number = new LinkedList<>();
        for (int index = 0; index < num.length(); index++) {
            number.add(num.charAt(index));
        }
        return number;
    }
    

    public static String revers_deque(Deque number1) {
        String num1 = "";
        for (int i = 0; i < number1.size(); i++) {

            num1 = num1 + number1.removeLast();
        }
        num1 = num1 + number1.removeFirst();
        System.out.println(num1);    
        return num1;
    }
    

    public static String action(String number1, String number2) {
        char action;
        Scanner sk = new Scanner(System.in);
        System.out.println("Введите действие : ");
        action = sk.next().charAt(0);
        int num1 = Integer.valueOf(number1);
        int num2 = Integer.valueOf(number2);
        Integer num = 0;
        switch (action) {
            case '+':
                num = num1 + num2;
                System.out.println(String.format("%d+%d=%d",num1,num2,num));
                break;
            case '-':
                num=num1 - num2;
                System.out.println(String.format("%d-%d=%d",num1,num2,num));
                break;
            case '*':
                num=num1 * num2;
                System.out.println(String.format("%d*%d=%d",num1,num2,num));
                break;
            case '/':
                num = num1 / num2;
                System.out.println(String.format("%d/%d=%d",num1,num2,num));
                break;

            default:
                System.out.println("ошибка ввода");
                break;
        }
        ;
        String stroka = Integer.toString(num);
        return stroka;
    }
    public static void convertlist(String stroka) {
        List ls = new LinkedList<>();
        for (int index = 0; index < stroka.length(); index++) {
            ls.add(stroka.charAt(index));
        }
        System.out.println(ls);
    }
}