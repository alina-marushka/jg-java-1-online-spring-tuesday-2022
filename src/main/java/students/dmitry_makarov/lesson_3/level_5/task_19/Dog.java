package src.main.java.students.dmitry_makarov.lesson_3.level_5.task_19;

 class Dog {

  String dogName;
  int dogAge;
  String dogColor;

  Dog (String dogName, int dogAge, String dogColor) {
   this.dogName = dogName;
   this.dogAge = dogAge;
   this.dogColor = dogColor;
  }

  void agePlus (int plus) {
 dogAge += plus;
 this.dogAge=dogAge;
  }

  void changeColor(String newColor){
  dogColor = newColor;
  }

  void voice () {
   System.out.println(dogName + " " + dogAge + " " + dogColor);
  }
 }
