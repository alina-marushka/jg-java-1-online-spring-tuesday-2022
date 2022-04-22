package students.deniss_mirosnikovs.lesson_4.level_6;

class Stock {

    String companyName;
    double currentPrice, minPrice, maxPrice;

    public Stock(String companyName, double startingPrice) {
        this.companyName = companyName;
        this.currentPrice = startingPrice;
        this.minPrice = startingPrice;
        this.maxPrice = startingPrice;
    }

    public void updatePrice(double newPrice) {

        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        currentPrice = newPrice;
    }

    public String getPriceInformation() {
        return "Company = \"" + companyName + "\", " +
                "Current Price = " + currentPrice + ", " +
                "Min Price = " + minPrice + ", " +
                "Max Price = " + maxPrice;
    }
}
