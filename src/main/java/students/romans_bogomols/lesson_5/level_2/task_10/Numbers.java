package students.romans_bogomols.lesson_5.level_2.task_10;

class Numbers {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 13;
        numbers[1] = 3;
        numbers[2] = 99481;

        for (int number : numbers) {
            System.out.print(number);
            System.out.print(" ");
        }
    }
}