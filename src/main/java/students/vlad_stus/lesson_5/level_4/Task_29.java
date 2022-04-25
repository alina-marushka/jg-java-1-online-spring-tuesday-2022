package students.vlad_stus.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_29 {

    public static void main(String[] args) {


        Random random = new Random ();
        int [] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
           numbers[i]= random.nextInt(100);
            System.out.println(numbers[i]);
            }
//нахождение четных чисел:
            for (int i = 0; i < numbers.length; i++) {
                numbers[i]= random.nextInt(10);
                if(numbers[i]%2==0){
                    System.out.println("Index: " + i + " Четное число:"+  numbers[i]);}
                    else if(numbers[i]%2!=0){
                        System.out.println("Index: " + i + " Нечетное число:"+  numbers[i]);
                    }
            }
        System.out.println("Arrays: " + Arrays.toString(numbers));
        }

    }

