package students.dmitry_makarov.lesson_4.level_4.task_13;

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

    public int maxNumber(int firstNumber, int secondNumber ){
        if (firstNumber > secondNumber){
            return firstNumber;
        }
        else if (firstNumber < secondNumber){
            return secondNumber;
        }
        else {
           return firstNumber + secondNumber;
        }
    }
 }

