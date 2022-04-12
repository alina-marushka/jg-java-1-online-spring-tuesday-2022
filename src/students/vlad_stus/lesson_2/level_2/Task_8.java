package students.vlad_stus.lesson_2.level_2;

import java.util.Scanner;
public class Task_8 {

    public static void main(String[] args) {
        System.out.println("Добрый день! Введите Ваше Имя Пользователя.");

        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите Имя:  ");
        String nameOfPerson = scanner.next();

        System.out.println("Введите Фамилию: ");
        String surnameOfPerson = scanner.next();

        System.out.println("Hello " + nameOfPerson + " " +  surnameOfPerson );
    }
}
