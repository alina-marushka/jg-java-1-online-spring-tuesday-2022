package students.dmitry_makarov.lesson_4.level_4.task_14;

/*
Класс с тестированием вышлю со следующими заданиями из этого урока.
Пока у меня не получается даже представить, как эти тесты описать компактно.
Получается как-то слишком громоздко, хотя чувствую, что можно всё значительно упростить.
 */

 class Calculator {

     public int sum(int firstNumber, int secondNumber) {
         return firstNumber + secondNumber;
     }

     public int sub(int firstNumber, int secondNumber) {
         return firstNumber - secondNumber;
     }

     public int div(int firstNumber, int secondNumber) {
         return firstNumber / secondNumber;
     }

     public int mult(int firstNumber, int secondNumber) {
         return firstNumber * secondNumber;
     }

     public boolean isEven(int number) {
         if (number % 2 == 0) {
             return true;
         } else {
             return false;
         }
     }

     public int maxNumber(int firstNumber, int secondNumber) {
         if (firstNumber > secondNumber) {
             return firstNumber;
         } else if (firstNumber < secondNumber) {
             return secondNumber;
         } else {
             return firstNumber + secondNumber;
         }
     }

       public int maxNumberOfThree(int firstNumber, int secondNumber, int thirdNumber) {
           if (firstNumber > secondNumber && firstNumber > thirdNumber) {
               return firstNumber; }
           else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
               return firstNumber ; }
           else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
               return secondNumber; }
           else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
               return secondNumber;}
           else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
               return thirdNumber;}
           else if (thirdNumber == firstNumber && thirdNumber > secondNumber) {
               return thirdNumber;}
           else {
               return thirdNumber;
           }
       }

     }



