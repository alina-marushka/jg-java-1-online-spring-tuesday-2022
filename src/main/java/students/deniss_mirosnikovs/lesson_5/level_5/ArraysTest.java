package students.deniss_mirosnikovs.lesson_5.level_5;

class ArraysTest {

    Arrays arrays = new Arrays();

    public static void main(String[] args) {

        ArraysTest test = new ArraysTest();

        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        int[] testArray = arrays.create(10);
        assertThatEqual("shouldCreateArray", testArray.length, 10);
    }

    public void shouldFindMaxNumber() {

        int[] testArray = {10, 30, 20, 50};
        assertThatEqual("shouldFindMaxNumber", arrays.findMax(testArray), 50);
    }

    public void shouldFindMinNumber() {
        int[] testArray = {10, 20, 30, 5};
        assertThatEqual("shouldFindMinNumber", arrays.findMin(testArray), 5);
    }

    public void assertThatEqual(String TestName, int actual, int expected) {
        if (actual == expected) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }
}
