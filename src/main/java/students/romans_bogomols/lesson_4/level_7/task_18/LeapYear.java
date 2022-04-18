package students.romans_bogomols.lesson_4.level_7.task_18;

public class LeapYear {

    boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return  false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
