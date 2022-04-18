/* Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Сделайте возможность указывать цвет собаки.
- Пусть цвет задаётся просто строкой: "Red", "Black", etc.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки, ее возраст и цвет.

PS: добавте свойство color в класс Dog,
добавте в конструктор класса новое свойство и сохраните его,
дополните метод voice() выводом цвета на консоль.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_3.level_5.task_20;

class Dog {

    String dogName;
    String dogColor;
    int dogAge;

    public Dog(String dogName, String dogColor, int dogAge) {
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    void voice() {
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog age: " + dogAge + " years");
        System.out.println("Dog color: " + dogColor);
    }
}
