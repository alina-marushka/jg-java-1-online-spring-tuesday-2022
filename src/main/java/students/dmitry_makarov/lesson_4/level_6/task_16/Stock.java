package students.dmitry_makarov.lesson_4.level_6.task_16;

 class Stock {
  String companyName;
  int startPrice;
  int currentPrice;
  int minPrice;
  int maxPrice;

  Stock (String companyName, int startPrice){
   this.companyName = companyName;
   this.currentPrice = startPrice;
   this.minPrice = startPrice;
   this.maxPrice = startPrice;
  }

  public String getPriceInformation  () {
   return "Company=" + companyName + " ,Minimal Price=" + minPrice +" , Current Price= " + currentPrice +  " , Maximal Price=" + maxPrice;
  }

  void updatePrice (int newPrice) {
   currentPrice = newPrice;
   if (newPrice > maxPrice){
    maxPrice = newPrice;
   }
   else if (newPrice < minPrice){
    minPrice = newPrice;
   }
  }
 }


