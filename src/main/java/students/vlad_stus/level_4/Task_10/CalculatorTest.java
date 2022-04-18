package students.vlad_stus.level_4.Task_10;

 class CalculatorTest {

  public static void main(String[] args) {
   CalculatorTest calculatorTest = new CalculatorTest();

   calculatorTest.sumTest();
   calculatorTest.subtractionTest();
   calculatorTest.divisionTest();
   calculatorTest.multiplicationTest();

   //Task12
   calculatorTest.isEvenTest();

   //Task13
   calculatorTest.maxOfTwoNumbers();
}


void sumTest() {
   int firstNumber = 10;  // подготавливаем тестовые данные
   int secondNumber = 5;  // подготавливаем тестовые данные
   int expectedResult = 15;  // подготавливаем тестовые данные
   Calculator calculator = new Calculator();
   int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
   if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
    System.out.println("Sum test = OK");
   } else {
    System.out.println("Sum test = FAIL");
   }
  }

  void subtractionTest(){
   int firstNumber = 10; // подготавливаем тестовые данные
   int secondNumber = 5; // подготавливаем тестовые данные
   int expectedResult = 5; // подготавливаем тестовые данные
   Calculator calculator = new Calculator(); // вызываем продакшен код, который хотим протестировать
   int realResult = calculator.subtraction(firstNumber, secondNumber); // проверяем правильно ли сработал тестируемый код
   if (realResult == expectedResult) {
    System.out.println("Sub test = OK");
   } else {
    System.out.println("Sub test = FAIL");
   }
  }

  void divisionTest(){
   int firstNumber = 10; // подготавливаем тестовые данные
   int secondNumber = 5; // подготавливаем тестовые данные
   int expectedResult = 2; // подготавливаем тестовые данные
   Calculator calculator = new Calculator(); // вызываем продакшен код, который хотим протестировать
   int realResult = calculator.division(firstNumber, secondNumber); // проверяем правильно ли сработал тестируемый код
   if (realResult == expectedResult) {
    System.out.println("Sub test = OK");
   } else {
    System.out.println("Sub test = FAIL");
   }
  }

  void multiplicationTest(){
   int firstNumber = 10; // подготавливаем тестовые данные
   int secondNumber = 5; // подготавливаем тестовые данные
   int expectedResult = 50; // подготавливаем тестовые данные
   Calculator calculator = new Calculator(); // вызываем продакшен код, который хотим протестировать
   int realResult = calculator.multiplication(firstNumber, secondNumber); // проверяем правильно ли сработал тестируемый код
   if (realResult == expectedResult) {
    System.out.println("Sub test = OK");
   } else {
    System.out.println("Sub test = FAIL");
   }
  }

  //Task12

  void isEvenTest(){
   Calculator calculator = new Calculator(); // вызываем продакшен код, который хотим протестировать
   boolean realResult = calculator.isEven(10);
   boolean expectedResult = true;
   if (realResult == expectedResult){
    System.out.println("Even test = OK");
   }else{
    System.out.println("Even test = FAIL");
   }
  }

  //Task13

  void maxOfTwoNumbers(){
   int firstNumber = 10; // подготавливаем тестовые данные
   int secondNumber = 5; // подготавливаем тестовые данные
   int expectedResult = 10; // подготавливаем тестовые данные
   Calculator calculator = new Calculator(); // вызываем продакшен код, который хотим протестировать
  int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
   if (realResult == expectedResult){
    System.out.println("Even test = OK");
   }else{
    System.out.println("Even test = FAIL");
   }
  }
 }
