/* Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность увеличивать возраст собаки на один.

PS: научите собаку праздновать свой день рождения,
создайте в классе Dog метод:

    void happyBirthday() {
        // напишите тут команду увеличения возраста на 1
    }

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).

Создайте собаку,
заставьте её подать голос,
заставте её отпраздновать день рождение,
заставьте её подать голос снова и убедитесь в том,
что её возраст увеличился на 1.
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_3.level_5.task_19;

class Dog {

    String dogName;
    int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    void voice() {
        System.out.println(dogName + "!");
        System.out.println(dogName + "!");
        System.out.println(dogName + "!");

        System.out.println("Dog age is " + dogAge + " years");
    }

    void happyBirthday() {
        dogAge = dogAge + 1;
    }
}
