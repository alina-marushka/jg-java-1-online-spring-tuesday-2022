package students.viktors_maksimovs.lesson_4.level_6.task_16;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.newPriceTest();
        stockTest.newPriceMaxOneTest();
        stockTest.newPriceMaxTwoTest();
        stockTest.newPriceMaxThreeTest();
        stockTest.newPriceMaxFourTest();
        stockTest.newPriceMaxFiveTest();
        stockTest.newPriceMinTest();
        stockTest.newpriceMinStat();


    }
    void newPriceTest() {
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int actual = stock.currentPrice;
        assertEquals(77, actual, "New price is " +actual);
    }
    void newPriceMaxOneTest () {
        Stock stock = new Stock("GOOG", 999);

        int actual = stock.maxPrice;
        assertEquals(999, actual, "Max price is " +actual);
    }
    void newPriceMaxTwoTest () {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(1);

        int actual = stock.maxPrice;
        assertEquals(999, actual, "Max price for period is " + stock.maxPrice);
    }
    void newPriceMaxThreeTest () {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);

        int actual = stock.maxPrice;
        assertEquals(1000, actual, "Max price for period is " +stock.maxPrice);
    }
    void newPriceMaxFourTest () {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);

        int actual = stock.maxPrice;
        assertEquals(1000, actual, "Max price for period is " +stock.maxPrice);
    }
    void newPriceMaxFiveTest () {
        Stock stock = new Stock("GOOG", 9);
        stock.updatePrice(27);

        int actual = stock.maxPrice;
        assertEquals(27, actual, "Max price for period is " +stock.maxPrice);
    }
    void newPriceMinTest() {
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        int actual = stock.minPrice;
        assertEquals(5, actual, "Min price for period is " +actual);
    }
    void newpriceMinStat () {
        Stock stock = new Stock("GOOG", 999);

        int actual = stock.minPrice;
        assertEquals(999, actual, "Min price  is " +actual);
    }




    void assertEquals(int expected, int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " FAIL!");
        }
    }
}
