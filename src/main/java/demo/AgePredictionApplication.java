package demo;

public class AgePredictionApplication {
    public static void main(String[] args) {

        // Prepare special object for user input recive
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Hello! What is your age today?");
        int userAge = scanner.nextInt();

        int userAgeNextYear = userAge + 1;
        System.out.println("Your age next year will be "+ userAgeNextYear);


    }
}
