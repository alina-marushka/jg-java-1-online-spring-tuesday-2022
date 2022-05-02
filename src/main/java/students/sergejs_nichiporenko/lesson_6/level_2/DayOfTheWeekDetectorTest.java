package students.sergejs_nichiporenko.lesson_6.level_2;

public class DayOfTheWeekDetectorTest {
    DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

        test.mondayTest();
        test.tuesdayTest();
        test.wednesdayTest();
        test.thursdayTest();
        test.fridayTest();
        test.saturdayTest();
        test.sundayTest();
        test.incorrectDayTest();
    }

    public void mondayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(1), "Monday");
    }

    public void tuesdayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(2), "Tuesday");
    }

    public void wednesdayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(3), "Wednesday");
    }

    public void thursdayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(4), "Thursday");
    }

    public void fridayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(5), "Friday");
    }

    public void saturdayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(6), "Saturday");
    }

    public void sundayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(7), "Sunday");
    }

    public void incorrectDayTest() {
        assertEquals(dayOfTheWeekDetector.findDayOfTheWeek(8), "Not correct day number");
    }

    public void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println(expected + " Test passed!");
        } else {
            System.out.println(expected + " Test failed!");
        }
    }
}
