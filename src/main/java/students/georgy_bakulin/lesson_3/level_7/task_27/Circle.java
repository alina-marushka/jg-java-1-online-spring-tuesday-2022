package students.georgy_bakulin.lesson_3.level_7.task_27;

class Circle {

double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea(){
      return   Math.pow(radius,radius) * Math.PI;

    }
}



