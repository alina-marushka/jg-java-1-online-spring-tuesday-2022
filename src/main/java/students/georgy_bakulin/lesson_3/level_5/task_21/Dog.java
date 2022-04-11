package students.georgy_bakulin.lesson_3.level_5.task_21;

 class Dog {

  String color;
  String[] colors= {"Isabella", "black", "brown" ,"red",
          "field", "apricot", "blue", "white", "sable gray", "sable red",
          "black sable", "tan", "dark mask", "reverse mask", "Irish spotting", "piebald"};

  int age;

  public Dog(String color, int age) {
   this.color = color;
   this.age = age;
  }


  void changeColor(String newColor) {
   color = colors[(int) (Math.random() * colors.length)];
   System.out.println("New Dog's color"+ "" + color);
   System.out.println("Dog's age is " + age + "years old ");
   System.out.println();
  }
  void voice(){
   System.out.println("Dog's color is : " + color);
   System.out.println();
  }
}
