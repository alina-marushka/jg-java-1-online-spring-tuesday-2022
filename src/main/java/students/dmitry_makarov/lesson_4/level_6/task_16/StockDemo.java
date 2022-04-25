package students.dmitry_makarov.lesson_4.level_6.task_16;

 class StockDemo {
     public static void main(String[] args) {

         Stock stock = new Stock("GOOG", 50);
         String priceInformation = stock.getPriceInformation();
         System.out.println(priceInformation);


         stock.updatePrice(60);
         stock.getPriceInformation();
         stock.updatePrice(20);
         stock.updatePrice(80);
         stock.getPriceInformation();
         stock.updatePrice(15);
         stock.updatePrice(7);
         stock.updatePrice(14);
         priceInformation = stock.getPriceInformation();
         System.out.println(priceInformation);;
     }
 }
