package lesson_2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/*3) Дана строка в файле(читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит строчку и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */
public class task_3 {
    public static void main(String[] args) {
        String text = freader(args);
        
        text = pars(text);
        
        text = pars2(text);
        
    }
    public static String freader(String[] args)  {
        String text = null;
        try (FileReader fr = new FileReader("task3.txt")) {
            text = new Scanner(fr).nextLine();
        } catch (Exception e) {
            System.out.println("ошибка!!!");
        }
        return text;
    }
    public static String pars(String text) {
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ':'){
                    sb.append("=");
                }
                else if (text.charAt(i) == ','){
                    sb.append(" ");
                }
                else if (text.charAt(i) != '{' && text.charAt(i) != '}' && text.charAt(i) != ' ' && text.charAt(i) != '\n' && text.charAt(i) != '.' && text.charAt(i) != '!' && text.charAt(i) != ')' && text.charAt(i) != '"'
                 && text.charAt(i) != ';' && text.charAt(i) != '?' && text.charAt(i) != '*' && text.charAt(i) != '(' && text.charAt(i) != ']' && text.charAt(i) != '[' ) {
                    sb.append(text.charAt(i));
                }
            }      
            
            text = sb.toString();
            return text;
    }
    public static String pars2(String text) {
        StringBuilder sb = new StringBuilder();
        String student = "Студент";
        String score = "получил";
        String subject = "по предмету";
        String[] words;
        String delitel = " ";
        words = text.split(delitel);
        ArrayList<String> words2 = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            words2.add(words[i]);
            String search = words[i];
            if (search.contains("фамилия=")) {
                sb.append(student+" "+search.substring(8)+" ");
                
            }
            else if (search.contains("оценка=")) {
                sb.append(score+" "+search.substring(7)+ " ");
                
            }
            else if (search.contains("предмет=")) {
                sb.append(subject+" "+search.substring(8)+"."+"\n");
               
            }
        }
        System.out.println(sb.toString());
        text = String.valueOf(words2);
        return text;
    }
    
}
