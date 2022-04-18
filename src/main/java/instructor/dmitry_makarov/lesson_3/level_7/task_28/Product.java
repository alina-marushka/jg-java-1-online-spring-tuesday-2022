package instructor.dmitry_makarov.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;
    double actualPrice;

    Product (String name){
        this.name = name;
    }

   void calculation (double regularPrice, double discount){
       double actualPrice = regularPrice - (regularPrice * discount)/100;
       this.actualPrice=actualPrice;
    }


    void printInformation () {
        System.out.println(actualPrice);
    }
}
