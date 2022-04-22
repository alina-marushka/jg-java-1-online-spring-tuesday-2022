package students.deniss_mirosnikovs.lesson_4.level_7.task_18;

class LeapYear {

    public boolean isLeapYear(int year) {

        boolean leapYear = true;
        boolean notLeapYear = false;

        if (year % 4 == 0 && year % 100 !=0 || year % 100 == 0 && year % 400 == 0){
                return leapYear;
        }
        return notLeapYear;
    }
}
