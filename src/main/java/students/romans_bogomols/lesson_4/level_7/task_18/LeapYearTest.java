package students.romans_bogomols.lesson_4.level_7.task_18;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isNotDivideOnFour();
        leapYearTest.isNotDivideOnHundredAndFour();
        leapYearTest.isNotDivideOnHundredAndFourHundred();
        leapYearTest.isDivideOnFourAndHundredButNotOnFourHundred();
        leapYearTest.isDivideOnFour();
        leapYearTest.isDivideOnHundred();
        leapYearTest.isDivideOnHundredOnFourAndFourHundred();
        leapYearTest.isDivideOnHundredAndFourHundred();
    }
    void isNotDivideOnFour () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1966);
        assertThatEqual(false, actual, "1966 is not leap -");
}
    void isNotDivideOnHundredAndFour () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1423);
        assertThatEqual(false, actual, "1423 is not leap -");
    }
    void isNotDivideOnHundredAndFourHundred () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1500);
        assertThatEqual(false, actual, "1500 is not leap -");
    }
    void isDivideOnFourAndHundredButNotOnFourHundred () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1759);
        assertThatEqual(false, actual, "1759 is not leap -");
    }
    void isDivideOnFour () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1968);
        assertThatEqual(true, actual, "1968 is leap -");
    }
    void isDivideOnHundred () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(1900);
        assertThatEqual(false, actual, "1900 is not leap -");
    }
    void isDivideOnHundredOnFourAndFourHundred () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(2000);
        assertThatEqual(true, actual, "2000 is leap -");
    }
    void isDivideOnHundredAndFourHundred () {
        LeapYear year = new LeapYear();
        boolean actual = year.isLeapYear(2800);
        assertThatEqual(true, actual, "2800 is leap -");
    }
    void assertThatEqual(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}