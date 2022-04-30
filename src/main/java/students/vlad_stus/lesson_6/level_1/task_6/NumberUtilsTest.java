package students.vlad_stus.lesson_6.level_1.task_6;

 class NumberUtilsTest {

     NumberUtilsTest utilTest = new NumberUtilsTest();
     utilTest.isEvenTest();


     void isEvenTest() {
         NumberUtils testUtil = new NumberUtils();
         int expectResult = 10;
         int acutalResult = testUtil.isEven(expectResult);
         if(expectResult == acutalResult){
             System.out.println("Test Done!");
         }
     }
 }