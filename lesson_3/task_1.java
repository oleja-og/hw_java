package lesson_3;

import java.util.ArrayList;
import java.util.Arrays;

/* Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее ариф. значение*/
public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,4,8,2,5,7));
        System.out.println(array);
        del(array);
        min_array(array);
        max_array(array);
        mid_array(array);
    }
    public static void del(ArrayList<Integer>array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)%2 == 0) {
                array.remove(i);
                i--;
            }
        }
        System.out.println(array);
    }
    public static void min_array(ArrayList<Integer>array) {
        int min = array.get(0);
        for (int i = 0; i < array.size()-1; i++) {
            if (array.get(i)<min){
                min = array.get(i);
            }
        }
        System.out.println(min);
    }
    public static void max_array(ArrayList<Integer>array) {
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)>max){
                max = array.get(i);
            }
        }
        System.out.println(max);
     
    }
    public static void mid_array(ArrayList<Integer>array) {
        int mid = 0;
        for (int i = 0; i < array.size(); i++) {
            mid = mid + array.get(i);
        }
        mid = mid / array.size();
        System.out.println(mid);
    }
}
