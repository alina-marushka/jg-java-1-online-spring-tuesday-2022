package students.sergejs_nichiporenko.lesson_6.level_1;

public class NumberUtilsTest {
    NumberUtils number = new NumberUtils();

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.evenNumberTest();
        test.oddNumberTest();
    }

    public void evenNumberTest(){
        assertEquals(number.isEven(2), true );
    }

    public void oddNumberTest(){
        assertEquals(number.isEven(3),false );
    }

    public void assertEquals(boolean actual, boolean expected){
        if (actual == expected){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
