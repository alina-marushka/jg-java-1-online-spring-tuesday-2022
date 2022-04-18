package students.dmitry_makarov.lesson_4.level_7.task_17;

 class FizzBuzz  {
    String fizz;
    String buzz;
    String fizzBuzz;
    int number;
    String print;

    FizzBuzz (int number){
        this.number= number;
    }

     public String detect (){
         this.fizz = "Fizz";
         this.buzz = "Buzz";
         this.fizzBuzz = "FizzBuzz";

         if (number%3==0 && number%5==0){
             return fizzBuzz;
         }
         else if (number%5==0){
             return buzz;
         }
         else if (number%3==0){
             return fizz;
         }
          else  {
  //           return " " + number ;
             return String.valueOf(number);
         }

     }

      void print () {
         this.print = detect ();
         System.out.println(print);
     }
}
