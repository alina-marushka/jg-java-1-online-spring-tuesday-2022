package src.main.java.students.dmitry_makarov.lesson_2.level_1.task_1;

public class Task1 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt ();

        System.out.print( "Input second number: ");
        int num2 = scanner.nextInt ();
/*
        Здесь арифметические действия прописаны в самом методе.
        Но это показалось более громоздким, чем считать через
        отдельные переменные и выводить результат через них

        System.out.println( "X + Y = " + ( num1 + num2 ));
*/
        int sum = num1 + num2 ;
        int sub = num1 - num2 ;
        int mult = num1 * num2 ;
//        int div = num1 / num2 ; - при делении выводится число, округленное до целого.
//                                  Ниже исправлено введением переменной типа double
        double  div = num1 / (double)num2 ;

        System.out.println("X + Y = " + sum );
        System.out.println("X + Y = " + sub );
        System.out.println("X * Y = " + mult );
        System.out.println("X / Y = " + div );

    }
}
