package students.vlad_stus.lesson_3.level_7.Task_26;

public class TruckDemo {
    public static void main(String[] args) {

        Truck truckOne = new Truck("Volvo", "MS8122", 3, 1000);
        truckOne.printinformation();

        System.out.println();

        Truck truckTwo = new Truck("Mercedes", "MS072", 2, 900);
        truckTwo.printinformation();
    }
}
