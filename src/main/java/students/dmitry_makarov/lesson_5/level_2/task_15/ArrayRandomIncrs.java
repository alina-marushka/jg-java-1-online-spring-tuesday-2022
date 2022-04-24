package students.dmitry_makarov.lesson_5.level_2.task_15;

import java.util.Random;

class ArrayRandomIncrs {
    public static void main(String[] args) {


        int num [] = new int[3];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num [i] = random.nextInt(10);

        }
       System.out.println("[ " + num[0] + " ]  [ " +num[1] + " ]  [ " + num[2] + " ]");

        for (int i = 0; i < num.length; i++) {
          num [i] = num[i] + 2;
        }

        System.out.println("[ " + num[0] + " ]  [ " +num[1] + " ]  [ " + num[2] + " ]");


    }
}


