package students.viktors_maksimovs.lesson_5.level_5;

class ArrayTest {
    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMaxNumberOne();
        test.shouldFindMinNumber();
        test.shouldFindMinNumberOne();
        test.shouldFindMinNumberTwo();


    }

    Arrays array = new Arrays();
    public void shouldCreateArray() {
        int[] values = array.create(4);
        assertThatEqual(4, values.length, "Arrays length test");
    }

    public void shouldFindMaxNumber() {
        int[] values = {1, 5, 10, 15, 20};
        assertThatEqual(20, array.findMax(values), "Arrays Max value test");
    }

    public void shouldFindMaxNumberOne() {
        int[] values = {100, -29, 10, 15, 20};
        assertThatEqual(100, array.findMax(values), "Arrays Max value test");
    }

    public void shouldFindMinNumber() {
        int[] values = {100, -29, 10, 15, 20};
        assertThatEqual(-29, array.findMin(values), "Arrays Min value test");
    }

    public void shouldFindMinNumberOne() {
        int[] values = {-140, -29, 10, -141, 0};
        assertThatEqual(-141, array.findMin(values), "Arrays Min value test");
    }

    public void shouldFindMinNumberTwo() {
        int[] values = {100, 25, 3, 15, 20};
        assertThatEqual(3, array.findMin(values), "Arrays Min value test");
    }

    void assertThatEqual(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }
}
