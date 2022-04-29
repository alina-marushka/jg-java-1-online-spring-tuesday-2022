package students.deniss_mirosnikovs.lesson_5.level_5;

class ArrayDemo {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();
        int[] arrayDemo = arrays.create(10);

        arrays.fillRandomly(arrayDemo);
        arrays.print(arrayDemo);

        System.out.println("Max number in array: " + arrays.findMax(arrayDemo));
        System.out.println("Min number in array: " + arrays.findMin(arrayDemo));
    }
}
