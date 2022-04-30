package students.vlad_stus.lesson_5.level_5.Task_31;

 class ArraysTest {


  public static void main(String[] args) {

   ArraysTest arraysTest = new ArraysTest();
   arraysTest.shouldCreateArray();
   arraysTest.shouldFindMaxNumber();
   arraysTest.shouldFindMinNumber();

  }



  Arrays arrays = new Arrays();
  void shouldCreateArray() {

   int expectedResult = 10;
   int[] demoArrays = arrays.create(expectedResult);
   int actualResult =demoArrays.length;
   checkResult(expectedResult,actualResult, "Array test is " );
   }


   void checkResult(int expectedResult, int actualResult, String testName) {
    if (expectedResult == actualResult) {
     System.out.println(testName + "DONE ");
    } else {
     System.out.println(testName + "FAILED");
    }
   }
   void shouldFindMaxNumber() {
     int[] testArray = {33, 20, 106, 99, 564};
     int expectedResult = testArray[4];
     int actualResult =  arrays.findMax(testArray);
     checkResult(expectedResult, actualResult, "Max Number test");

    }
    void shouldFindMinNumber(){
     int[] testArray = {33, 20, 106, 99, 564};
     int expectedResult = testArray[1];
     int actualResult =  arrays.findMin(testArray);
     checkResult(expectedResult, actualResult, "Min Number test");

    }
   }



