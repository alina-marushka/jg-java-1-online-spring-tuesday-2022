package students.romans_bogomols.lesson_6.level_3.task_12;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldFindNumber();
        test.shouldNotFindNumber();
        test.shouldFindNumberZero();
        test.shouldFindNegativeNumber();
        test.shouldNotFindNegativeNumber();
        test.numberMustCounterThreeTimes();
        test.numberMustNotCounter();
        test.negativeNumberMustCounterFiveTimes();
        test.mustReplaceZero();
        test.mustReplaceNegativeNumber();
        test.mustReplaceNumber();
        test.mustNotReplace();
        test.mustReplaceAll();
        test.mustReplaceAllNegative();
        test.mustNotReplaceAll();
    }
    ArrayService arrayService = new ArrayService();
    void shouldFindNumber() {
        int[] arr = {1,2,3,3,3};
        assertThatEqual(true, arrayService.contains(arr,3), "Should find number 3 test :");
    }
    void shouldFindNumberZero() {
        int[] arr = {1,2,3,3,3,0};
        assertThatEqual(true, arrayService.contains(arr,0), "Should find number 0 test :");
    }

    void shouldFindNegativeNumber() {
        int[] arr = {1,2,-53,3,3,0};
        assertThatEqual(true, arrayService.contains(arr,-53), "Should find number negative test :");
    }
    void shouldNotFindNegativeNumber() {
        int[] arr = {1,2,-534,3,3,0};
        assertThatEqual(false, arrayService.contains(arr,-53), "Should not find negative number  test :");
    }
    void shouldNotFindNumber() {
        int[] arr = {1,2,6,7,90};
        assertThatEqual(false, arrayService.contains(arr,3), "Should not find number 3 test :");
    }
    void numberMustCounterThreeTimes() {
        int[] arr = {22,36,22,99,99,22,22,5,6,99};
        assertThatEqual(3, arrayService.countOccurrences(arr, 99),"Number must counter three times test : " );
    }
    void numberMustNotCounter() {
        int[] arr = {22,36,22,99,99,22,22,5,6,99};
        assertThatEqual(0, arrayService.countOccurrences(arr, 991),"Number 991 not exist in this test : " );
    }
    void negativeNumberMustCounterFiveTimes() {
        int[] arr = {22,-12,36,-12,22,99,-12,99,22,22,-12,-12,12,5,6,99};
        assertThatEqual(5, arrayService.countOccurrences(arr, -12),"Negative number counter five times test : " );
    }
    void mustReplaceNegativeNumber() {
        int[] arr = {225,-112,-225,-142,242,99,-412,969,22,22,-12,-12,12,5,6,99};
        assertThatEqual(true, arrayService.replaceFirst(arr, -225, 320),"Replacing negative number test : " );
    }
    void mustReplaceNumber() {
        int[] arr = {225,-112,225,-142,242,99,-412,9,22,22,-12,-12,12,5,6,99};
        assertThatEqual(true, arrayService.replaceFirst(arr, 9, 666),"Replacing positive number test : " );
    }
    void mustReplaceZero() {
        int[] arr = {225,-112,225,-142,242,5,-412,9,22,22,-12,-12,12,5,6,0};
        assertThatEqual(true, arrayService.replaceFirst(arr, 0, 321),"Replacing zero test : " );
    }
    void mustNotReplace() {
        int[] arr = {225,-112,225,-142,242,5,-412,9,22,225123,-12,-12,12,5,6,0};
        assertThatEqual(false, arrayService.replaceFirst(arr, 33321, 3621),"Incorrect number test : " );
    }
    void mustReplaceAll() {
        int[] arr = {33,-112,225,-142,33,5,-412,9,22,33,-12,-12,33,5,6,0};
        assertThatEqual(4, arrayService.replaceAll(arr,33,34),"Replacing all numbers 33 test : " );
    }
    void mustNotReplaceAll() {
        int[] arr = {225,-112,88,-142,242,5,-412,9,22,225123,-12,-12,12,5,6,0};
        assertThatEqual(0, arrayService.replaceAll(arr, 1, 2),"Incorrect number test : " );
    }
    void mustReplaceAllNegative() {
        int[] arr = {225,-112,225,-112,242,5,412,9,22,225123,-112,12,12,5,6,0};
        assertThatEqual(3, arrayService.replaceAll(arr, -112, 65),"Must replace negative numbers : " );
    }
    void assertThatEqual(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
    void assertThatEqual(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}
