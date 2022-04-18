package students.viktors_maksimovs.lesson_4.level_5.task_15;

class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector colorDetector = new LightColorDetector();
        System.out.println("Wave color: " + colorDetector.detect(450));
        System.out.println("Wave color: " + colorDetector.detect(200));
        System.out.println("Wave color: " + colorDetector.detect(648));


    }
}
