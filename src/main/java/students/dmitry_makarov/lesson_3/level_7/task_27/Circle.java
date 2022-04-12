package students.dmitry_makarov.lesson_3.level_7.task_27;

class Circle {

    double radius;

        Circle (double radius){
        this.radius = radius;
    }

    void calculateArea (){
       double area = Math.PI * Math.pow( radius, 2);
        System.out.println("Circle radius is " + area);

    }

  }
