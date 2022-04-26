/*
    Shop class description:

    Properties:
    * Shop name (String)
    * Current product amount in shop (int)

    * Shopping cart (double)
    * Current money in shop (double)
    * Money for sanding to storage (double)

    Methods:
    1. Give information about shop
    2. Get delivery from storage
    3. Sell products
    4. Send money to storage
 */

package students.deniss_mirosnikovs.lesson_3.level_7.task_26;

import java.util.Scanner;

class Shop {

    String shopName;
    int shopProductAmount;

    double shoppingCart;
    double shopCurrentMoneyAmount;
    double sendingMoney;

    public Shop(String shopName, int shopProductAmount, double shopCurrentMoneyAmount) {
        this.shopName = shopName;
        this.shopProductAmount = shopProductAmount;
        this.shopCurrentMoneyAmount = shopCurrentMoneyAmount;
    }

    void getInformation() {
        System.out.println("Shop name: " + shopName);
        System.out.println("Shop product amount: " + shopProductAmount + " (pcs)");
        System.out.println("Shop current money amount: " + shopCurrentMoneyAmount + "$\n");
    }

    void getDelivery(String deliveryName, int sendingAmount) {

        System.out.println("New Delivery: " + deliveryName + " (" + sendingAmount + " pcs)");
        shopProductAmount += sendingAmount;

        System.out.println("In " + shopName + " shop now: " + shopProductAmount + " (pcs)\n");
    }

    void sellProduct() {

        Scanner input = new Scanner(System.in);

        System.out.println("SELLING TERMINAL");
        System.out.print("Enter quantity of selling products: ");
        int sellingQuantity = input.nextInt();

        for (int i = 1; i <= sellingQuantity; i++) {

            System.out.print("Enter price of products (" + i + "): ");
            double price = input.nextDouble();

            shoppingCart += price;
        }

        shopCurrentMoneyAmount += shoppingCart;
        shopProductAmount -= sellingQuantity;
        System.out.println("You sold: " + sellingQuantity + " (pcs) for " + shoppingCart + "$\n");
    }

    void sendMoney() {

        Scanner input = new Scanner(System.in);

        System.out.println("In cash register: " + shopCurrentMoneyAmount + "$");
        System.out.print("Enter amount of money for sending: ");
        sendingMoney = input.nextDouble();

        shopCurrentMoneyAmount -= sendingMoney;
        System.out.println(sendingMoney + "$ was successfully sent to bank account!");
        System.out.println("In cash register now: " + shopCurrentMoneyAmount + "$\n");
    }
}
