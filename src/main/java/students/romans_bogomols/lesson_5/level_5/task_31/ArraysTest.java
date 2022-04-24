package students.romans_bogomols.lesson_5.level_5.task_31;

class ArraysTest {
    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMaxNumber1();
        test.shouldFindMaxNumber2();
        test.shouldFindMinNumber();
        test.shouldFindMinNumber1();
        test.shouldFindMinNumber2();

    }
    Arrays arrays = new Arrays();
    void shouldCreateArray() {
        int[] values = arrays.create(4);
        assertThatEqual(4, values.length, "Arrays length test");
    }
    void shouldFindMaxNumber() {
        int[] values = {1, 2, 3, 4, 5};
        assertThatEqual(5, arrays.findMax(values),"Max number test");
    }
    void shouldFindMaxNumber1() {
        int[] values = {99, 2, 3, 4, 5};
        assertThatEqual(99, arrays.findMax(values),"Max number test1");
    }
    void shouldFindMaxNumber2() {
        int[] values = {1, 2, 59, 4, 5};
        assertThatEqual(59, arrays.findMax(values),"Max number test2");
    }
    void shouldFindMinNumber() {
        int[] values = {15, 66, 1, 13, 99995};
        assertThatEqual(1,arrays.findMin(values), "Min number test");
    }
    void shouldFindMinNumber1() {
        int[] values = {15, 66, 1414, 13111, 99995};
        assertThatEqual(15,arrays.findMin(values), "Min number test1");
    }
    void shouldFindMinNumber2() {
        int[] values = {15, 66, -9999, 1443, -99995};
        assertThatEqual(-99995,arrays.findMin(values), "Min number test2");
    }

    void assertThatEqual(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}

