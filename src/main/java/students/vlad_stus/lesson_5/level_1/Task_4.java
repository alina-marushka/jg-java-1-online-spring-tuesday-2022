package students.vlad_stus.lesson_5.level_1;

import java.util.Arrays;

class Task_4 {


    public static void main(String[] args) {
        int[] numbers =  {1, 2, 3};
        numbers[1] = 5;
        System.out.println(Arrays.toString(numbers));

        numbers[numbers.length-1]=0;
        System.out.println(Arrays.toString(numbers));
    }
}
