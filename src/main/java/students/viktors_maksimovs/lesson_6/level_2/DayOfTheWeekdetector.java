package students.viktors_maksimovs.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String[] weekDay = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            return weekDay[dayNumber - 1];
        }
        return "Not correct day number";
    }


}
