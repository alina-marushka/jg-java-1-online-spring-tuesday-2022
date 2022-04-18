/*
    Storage class description:

    Properties:
    * Storage name (String)
    * Storage capacity (int)
    * Current storage product amount (int)

    * Delivery name (String)
    * Sending quantity of products (int)

    * Bank account (double)

    Methods:
    1. Give information about storage
    2. Input products in storage
    3. Send delivery to shop
    4. Get money from shop
 */

package students.viktors_maksimovs.deniss_mirosnikovs.lesson_3.level_7.task_26;

import java.util.Scanner;

class Storage {

    String storageName;
    int storageMaxCapacity;
    int storageCurrentAmount;

    String deliveryName;
    int deliveryQuantity;

    double bankAccount;

    public Storage(String storageName, int storageMaxCapacity,
                   int storageCurrentAmount, double bankAccount) {
        this.storageName = storageName;
        this.storageMaxCapacity = storageMaxCapacity;
        this.storageCurrentAmount = storageCurrentAmount;
        this.bankAccount = bankAccount;
    }

    void getInformation() {
        System.out.println("Storage name: " + storageName);
        System.out.println("On " + storageName + " Bank account: " + bankAccount + "$");
        System.out.println("The current amount of the storage product: " + storageCurrentAmount +
                            " (psc) of " + storageMaxCapacity + " (pcs)\n");
    }

    void inputProducts() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity (pcs) of product for " + storageName + ": ");
        int productQuantity = input.nextInt();

        storageCurrentAmount += productQuantity;
        System.out.println("In " + storageName + " now: " + storageCurrentAmount +
                            " (psc) of " + storageMaxCapacity + " (pcs)\n");
    }

    void deliveryToShop() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter delivery name: ");
        deliveryName = input.nextLine();

        System.out.print("Enter quantity (pcs) of sending product: ");
        deliveryQuantity = input.nextInt();

        storageCurrentAmount -= deliveryQuantity;
        System.out.println("Delivery: (" + deliveryName + ") sent to shop!\n");
    }

    void getMoney(double sendingMoney, String shopName) {

        bankAccount += sendingMoney;
        System.out.println("Received " + sendingMoney + "$ from " + shopName);
        System.out.println();
    }
}
