package students.dmitry_makarov.lesson_3.level_5.task_18;

 class Dog {

  String dogName;
  int dogAge;

  Dog (String dogName, int dogAge) {
   this.dogName = dogName;
   this.dogAge = dogAge;
  }

  void voice () {
   System.out.println(dogName + " " + dogAge);
  }
 }
