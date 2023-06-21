package lesson_2;

import java.io.FileWriter;
import java.util.Arrays;

/*2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
1 3 4 2
1 3 2 4
1 2 3 4 */
public class task_2 {
    public static void main(String[] args) {
        int[] array = {7,10,2,15,24,31};
        bubble(array);
    }
    public static void bubble(int[] array) {
        int temp;
        boolean sort = false;
        while(!sort){
            sort = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    sort = false;

                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]= temp;
                    log(array);
                }
                else {
                    log(array);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void log(int[] array) {
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            fw.write(Arrays.toString(array)+"\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("что то пошло не так");
        }
    }
}
