package students.romans_bogomols.lesson_3.level_7.task_27;

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return radius * radius * Math.PI;

    }
}
