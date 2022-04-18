package instructor.dmitry_makarov.lesson_3.level_7.task_26;
 /*
 Объект- гитара.
 Описывается следующими переменными:
 brand - название, переменная типа "строка";
 model- можель, переменная типа "строка";
 color- цвет, переменная типа "строка";

 quantStrings- количество струн, целочисленная переменная;

 type- описание гитары по типу, целочисленная переменная.
 Так как типы гитар должны быть четко регламентированы,
 то здесь использован условный оператор if... else, который передает на консоль значение "электрическая" при
 переменной =1, и "акустическая" при любом другом значении.
 Вообще по хорошему, диапазон стоило бы ограничить сразу с помощью "for" и каждому значению присвоить
 конкретное название: 1- электро, 2- аккустическая, 3- резонаторная, 4- укулеле...
 Или, еще лучше, вводить type не целочисленной переменной, а переменной типа boolean (но это не точно-
 это мне пока только так кажется).
 Я пока не полностью разобрался как именно тип boolean работает, поэтому не пробовал это реализовать таким образом.
 Но если такое допустимо, то это задание я бы еще допилил до более логичного вида.
 Потому что сейчас, когда рабочим числом является по сути только единица, это такой своеобразный "костыль"

  */

class Guitar {
     String brand;
     String model;
     String color;
     int type;
     int quantStrings;
     String readType;

     Guitar (String brand, String model, String color, int quantStrings, int type) {
         this.brand = brand;
         this.model = model;
         this.color = color;
         this.quantStrings = quantStrings;
         this.type = type;


         if (type == 1) {
          String readType = ("electric") ;
          this.readType = readType;
         }

       else {
             String readType = ("acoustic");
            this.readType = readType;
     }
         }

     void output () {
         System.out.println(brand);
         System.out.println(model);
         System.out.println(color);
         System.out.println(quantStrings);
         System.out.println(readType);
         System.out.println();

     }
}
