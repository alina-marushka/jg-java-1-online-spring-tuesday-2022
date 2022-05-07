package students.romans_bogomols.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.thursdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();
        dayOfTheWeekDetectorTest.notCorrectDayTest();
        dayOfTheWeekDetectorTest.notCorrectDayTest2();
    }

    DayOfTheWeekDetector dayOfTheWeek = new DayOfTheWeekDetector();

    void mondayTest() {
        assertThatEqual("Monday", dayOfTheWeek.findDayOfTheWeek(1), "Monday test is :");
    }

    void tuesdayTest() {
        assertThatEqual("Tuesday", dayOfTheWeek.findDayOfTheWeek(2), "Tuesday test is :");
    }

    void wednesdayTest() {
        assertThatEqual("Wednesday", dayOfTheWeek.findDayOfTheWeek(3), "Wednesday test is :");
    }

    void thursdayTest() {
        assertThatEqual("Thursday", dayOfTheWeek.findDayOfTheWeek(4), "Thursday test is :");
    }

    void fridayTest() {
        assertThatEqual("Friday", dayOfTheWeek.findDayOfTheWeek(5), "Friday test is :");
    }

    void saturdayTest() {
        assertThatEqual("Saturday", dayOfTheWeek.findDayOfTheWeek(6), "Saturday test is :");
    }

    void sundayTest() {
        assertThatEqual("Sunday", dayOfTheWeek.findDayOfTheWeek(7), "Sunday test is :");
    }

    void notCorrectDayTest() {
        assertThatEqual("Not correct day number", dayOfTheWeek.findDayOfTheWeek(19), "Not correct day number test is :");
    }

    void notCorrectDayTest2() {
        assertThatEqual("Not correct day number", dayOfTheWeek.findDayOfTheWeek(-2), "Not correct day number test is :");
    }

    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}
