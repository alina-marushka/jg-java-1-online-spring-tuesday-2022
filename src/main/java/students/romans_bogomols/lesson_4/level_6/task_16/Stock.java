package students.romans_bogomols.lesson_4.level_6.task_16;

class Stock {

    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        if (newPrice < minPrice) {
            minPrice = newPrice;
            currentPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
            currentPrice = newPrice;
        } else {
            currentPrice = newPrice;
        }

    }


    String getPriceInformation() {
        return  "Company = " + name + ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice + ", Max Price = " + maxPrice;

    }
}