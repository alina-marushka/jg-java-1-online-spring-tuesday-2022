package students.vlad_stus.level_4.Task_10;
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
            int summary = calculator.sum(firstNumber, secondNumber);
        System.out.println("Сложение двух чисел =  "+summary );
            int subtraction = calculator.subtraction(firstNumber, secondNumber);
        System.out.println("Вычитание двух чисел =  "+subtraction );
            int division = calculator.division(firstNumber, secondNumber);
        System.out.println("Деление двух чисе =  "+division );
            int multiplication = calculator.multiplication(firstNumber, secondNumber);
        System.out.println("Умножение двух числел =  "+multiplication );




    }
}
