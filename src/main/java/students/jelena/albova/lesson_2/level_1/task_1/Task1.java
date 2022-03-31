package students.jelena.albova.lesson_2.level_1.task_1;

public class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите 1 число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите 2 число:");
        int secondNumber = scanner.nextInt();

        int res1 = firstNumber + secondNumber;
        int res2 = firstNumber - secondNumber;
        int res3 = firstNumber * secondNumber;
        int res4 = firstNumber / secondNumber;

        System.out.println("Вывести результат : ");
        System.out.println(res1+"\n"+res2+"\n"+res3+"\n"+4);





    }
}
