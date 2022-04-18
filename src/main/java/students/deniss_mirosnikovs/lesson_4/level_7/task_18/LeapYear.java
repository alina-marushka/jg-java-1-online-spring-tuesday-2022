package students.deniss_mirosnikovs.lesson_4.level_7.task_18;

class LeapYear {

    boolean leapYear = true;
    boolean notLeapYear = false;

    public boolean isLeapYear(int year) {

        if (year % 4 != 0) {
            return notLeapYear;

        } else if (year % 100 != 0) {
            return leapYear;

        } else if (year % 100 == 0) {

            if (year % 400 == 0) {
                return leapYear;
            }

        } else {
            return notLeapYear;
        }
        return isLeapYear(year);
    }
}
