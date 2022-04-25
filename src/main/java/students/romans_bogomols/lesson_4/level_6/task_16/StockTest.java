package students.romans_bogomols.lesson_4.level_6.task_16;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTestRunner = new StockTest();
        stockTestRunner.newPriceTest();
        stockTestRunner.newPriceTestMin();
        stockTestRunner.newPriceTestMax();
        stockTestRunner.newPriceTestMaxOne();
        stockTestRunner.newPriceTestMaxTwo();
        stockTestRunner.newPriceTestMaxThree();
        stockTestRunner.newPriceTestMaxFour();
        stockTestRunner.newPriceTestMaxFive();
        stockTestRunner.newPriceTestMinTwo();
        stockTestRunner.newPriceTestMinThree();
    }

    void newPriceTest() {
       Stock stock = new Stock("Google", 10);
       stock.updatePrice(12);
       stock.updatePrice(5);
       stock.updatePrice(7);
       stock.updatePrice(99);
       stock.updatePrice(77);
       int actualResult = stock.currentPrice;
       assertThatEqual(77, actualResult, "New price is -=77=-");
    }
    void newPriceTestMin() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int actualResult = stock.minPrice;
        assertThatEqual(5, actualResult, "Min price is -=5=-");
    }
    void newPriceTestMax() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int actualResult = stock.maxPrice;
        assertThatEqual(99, actualResult, "Max price is -=99=-");
    }
    void newPriceTestMaxOne() {
        Stock stock = new Stock("Google", 999);
        int actualResult = stock.maxPrice;
        assertThatEqual(999, actualResult, "Max price without update -=999=-");
    }
    void newPriceTestMaxTwo() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(1);
        int actualResult = stock.maxPrice;
        assertThatEqual(999, actualResult, "Max price with update: -=999=-");
    }
    void newPriceTestMaxThree() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int actualResult = stock.maxPrice;
        assertThatEqual(1000, actualResult, "Max price with 2 updates: -=1000=-");
    }
    void newPriceTestMaxFour() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int actualResult = stock.maxPrice;
        assertThatEqual(1000, actualResult, "Max price with 3 updates: -=1000=-");
    }
    void newPriceTestMaxFive() {
        Stock stock = new Stock("Google", 9);
        stock.updatePrice(27);
        int actualResult = stock.maxPrice;
        assertThatEqual(27, actualResult, "Max price with update: -=27=-");
    }
    void newPriceTestMinTwo() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(5);
        stock.updatePrice(1);
        stock.updatePrice(2687);
        int actualResult = stock.minPrice;
        assertThatEqual(1, actualResult, "Min price with 3 updates: -=1=-");
    }
    void newPriceTestMinThree() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        stock.updatePrice(1);
        int actualResult = stock.minPrice;
        assertThatEqual(1, actualResult, "Max price with 4 updates: -=1=-");
    }
    void assertThatEqual(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}

