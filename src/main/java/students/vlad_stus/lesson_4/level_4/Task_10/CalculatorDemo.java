package students.vlad_stus.lesson_4.level_4.Task_10;
import java.util.Scanner;

class CalculatorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();

        System.out.println();

        System.out.println("Введите второе  число");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
            int sumResult = calculator.sum(firstNumber, secondNumber);
        System.out.println("Сложение двух чисел =  "+sumResult );
            int subResult = calculator.subtraction(firstNumber, secondNumber);
        System.out.println("Вычитание двух чисел =  "+subResult );
            int divResult = calculator.division(firstNumber, secondNumber);
        System.out.println("Деление двух чисе =  "+divResult );
            int multResult = calculator.multiplication(firstNumber, secondNumber);
        System.out.println("Умножение двух числел =  "+multResult );




    }
}
