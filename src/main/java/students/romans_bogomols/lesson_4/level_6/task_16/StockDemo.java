package students.romans_bogomols.lesson_4.level_6.task_16;

class StockDemo {

    public static void main(String[] args) {
        Stock stock = new Stock("Google", 10);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(12);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(5);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(7);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(99);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(77);
        System.out.println(stock.getPriceInformation());
    }

}
