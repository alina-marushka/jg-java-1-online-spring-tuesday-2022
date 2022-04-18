package students.viktors_maksimovs.lesson_4.level_6.task_16;

class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 27);
        System.out.println(google.priceInformation());
        google.updatePrice(56);
        google.updatePrice(66);
        google.updatePrice(23);
        System.out.println(google.priceInformation());
        google.updatePrice(15);
        google.updatePrice(54);
        System.out.println(google.priceInformation());



    }
}
