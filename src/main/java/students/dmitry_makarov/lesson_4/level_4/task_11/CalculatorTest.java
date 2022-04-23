package students.dmitry_makarov.lesson_4.level_4.task_11;

 class CalculatorTest {
  public static void main(String[] args) {

   CalculatorTest calculatorTest = new CalculatorTest();
   calculatorTest.sumTest ();
   calculatorTest.subTest ();
   calculatorTest.divTest ();
   calculatorTest.multTest ();
   calculatorTest.isOddTest();
   calculatorTest.isEvenTest();
  }

  public void sumTest(){
   int firstNumber = 10;
   int secondNumber = 5;
   int expectedSum = 15;

   Calculator calculator = new Calculator();
   int realResult =calculator.sum (firstNumber, secondNumber);
   if (realResult == expectedSum){
    System.out.println("Sum test is OK");
   }
   else {
    System.out.println("Sum test FAIL");
   }
  }


  public void subTest(){
   int firstNumber = 10;
   int secondNumber = 5;
   int expectedSum = 5;

   Calculator calculator = new Calculator();
   int realResult =calculator.sub (firstNumber, secondNumber);
   if (realResult == expectedSum){
    System.out.println("Sub test is OK");
   }
   else {
    System.out.println("Sub test FAIL");
   }
  }

  public void divTest(){
   int firstNumber = 15;
   int secondNumber = 5;
   int expectedSum = 3;

   Calculator calculator = new Calculator();
   int realResult =calculator.div (firstNumber, secondNumber);
   if (realResult == expectedSum){
    System.out.println("Div test is OK");
   }
   else {
    System.out.println("Div test FAIL");
   }
  }

  public void multTest(){
   int firstNumber = 5;
   int secondNumber = 5;
   int expectedSum = 25;

   Calculator calculator = new Calculator();
   int realResult = calculator.mult (firstNumber, secondNumber);
   if (realResult == expectedSum){
    System.out.println("Mult test is OK");
   }
   else {
    System.out.println("Mult test FAIL");
   }
  }

  public void isOddTest () {
   int number = 5;
   boolean expectedIsEven = false;

   Calculator calculator = new Calculator();
   boolean realResult = calculator.isEven(number);
   if (realResult == expectedIsEven){
    System.out.println("Odd test is OK");
   }
   else {
    System.out.println("Odd test FAIL");
   }
  }


  public void isEvenTest () {
   int number = 4;
   boolean expectedIsEven = true;

   Calculator calculator = new Calculator();
   boolean realResult = calculator.isEven(number);
   if (realResult == expectedIsEven){
    System.out.println("Even test is OK");
   }
   else {
    System.out.println("Even test FAIL");
   }
  }

 }
