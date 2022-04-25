package students.vlad_stus.lesson_3.level_7.task_26;

class Truck {
    String truckName;
    String truckPlate;
    int axles;
    int weight;



    Truck( String truckName, String truckPlate, int axles, int weight ){
        this.truckName = truckName;
        this.truckPlate =truckPlate;
        this.axles = axles;
        this.weight = weight;

    }

    void printinformation(){
        System.out.println("Truck ready for working: " + truckPlate);
        System.out.println("Truck plate : " + truckPlate );

    }
}
