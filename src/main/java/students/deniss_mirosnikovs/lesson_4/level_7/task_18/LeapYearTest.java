package students.deniss_mirosnikovs.lesson_4.level_7.task_18;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();

        leapYearTest.isLeapYearTest();
        leapYearTest.isNotLeapYearTest();
    }

    public void isLeapYearTest() {

        LeapYear leapYear = new LeapYear();
        boolean realResult1 = leapYear.isLeapYear(2016);
        boolean realResult2 = leapYear.isLeapYear(2020);
        boolean realResult3 = leapYear.isLeapYear(2024);

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.resultChecker("This years is leap years!", true,
                                    realResult1, realResult2, realResult3);
    }

    public void isNotLeapYearTest() {

        LeapYear leapYear = new LeapYear();
        boolean realResult1 = leapYear.isLeapYear(2021);
        boolean realResult2 = leapYear.isLeapYear(2022);
        boolean realResult3 = leapYear.isLeapYear(2023);

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.resultChecker("This years is not leap years!", false,
                                    realResult1, realResult2, realResult3);
    }

    public void resultChecker(String TestName, boolean expectedResult,
                              boolean result1, boolean result2, boolean result3) {

        if (result1 == expectedResult && result2 == expectedResult && result3 == expectedResult) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }
}
