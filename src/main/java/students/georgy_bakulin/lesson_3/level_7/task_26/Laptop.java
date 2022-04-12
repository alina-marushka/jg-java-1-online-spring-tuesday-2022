package students.georgy_bakulin.lesson_3.level_7.task_26;

class Laptop {

    String laptopModel;
    String laptopProcessor;
    double weight;

    public Laptop(String laptopModel, String laptopProcessor, double weight) {
        this.laptopModel = laptopModel;
        this.laptopProcessor = laptopProcessor;
        this.weight = weight;
    }
    void laptopSpecs(){
        System.out.println("Laptop Model is " + laptopModel);
        System.out.println("Laptop Processor is " + laptopProcessor);
        System.out.println("Laptop weight is" + weight + "lbs");
    }
}



