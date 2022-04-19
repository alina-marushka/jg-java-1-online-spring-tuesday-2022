package students.dmitry_makarov.lesson_3.level_7.task_26;

 class CurrencyDemo {
     public static void main(String[] args) {

         Currency currency1 = new Currency("Yuan", "China", 560,0.14 );
         currency1.consolePrint ();

         Currency currency2 = new Currency("Tugrik", "Mongolia", 1349, 0.0003);
         currency2.consolePrint();
     }
}
