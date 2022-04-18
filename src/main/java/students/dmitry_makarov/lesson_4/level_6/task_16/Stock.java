package students.dmitry_makarov.lesson_4.level_6.task_16;

/*
Я немного ушел от условия задачи.
В условии было сказано, что изменение цен акций должно происходить только через метод .updatePrice.
И происходить это должно вот так:
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);

Я, наверно, просто что-то раньше упустил...
Я физически не понимаю, как это сделать последовательно.
То есть мне же нужны 3 отдельные переменные, чтобы их потом сравнить между собой.
Можно было бы отдельно передавать и по очереди записывать в нужные переменные...
В общем, я этот момент не понял, и указал в конструторе сразу все три переменные:
void updatePrice (int newPrice1, int newPrice2, int newPrice3).
То есть, класс updatePrice вызывается один раз:
google.updatePrice(20,12,15);

И класс с тестированием я не сделал, потому что в принципе не понял задания.
Вот эту часть:
------
Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
---------
 */

 class Stock {

  String name;
  int currentPrice;
  // int startPrice;
  int minPrice;
  int maxPrice;
  String priceInformation;
  int newPrice;

  Stock(String name, int startPrice) {
   this.name = name;
   this.currentPrice = startPrice;
   this.minPrice = startPrice;
   this.maxPrice = startPrice;
  }

  void getPriceInformation() {
   System.out.println("Company=" + name + " , Current Price= " + currentPrice + " ,Minimal Price=" + minPrice + " , Maximal Price=" + maxPrice);
  }

void updatePrice (int newPrice1, int newPrice2, int newPrice3) {
  if (newPrice1> newPrice2 && newPrice1 > newPrice3){
   this.maxPrice= newPrice1;
   if (newPrice2 > newPrice3){
   this.currentPrice= newPrice2;
   this.minPrice= newPrice3;
  }
   else if (newPrice3>newPrice2){
    this.currentPrice= newPrice3;
    this.minPrice= newPrice2;
   }
  }


 if (newPrice2> newPrice1 && newPrice2 > newPrice3){
  this.maxPrice= newPrice2;
  if (newPrice1 > newPrice3){
   this.currentPrice= newPrice1;
   this.minPrice= newPrice3;
  }
  else if (newPrice3>newPrice1){
   this.currentPrice= newPrice3;
   this.minPrice= newPrice1;
  }
 }

 if (newPrice3> newPrice1 && newPrice3 > newPrice2){
  this.maxPrice= newPrice3;
  if (newPrice1 > newPrice2){
   this.currentPrice= newPrice1;
   this.minPrice= newPrice2;
  }
  else if (newPrice2>newPrice1){
   this.currentPrice= newPrice2;
   this.minPrice= newPrice1;
  }
 }
   }

}


