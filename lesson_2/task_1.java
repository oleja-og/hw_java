package lesson_2;

import java.util.Scanner;
import java.util.ArrayList;
/*1) Дана строка sql-запроса "select * from students WHERE ".
 Сформируйте часть WHERE этого запроса, используя StringBuilder. 
 Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow */
public class task_1 {
    public static void main(String[] args) {
        String str = "select * from students WHERE";
        Scanner sk = new Scanner(System.in);
        String text = sk.nextLine();
        text = string_bd(text);
        text = string_bd(del_null(text));
        text = add_and(text);
        str = str + " " + text;
        System.out.println(str);  
        }
    public static String string_bd(String text) {
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ':'){
                    sb.append("=");
                }
                else if (text.charAt(i) == ','){
                    sb.append(" ");
                }
                else if (text.charAt(i) != ' ' && text.charAt(i) != '\n' && text.charAt(i) != '.' && text.charAt(i) != '!' && text.charAt(i) != ')' && text.charAt(i) != '"'
                 && text.charAt(i) != ';' && text.charAt(i) != '?' && text.charAt(i) != '*' && text.charAt(i) != '(' && text.charAt(i) != ']' && text.charAt(i) != '[' ) {
                    sb.append(text.charAt(i));
                }
            }      
            
            text = sb.toString();
            return text;
            
        }
    public static String del_null(String text) {
            String[] words;
            String delitel = " ";
            words = text.split(delitel);
            ArrayList<String> words2 = new ArrayList<String>();
            for (int i = 0; i < words.length; i++) {
                words2.add(words[i]);
                String search = words[i];
                if (search.contains("null")) {
                    words2.remove(words[i]);
                }
            }
            text = String.valueOf(words2);
            return text;
    }
    public static String add_and(String text) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' '){
                    sb.append(" AND");
                }
                sb.append(text.charAt(i));
            }      
            
            text = sb.toString();
            return text;
            
        }
}
    

