package students.viktors_maksimovs.lesson_5.level_5;


class ArrayDemo {
    public static void main(String[] args) {

        Arrays array = new Arrays();
        int[] userArray = array.create(10);
        array.fillRandomly(userArray);
        array.print(userArray);
        System.out.println();
        System.out.println("max value " +array.findMax(userArray));
        System.out.println("min value "+ array.findMin(userArray));

        userArray = array.create(20);
        array.print(userArray);
        array.fillRandomly(userArray);
        System.out.println();
        array.print(userArray);


    }

}
