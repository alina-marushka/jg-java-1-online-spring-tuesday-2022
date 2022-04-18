/* Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность указывать возраст собаки.
- Возраст указывается в годах (целам числом).
- Возраст собаке дают в момент создания.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки и ее возраст.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_3.level_5.task_18;

class Dog {

    String dogName;
    int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    void voice() {
        System.out.println("Dog name is " + dogName);
        System.out.println("Dog age is " + dogAge + " years");
    }
}
