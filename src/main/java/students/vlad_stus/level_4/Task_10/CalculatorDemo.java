package students.vlad_stus.level_4.Task_10;


class CalculatorDemo {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        int summary = calculator.sum(5,7);
        int subtraction = calculator.subtraction(5,7);
        int division = calculator.division(5,7);
        int multiplication = calculator.multiplication(5,7);

        System.out.println("Сложение двух чисел: " + summary ) ;
        System.out.println("Вычитание двух чисел  " + subtraction );
        System.out.println("Деление двух чисел " + division );
        System.out.println("Умножение двух числе  " + multiplication );

    }
}

