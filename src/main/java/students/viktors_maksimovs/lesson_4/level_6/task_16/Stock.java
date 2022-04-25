package students.viktors_maksimovs.lesson_4.level_6.task_16;

class Stock {

    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice){
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        if (newPrice < minPrice) {
            minPrice = newPrice;
            currentPrice = newPrice;
        } else if ( newPrice > maxPrice) {
            maxPrice = newPrice;
            currentPrice = newPrice;
        } else {
            currentPrice=newPrice;
        }

    }

     String priceInformation () {
        return "Company = \"" + name + "\", Current price = " + currentPrice +
                ", Min price = " + minPrice + ", Max price = " + maxPrice;
    }


}
