package students.viktors_maksimovs.lesson_4.level_7.task_18;


class LeapYear {
    boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;

    }
}
