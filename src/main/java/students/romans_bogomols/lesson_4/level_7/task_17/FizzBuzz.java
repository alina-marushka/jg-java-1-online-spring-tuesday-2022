package students.romans_bogomols.lesson_4.level_7.task_17;

class FizzBuzz {

    //    String detect(int number) {
//        if (number % 3 == 0) {
//            return "Fizz";
//        } else if (number % 5 == 0) {
//            return "Buzz";
//        } else if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        } else {
//            return "" + number;
//        }
//    }
//}
    String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}