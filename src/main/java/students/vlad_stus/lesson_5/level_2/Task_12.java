package students.vlad_stus.lesson_5.level_2;



class Task_12 {
    public static void main(String[] args) {

        //Заполнение массива последовательными числами от 0 до 9
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() *10);

            /* (int) - приведение к целому
            Math.random - варирует от 1 до 1
             умножение на 10  и все в скобках (Math.random() *10)
             то на выходе получим рандомные числа от 0 до 10 */
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
   /*     System.out.println(Math.random());*/


    }
}