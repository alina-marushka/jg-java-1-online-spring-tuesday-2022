package students.viktors_maksimovs.lesson_3.level_5.task_18;

class Dog {

    String name;
    int age;
    String color;

    Dog (String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
void voice() {
        System.out.println(name +", "+ age+ ", "+ color);

}

void happyBirthday() {
        age++;
}

void changeColor(String newColor) {
        color = newColor;

    }

}
