package students.romans_bogomols.lesson_3.level_7.task_28;

import java.util.Locale;

class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return regularPrice * (1 - discount / 100);
    }

    void printInformation() {
        System.out.println("Actual price of " + name.toLowerCase() + " is " + actualPrice());
    }
}
