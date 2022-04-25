package students.vlad_stus.lesson_5.level_5.Task_31;

import java.util.Scanner;
import java.util.Random;

 class Arrays {

  Scanner scanner;
  Random random;

  Arrays(){
   this.scanner = new Scanner(System.in);
  }

  int [] create (int length){
   int[] massive = new int[length];
   return massive;
  }

  void fillRandomly(int[] array) {
  this.random = new Random();
   for (int i = 0; i < array.length; i++) {
    array[i] = random.nextInt(10);
   }


  }
  }

