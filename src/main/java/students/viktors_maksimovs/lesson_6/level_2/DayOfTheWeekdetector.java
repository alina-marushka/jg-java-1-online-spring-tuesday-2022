package students.viktors_maksimovs.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String[] weekDay = {"Not correct day number", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber>1 && dayNumber < 8) {
            return weekDay[dayNumber];
        } return "Not correct day number";
    }


}
