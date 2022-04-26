package students.viktors_maksimovs.lesson_3.level_7.task_28;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Beef");
        product.discount = 5;
        product.regularPrice = 10;
        product.printInformation();
    }
}
