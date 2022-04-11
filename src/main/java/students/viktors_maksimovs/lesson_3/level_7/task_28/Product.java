package students.viktors_maksimovs.lesson_3.level_7.task_28;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return regularPrice * (1-discount/100);
    }

    void printInformation() {
        System.out.println(name + " current price is $"+actualPrice());
    }
}

