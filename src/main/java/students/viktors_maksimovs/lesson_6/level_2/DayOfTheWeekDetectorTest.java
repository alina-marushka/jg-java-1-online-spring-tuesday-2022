package students.viktors_maksimovs.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.monday();
        test.tuesday();
        test.wednesday();
        test.thursday();
        test.friday();
        test.saturday();
        test.sunday();
        test.wrongDay();
        test.wrongDayZero();
    }

    public void monday() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(1);
        assertThatEqual("Monday", actual, "Monday test");
    }

    public void tuesday() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(2);
        assertThatEqual("Tuesday", actual, "Tuesday test");
    }

    public void wednesday() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(3);
        assertThatEqual("Wednesday", actual, "Wednesday test");
    }

    public void thursday() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(4);
        assertThatEqual("Thursday", actual, "Thursday test");
    }

    public void friday() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(5);
        assertThatEqual("Friday", actual, "Friday test");
    }

    public void saturday() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(6);
        assertThatEqual("Saturday", actual, "Saturday test");
    }

    public void sunday() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(7);
        assertThatEqual("Sunday", actual, "Sunday test");
    }

    public void wrongDay() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(255);
        assertThatEqual("Not correct day number", actual, "Wrong day test");
    }

    public void wrongDayZero() {
        DayOfTheWeekDetector monday = new DayOfTheWeekDetector();
        String actual = monday.findDayOfTheWeek(0);
        assertThatEqual("Not correct day number", actual, "Wrong day test");
    }

    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }


}
