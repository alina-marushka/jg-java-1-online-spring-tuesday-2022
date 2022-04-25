package students.deniss_mirosnikovs.lesson_4.level_7.task_17;

class FizzBuzz {

    public String detect(int number) {

        if (number % 3 == 0) {

            if (number % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";

        } else if (number % 5 == 0) {
            return "Buzz";

        } else {
            return "";
        }
    }
}
