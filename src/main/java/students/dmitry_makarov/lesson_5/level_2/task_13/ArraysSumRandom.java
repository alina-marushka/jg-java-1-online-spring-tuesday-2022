package students.dmitry_makarov.lesson_5.level_2.task_13;

import java.util.Random;

class ArraysSumRandom {
    public static void main(String[] args) {

        int numbers [] = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = random.nextInt(10);
        }
        int sum = 0 ;

        for (int i = 0 ; i < numbers.length ; i++ ){
            sum += numbers [i] ;
        }
        System.out.println(sum);
        System.out.println(numbers[0] + " ][ " + numbers[1] + " ][ " + numbers[2]);
    }
}