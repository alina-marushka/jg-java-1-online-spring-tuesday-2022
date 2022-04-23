package students.viktors_maksimovs.lesson_4.level_7.task_19;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    void sumTest() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(35,40);
        assertThatEqualInt(75, actual,"Sum test ");
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        assertThatEqualInt(20, calculator.sub(35,15),"Subtraction test " );

    }

    void mulTest() {
        Calculator calculator = new Calculator();
        assertThatEqualInt(25, calculator.mul(5,5),"Multiplication test " );
    }

    void divTest() {
        Calculator calculator = new Calculator();
        assertThatEqualInt(5, calculator.div(40,8),"Division test " );
    }

    void isEvenTest1() {
        Calculator calculator = new Calculator();
        assertThatEqualBoolean(true, calculator.isEven(40),"Even test is true" );
    }

    void isEvenTest2() {
        Calculator calculator = new Calculator();
        assertThatEqualBoolean(false, calculator.isEven(41), "Even  test is false" );
    }
    void assertThatEqualInt(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }
    void assertThatEqualBoolean(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }
}
