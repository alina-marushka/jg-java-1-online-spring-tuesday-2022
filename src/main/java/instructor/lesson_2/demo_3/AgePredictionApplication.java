package instructor.lesson_2.demo_3;

public class AgePredictionApplication {

    public static void main(String[] args) {

        /*
            Тут можно писать все что угодно
            на любом языке и в любом виде (ну почти)
         */

        // Prepare special object to get user age
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Print prompt text
        System.out.println("Hello! What is your age today?");

        // prompt and assign prompted age to the userAge variable
        int userAge = scanner.nextInt();

        // Increment prompted age by 1 and assign to another temporary variable
        int userAgeNextYear = userAge + 1;

        // Print expected user's age next year
        System.out.println("Your age next year will be " + userAgeNextYear);

    }
}
