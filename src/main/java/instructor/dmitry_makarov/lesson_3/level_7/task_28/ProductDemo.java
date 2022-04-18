package instructor.dmitry_makarov.lesson_3.level_7.task_28;

 class ProductDemo {
     public static void main(String[] args) {
         Product product = new Product ("smthng");
         product.calculation(100,20.5);
         product.printInformation();

         Product product1 = new Product("PS5");
         product1.calculation(927, 15);
         product1.printInformation();

         Product product2 = new Product("test");
         product2.calculation(200,13);
         product2.printInformation();
     }
}
