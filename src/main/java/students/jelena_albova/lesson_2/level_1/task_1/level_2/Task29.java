package students.jelena_albova.lesson_2.level_1.task_1.level_2;

public class Task29 {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        double sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);


    }
}


   /* Исправьте ошибки компиляции в данной программе.

public class CorrectDataTypes {

    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        float sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}

Подсказка: в Java тип результата арифметической операции является
        типом самого широкого аргумента. То есть, если:
        int a = 1;
        long b = 2L;
        long result = a + b;

        типом результата операции сложения (a + b) будет long, так как
        тип long являтся более широким типом данных чем int.
        Широкий - в том смысле, что в переменной этого типа данных
        можно представить значения из большего диапазона.
        Диапазон типа данных long больше чем диапазон типа int. */
