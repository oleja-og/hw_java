package lesson_1;

import java.util.ArrayList;


/* Вывести все простые числа от 1 до 1000 */

public class task_2 {
    public static void main(String[] args) {
        int number = 1000;
        int count = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        for (int i = 2; i < number+1; i++) {
            for (int j = 2; j < i+1; j++) {
                if (i%j == 0){
                    count+=1;
                }
            }
            if (count <= 1){
                numbers.add(i);
            }
            count = 0;
        }
        System.out.println(numbers);
    }
}
