/*
Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
2. Вывод информации о продукте в консоль (void printInformation())

Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
 */

package students.deniss_mirosnikovs.lesson_3.level_7.task_28;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }
    
    void printInformation() {
        System.out.println("Product name: " + name);
        System.out.println("Product regular price: " + regularPrice + "$");
        System.out.println("Discount on product: " + discount + "%\n");
    }

    void actualPrice() {

        double percentage = 100 - discount;
        double actualPrice = (percentage * regularPrice) / 100;

        System.out.println("Actual " + name + " price with discount " +
                            discount + "% is " + actualPrice + "$");
    }
}
