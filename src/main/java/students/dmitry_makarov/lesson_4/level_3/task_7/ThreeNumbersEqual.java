package students.dmitry_makarov.lesson_4.level_3.task_7;

import java.util.Scanner;

 class ThreeNumbersEqual {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Please input first number: ");
        int num1 = number.nextInt();

        System.out.print("Please input second number: ");
        int num2 = number.nextInt();

        System.out.print("Please input third number: ");
        int num3 = number.nextInt();

        if (num1 == num2 && num2 == num3) {
                System.out.println("All numbers are equal");
            }

            else if (num1 != num2 && num1 != num3 && num2 != num3) {
                        System.out.println("All numbers are different");
                }
                else {
                    System.out.println("Neither all are equal or different ");
                }
            }
        }



