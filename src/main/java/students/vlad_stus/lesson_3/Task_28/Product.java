package students.vlad_stus.lesson_3.Task_28;

 class Product {

    String name;
    double regularPrice;
    double discount;

    Product( String name,double regularPrice,  double discount){
        this.name=name;
     this.regularPrice = regularPrice;
     this.discount =discount;
    }

     double actualPrice(){
         return regularPrice * (1-  discount/100);
     }
     void printInformation(){
         System.out.println("Actual price of " + name + "is " + actualPrice() + "$");
     }

    }

