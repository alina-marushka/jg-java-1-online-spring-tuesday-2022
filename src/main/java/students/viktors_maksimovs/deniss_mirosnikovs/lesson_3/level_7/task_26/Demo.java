/* Task_26 description:
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_3.level_7.task_26;

class Demo {

    public static void main(String[] args) {

        Storage storage1 = new Storage("Warehouse", 100, 10, 0);
        Shop shop1 = new Shop("Amazon", 10, 0);

        storage1.inputProducts();

        storage1.deliveryToShop();
        storage1.getInformation();

        shop1.getDelivery(storage1.deliveryName, storage1.deliveryQuantity);
        shop1.sellProduct();

        shop1.sendMoney();
        storage1.getMoney(shop1.sendingMoney, shop1.shopName);

        shop1.getInformation();
        storage1.getInformation();
    }
}
