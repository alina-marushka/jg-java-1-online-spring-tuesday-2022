package students.dmitry_makarov.lesson_4.level_6.task_16;

 class StockDemo {
     public static void main(String[] args) {
         Stock google = new Stock("GOOG", 10);
         google.getPriceInformation();


        google.updatePrice(20,12,15);
        google.getPriceInformation();

         google.updatePrice(8,16,19);
         google.getPriceInformation();

         google.updatePrice(13,21,17);
         google.getPriceInformation();
     }
}
