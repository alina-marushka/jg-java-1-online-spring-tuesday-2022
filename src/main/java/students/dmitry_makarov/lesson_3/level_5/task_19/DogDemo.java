package src.main.java.students.dmitry_makarov.lesson_3.level_5.task_19;

class DogDemo {
     public static void main(String[] args) {
         Dog dog1 = new Dog("Hatiko", 56, "Black") ;
         dog1.voice();
         dog1.changeColor("Red");
         dog1.voice();

         Dog dog2 = new Dog ("Mukhtar", 13, "Undefined");
         dog2.voice();
         dog2.agePlus(5);
         dog2.changeColor("Chaotic grey");
         dog2.voice();
     }
}
