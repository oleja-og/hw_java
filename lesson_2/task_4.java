package lesson_2;

import java.io.FileWriter;

import java.util.Scanner;

/* Реализовать простой калькулятор (+-/*) */

public class task_4 {
    public static void main(String[] args) throws java.io.IOException{
        char action;
        Scanner sk = new Scanner(System.in);
        System.out.println("Введите число 1 : ");
        int number_1 = sk.nextInt();
        System.out.println("Введите действие : ");
        action = sk.next().charAt(0);
        System.out.println("Введите число 2 : ");
        int number_2 = sk.nextInt();
        int number_3 ;
        StringBuilder sb = new StringBuilder();
        String text ;
        switch (action) {
            case '+': System.out.println(number_1+number_2);
                number_3 = number_1+number_2;
                sb.append(number_1+"+"+number_2+"="+number_3);
                text = sb.toString();
                log(text);
                break;
            case '-': System.out.println(number_1-number_2);
                number_3 = number_1-number_2;
                sb.append(number_1+"-"+number_2+"="+number_3);
                text = sb.toString();
                log(text);
                break;
            case '*': System.out.println(number_1*number_2);
                number_3 = number_1*number_2;
                sb.append(number_1+"*"+number_2+"="+number_3);
                text = sb.toString();
                log(text);
                break;
            case '/': System.out.println(number_1/number_2);
                number_3 = number_1/number_2;
                sb.append(number_1+"/"+number_2+"="+number_3);
                text = sb.toString();
                log(text);
                break;
        
            default: System.out.println("ошибка ввода");
                break;
        }
        
    }
    public static void log(String text) {
        try {
            FileWriter fw = new FileWriter("file1.txt", true);
            fw.write(text+"\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("что то пошло не так");
        }
    }
}
