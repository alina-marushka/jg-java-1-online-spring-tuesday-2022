package students.vlad_stus.lesson_5.level_5.Task_31;

 class ArraysTest {


  public static void main(String[] args) {

   ArraysTest arraysTest = new ArraysTest();
   arraysTest.shouldCreateArray();

  }




  void shouldCreateArray() {
   Arrays arrays = new Arrays();
   int expectedResult = 10;
   int[] demoArrays = arrays.create(expectedResult);
   int actualResult =demoArrays.length;
   checkResult(expectedResult,actualResult, "Array test is " );

   }

   void checkResult(int expectedResult, int actualResult, String testName){
   if( expectedResult == actualResult){
    System.out.println(testName + "DONE ");}
   else{
    System.out.println(testName + "FAILED");
   }
   }
}


