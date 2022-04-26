package students.dmitry_makarov.lesson_3.level_7.task_26;
/*
Здесь в качестве объекта из реального мира я выбрал понятие "валюты".
В качестве основных характеристик выбрал:
название- name
страну- country
сумма - amount
обменный курс по отношению к евро- rate
Все эти признаки описываются в момент создания объекта в классе main

метод getEurAmount- пересчитывает сумму указанной валюты и возвращает это значение.
метод consolePrint- выводит все значения на экран
 */
 class Currency {

  String name;
  String country;
  int amount;
  double rate;


  Currency(String name, String country, int amount, double rate) {
   this.name = name;
   this.country = country;
   this.rate = rate;
   this.amount = amount;
  }

  double getEurAmount (){
   return amount*rate;
  }

   void consolePrint () {
    System.out.println("Name: " + name);
    System.out.println("Country: " + country);
    System.out.println("Exchange rate: " + rate);
    System.out.println("Amount: " + amount);
 //   System.out.println("EUR= " + amount * rate);
    System.out.println("EUR= " + getEurAmount());

    System.out.println();
   }
  }
