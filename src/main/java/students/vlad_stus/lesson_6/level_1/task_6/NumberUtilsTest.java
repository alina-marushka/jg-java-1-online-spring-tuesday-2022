package students.vlad_stus.lesson_6.level_1.task_6;

 class NumberUtilsTest {

     public static void main(String[] args) {
         NumberUtilsTest  numberUtilsTest = new NumberUtilsTest();
         numberUtilsTest.isEvenTest();

     }


     void isEvenTest() {
         NumberUtils testUtil = new NumberUtils();
         boolean actualResult = testUtil.isEven(2);
         checkTestResult("isEvenTest", actualResult);
         }
 void checkTestResult(String testName, boolean result) {
         if (result) {
             System.out.println("\"" + testName + "\"" + " test = OK");
         } else {
             System.out.println("\"" + testName + "\"" + " test = FAIL");
         }
     }
     }
