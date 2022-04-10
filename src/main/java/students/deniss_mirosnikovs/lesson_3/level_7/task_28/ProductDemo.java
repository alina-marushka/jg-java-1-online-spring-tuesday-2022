package students.deniss_mirosnikovs.lesson_3.level_7.task_28;

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Milk");

        product.regularPrice = 100;
        product.discount = 25;
        product.printInformation();

        product.actualPrice();
    }
}
