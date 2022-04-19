package instructor.lesson_5.demo_1;

import java.util.Arrays;

class Demo1 {

    public static void main(String[] args) {

        int[] rates = new int[24];

        System.out.println("rates = " + Arrays.toString(rates));

        rates[0] = 50;
        rates[1] = 49;
        rates[2] = 52;
        rates[3] = 53;
        rates[4] = 52;
        rates[5] = 51;
        rates[6] = 52;
        rates[7] = 75;
        rates[8] = 76;
        rates[9] = 83;
        rates[10] = 83;
        rates[11] = 82;
        rates[12] = 80;
        rates[13] = 75;
        rates[14] = 76;
        rates[15] = 77;
        rates[16] = 76;
        rates[17] = 77;
        rates[18] = 88;
        rates[19] = 89;
        rates[20] = 90;
        rates[21] = 91;
        rates[22] = 86;
        rates[23] = 84;

        rates[rates.length - 1] = 99; // set last element in array

        System.out.println("rates.length = " + rates.length);
        System.out.println("rates = " + Arrays.toString(rates));

        System.out.println("rates[0] = " + rates[0]);
        System.out.println("rates[1] = " + rates[1]);
        System.out.println("rates[2] = " + rates[2]);
        System.out.println("rates[3] = " + rates[3]);
        System.out.println("rates[4] = " + rates[4]);
        System.out.println("rates[5] = " + rates[5]);
        System.out.println("rates[6] = " + rates[6]);
        System.out.println("rates[7] = " + rates[7]);

    }
}
