package students.deniss_mirosnikovs.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        Stock tesla = new Stock("TSLA", 10);

        String priceInformation = tesla.getPriceInformation();
        System.out.println(priceInformation);

        tesla.updatePrice(10);
        tesla.updatePrice(12);
        tesla.updatePrice(5);
        tesla.updatePrice(7);
        tesla.updatePrice(99);
        tesla.updatePrice(77);

        priceInformation = tesla.getPriceInformation();
        System.out.println(priceInformation);

        stockTest.stockTest();
        stockTest.maximumTest();
        stockTest.maximumForTwoPeriodsTest();
        stockTest.maximumForThreePeriodsTest();
        stockTest.maximumForFourPeriodsTest();
        stockTest.maximumForTwoPeriodsTest1();
    }

    public void stockTest() {
        Stock stock = new Stock("Test stock", 10);
        stock.updatePrice(30);
        stock.updatePrice(6);
        stock.updatePrice(23);

        String expected = "Company = \"Test stock\", Current Price = 23.0, Min Price = 6.0, Max Price = 30.0";
        String actual = stock.getPriceInformation();

        if (expected.equals(actual)) {
            System.out.println("stockTest test = OK");
        } else {
            System.out.println("stockTest test = FAIL");
        }
    }

    public void maximumTest() {
        double expectedResult = 999;

        Stock stock = new Stock("Test stock", 0);
        stock.updatePrice(999);
        double realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Maximum price test = OK");
        } else {
            System.out.println("Maximum price test = FAIL");
        }
    }

    public void maximumForTwoPeriodsTest() {
        double expectedResult = 999;

        Stock stock = new Stock("Test stock", 0);
        stock.updatePrice(999);
        stock.updatePrice(1);
        double realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Maximum price for two periods test = OK");
        } else {
            System.out.println("Maximum price for two periods test = FAIL");
        }
    }

    public void maximumForThreePeriodsTest() {
        double expectedResult = 1000;

        Stock stock = new Stock("Test stock", 0);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        double realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Maximum price for three periods test = OK");
        } else {
            System.out.println("Maximum price for three periods test = FAIL");
        }
    }

    public void maximumForFourPeriodsTest() {
        double expectedResult = 1000;

        Stock stock = new Stock("Test stock", 0);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        double realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Maximum price for four periods test = OK");
        } else {
            System.out.println("Maximum price for four periods test = FAIL");
        }
    }

    public void maximumForTwoPeriodsTest1() {
        double expectedResult = 27;

        Stock stock = new Stock("Test stock", 0);
        stock.updatePrice(9);
        stock.updatePrice(27);
        double realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Maximum price for two periods test1 = OK");
        } else {
            System.out.println("Maximum price for two periods test1 = FAIL");
        }
    }
}
