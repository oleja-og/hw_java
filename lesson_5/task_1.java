package lesson_5;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.text.StyledEditorKit.BoldAction;

/*Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

Пример меню:
1) Добавить контакт
2) Вывести всех
3) Выход

Иванов 123432
Иванов 546457
Иванов 788354

Map<String, ArrayList> ---- {Иванов:[23145, 456745, 56787], Петров:[4325, 45674]} */
public class task_1 {
    public static void main(String[] args) {
        Map<String, ArrayList> contacts = new HashMap<String, ArrayList>();
        boolean flag = true;
        while (flag) {
            System.out.println(" Справочник ");
            System.out.println(" 1) Добавить контакт \n 2) Вывести всех \n 3) Выход ");
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            switch (numb) {
                case "1":
                    add_contacts(contacts);
                    break;
                case "2":
                    all_contact(contacts);
                    break;
                case "3":
                    flag = exit(args);
                    break;
                default:
                    System.out.println("Ошибка");
                    break;

            }
        }
    }

    public static void add_contacts(Map<String, ArrayList> contacts) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(String.format("\033[%dA", 1)); // Move cursor up by 1 line
        System.out.print("\033[2K");
        System.out.println("введите имя :");
        String name = sc.nextLine();

        if (contacts.containsKey(name)) {
            ArrayList<String> numbers = new ArrayList();
            System.out.println("введите номер :");
            String number = sc.nextLine();
            numbers.add(contacts.get(name).toString().replace("[", "").replace("]", ""));
            numbers.add(number);
            Collections.sort(numbers);
            contacts.put(name, numbers);

        } else if (!contacts.containsKey(name)) {
            ArrayList<String> numbers = new ArrayList();
            System.out.println("введите номер :");
            String number = sc.nextLine();
            numbers.add(number);
            contacts.put(name, numbers);

        }
    }

    public static void all_contact(Map<String, ArrayList> contacts) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(String.format("\033[%dA", 1)); // Move cursor up by 1 line
        System.out.print("\033[2K");
        Map<String, ArrayList> sortedMap = new TreeMap<>(contacts);
        for (Map.Entry<String, ArrayList> item : sortedMap.entrySet()) {
            System.out.printf("имя %s телефоны %s \n", item.getKey(),
                    item.getValue().toString().replace("[", "").replace("]", ""));
        }
    }

    public static boolean exit(String[] args) {
        System.out.print(String.format("\033[%dA", 1)); // Move cursor up by 1 line
        System.out.print("\033[2K");
        System.out.println("Вы вышли !!!");
        boolean flag;
        flag = false;
        return flag;
    }
}
