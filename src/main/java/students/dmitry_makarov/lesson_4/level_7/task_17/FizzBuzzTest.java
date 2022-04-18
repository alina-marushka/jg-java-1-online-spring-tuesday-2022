package students.dmitry_makarov.lesson_4.level_7.task_17;

/*
Я не могу понять, что у меня описано не так, почему в тесте на последнем методе (который тестирует проверку на то,
что число не делится на 3 и не делится на 5) все время возвращает негативный ответ, хотя даже в классе FizzBuzzDemo
на консоль выводится правильное значение.

 */

class FizzBuzzTest {
  public static void main(String[] args) {

   FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
   fizzBuzzTest.devThree();
   fizzBuzzTest.devFive ();
   fizzBuzzTest.devThreeFive ();
   fizzBuzzTest.devNot();

  }

public void devThree () {
   int number = 9;
   String devExpected = "Fizz";

   FizzBuzz fizzBuzz = new FizzBuzz(number);
   String realResult =  fizzBuzz.detect();
   if (realResult == devExpected){
    System.out.println("Dev by 3 test is OK");
   }
   else {
    System.out.println("Dev by 3 test FAIL");
   }
}

   public void devFive () {
   int number = 10;
   String devExpected = "Buzz";

   FizzBuzz fizzBuzz = new FizzBuzz(number);
   String realResult =  fizzBuzz.detect();
   if (realResult == devExpected){
    System.out.println("Dev by 5 test is OK");
   }
   else {
    System.out.println("Dev by 5 test FAIL");
   }
  }

  public void devThreeFive () {
   int number = 15;
   String devExpected = "FizzBuzz";

   FizzBuzz fizzBuzz = new FizzBuzz(number);
   String realResult =  fizzBuzz.detect();
   if (realResult == devExpected){
    System.out.println("Dev by 3 and 5 test is OK");
   }
   else {
    System.out.println("Dev by 3 nd 5 test FAIL");
   }
  }

  public void devNot () {
   int number = 8;
   String devExpected = "8";

   FizzBuzz fizzBuzz = new FizzBuzz(number);
   String realResult =  fizzBuzz.detect();
   if (realResult == devExpected){
    System.out.println("Not devided test is OK");
   }
   else {
    System.out.println("Not devided test FAIL");
   }
  }
}
