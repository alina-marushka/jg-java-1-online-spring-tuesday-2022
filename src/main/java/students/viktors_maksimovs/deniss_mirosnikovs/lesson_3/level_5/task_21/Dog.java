/* Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность менять цвет собаки на другой.

PS: создайте в классе Dog метод:

    void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
    }

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).

Создайте собаку,
заставьте её подать голос,
заставте её поменять цвет,
заставьте её подать голос снова и убедитесь в том,
что собака изменила свой цвет.
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_3.level_5.task_21;

class Dog {

    String dogName;
    String dogColor;

    String[] dogColors = {"Black", "White", "Brown", "Grey", "Ginger"};

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
        System.out.println();
    }

    void changeColor() {
        dogColor = dogColors[(int) (Math.random() * dogColors.length)];
        System.out.println("Dog color changed to " + dogColor);
        System.out.println();
    }
}
