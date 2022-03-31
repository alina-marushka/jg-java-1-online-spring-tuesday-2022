package students.jelena_albova.lesson_2.level_1.task_2;

public class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите 1 число :");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Введите 2 число :");
        double secondDoubleNumber = scanner.nextDouble();

        double res1 = firstDoubleNumber + secondDoubleNumber;
        double res2 = firstDoubleNumber - secondDoubleNumber;
        double res3 = firstDoubleNumber * secondDoubleNumber;
        double res4 = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Вывести результат :");
        System.out.println(res1+"\n"+res2+"\n"+res3+"\n"+res4);





    }
}
