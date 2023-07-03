package lesson_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих*/
public class task_1 {
    public static void main(String[] args) {
        // Set<String> name_company = new HashSet<>();
        // Map<ArrayList, String> loptop = new HashMap<>();
        // ArrayList<Loptop> lop = new ArrayList<>();
       
        Loptop notebook1 = new Loptop("apple", "air13", "8", "256", "3000", "mac", "silver");
        Loptop notebook2 = new Loptop("acer", "aspire", "8", "256", "1000", "win", "silver");
        Loptop notebook3 = new Loptop("hp", "pavilion", "8", "256", "2000", "linux", "silver");
        Loptop notebook4 = new Loptop("asus", "vivo", "8", "256", "4000", "win", "silver");
        Loptop notebook5 = new Loptop("dell", "vostro", "8", "256", "3000", "linux", "silver");
        Loptop notebook6 = new Loptop("apple", "air14", "8", "512", "5000", "mac", "gold");
        
        menu(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6);
    }
    public static void menu(Loptop notebook1,Loptop notebook2,Loptop notebook3,Loptop notebook4,Loptop notebook5,Loptop notebook6) {
        
        boolean flag = true;
        while (flag) {
            Stream<Loptop> streamlop = Stream.of(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6);
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите действие :");
            System.out.println(
                    "1. Выбор параметра \n 2.Показать все товары \n 3. выход");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    
                    System.out.println("Выбор параметра");
                    System.out.println("");
                    menu_parametr(streamlop);
                    break;
                case "2":
                    System.out.println("Все товары");
                    all(streamlop);
                    break;
                case "3":
                    System.out.println("Выыход");
                    flag = false;
                    break;

                default:
                    break;
            }
        }
    }
    public static void menu_parametr(Stream<Loptop> streamlop) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Фильтровать по :");
        System.out.println("1. Производитель \n 2. ОЗУ \n 3. HD \n 4. Color ");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                filtr_creator(streamlop);
                System.out.println("Производитель");
                System.out.println("");
                break;
            case "2":
                filtr_ozy(streamlop);
                System.out.println("ОЗУ");
                break;
            case "3":
                filtr_hd(streamlop);
                System.out.println("ЖД");
                break;
            case "4":
                filtr_color(streamlop);
                System.out.println("Цвет");
                
                break;

            default:
                System.out.println("ошибка вввода");
                break;
        }
    }

    public static String choice(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие :");
        String choice = sc.nextLine();
        return choice;
    }

    public static void filtr_creator(Stream<Loptop> streamlop ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите производителя :");
        String choice = sc.nextLine();
        streamlop.filter(i -> i.getCreator().equals(choice)).forEach(i -> System.out.println(i.toString()));
    }
    public static void filtr_ozy(Stream<Loptop> streamlop ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите озу :");
        String choice = sc.nextLine();
        streamlop.filter(i -> i.getOzy().equals(choice)).forEach(i -> System.out.println(i.toString()));
    }
    public static void filtr_hd(Stream<Loptop> streamlop ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите hd :");
        String choice = sc.nextLine();
        streamlop.filter(i -> i.getHd().equals(choice)).forEach(i -> System.out.println(i.toString()));
    }
    public static void filtr_color(Stream<Loptop> streamlop ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цвет :");
        String choice = sc.nextLine();
        streamlop.filter(i -> i.getColor().equals(choice)).forEach(i -> System.out.println(i.toString()));
    }
    public static void all(Stream<Loptop> streamlop ) {
        streamlop.forEach(i -> System.out.println(i.toString()));
    }
}
