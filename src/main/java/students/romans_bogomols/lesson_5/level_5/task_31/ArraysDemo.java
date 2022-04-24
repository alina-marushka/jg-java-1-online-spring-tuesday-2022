package students.romans_bogomols.lesson_5.level_5.task_31;

class ArraysDemo {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        int[] test = arrays.create(4);
        arrays.fillRandomly(test);
        arrays.print(test);
        System.out.println();
        System.out.println("Max value is: " + arrays.findMax(test));
        System.out.println();
        System.out.printf("Min value is: " + arrays.findMin(test));

    }
}
