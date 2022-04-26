package students.dmitry_makarov.lesson_3.level_3.task_10_11_12;

 class Robot {

     String name;

     Robot(String name){
         this.name = name;
     }

     public void sayHello () {
         System.out.println("Hello!");
     }

     public void sayYourName() {
         System.out.println("My name is" + name);
     }
}
