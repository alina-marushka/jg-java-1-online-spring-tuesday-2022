package students.viktors_maksimovs.lesson_4.level_7.task_18;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest yearTest = new LeapYearTest();
        yearTest.divOnFour();
        yearTest.divOnHundred();
        yearTest.divOnHundredAndFourHundred();
        yearTest.divOnFourOnHundredOnFourHundred();
        yearTest.divNotFour();
        yearTest.divNotHundredAndFourHundred();
        yearTest.divNotFourAndHundred();


    }

    void divOnFour() {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1888);
        assertThatEquals(true, actual, "1888 year is Leap year");
    }

    void divNotFour() {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1901);
        assertThatEquals(false, actual, "1901 year is not Leap year");
    }
    void divOnHundred() {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1900);
        assertThatEquals(false, actual, "1900 year is not Leap year");
    }

    void divOnHundredAndFourHundred() {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(2000);
        assertThatEquals(true, actual, "2000 year Leap year");
    }

    void divNotHundredAndFourHundred() {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1300);
        assertThatEquals(false, actual, "1300 year is not Leap year");
    }

    void divOnFourOnHundredOnFourHundred() {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(2400);
        assertThatEquals(true, actual, "2400 year Leap year");

    }

    void divNotFourAndHundred() {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1231);
        assertThatEquals(false, actual, "1300 year is not Leap year");
    }







    void assertThatEquals(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }
}
