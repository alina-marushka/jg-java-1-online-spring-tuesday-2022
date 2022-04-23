package students.dmitry_makarov.lesson_4.level_5.task_15;

class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.colViolet ();
        lightColorDetectorTest.colBlue();
        lightColorDetectorTest.colGreen();
        lightColorDetectorTest.colYellow();
        lightColorDetectorTest.colOrange();
        lightColorDetectorTest.colRed();
        lightColorDetectorTest.colInvisMax();
        lightColorDetectorTest.colInvisMin();
    }


    public void colViolet (){
        int waveLength = 420;
        String colExpected = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Violet test OK");
        }
        else {
            System.out.println("Violet test FAIL");
        }
    }

    public void colBlue (){
        int waveLength = 493;
        String colExpected = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Blue test OK");
        }
        else {
            System.out.println("Blue test FAIL");
        }
    }


    public void colGreen (){
        int waveLength = 500;
        String colExpected = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Green test OK");
        }
        else {
            System.out.println("Green test FAIL");
        }
    }

    public void colYellow (){
        int waveLength = 580;
        String colExpected = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Yellow test OK");
        }
        else {
            System.out.println("Yellow test FAIL");
        }
    }

    public void colOrange (){
        int waveLength = 600;
        String colExpected = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Orange test OK");
        }
        else {
            System.out.println("Orange test FAIL");
        }
    }

    public void colRed (){
        int waveLength = 650;
        String colExpected = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Red test OK");
        }
        else {
            System.out.println("Red test FAIL");
        }
    }

    public void colInvisMax (){
        int waveLength = 752;
        String colExpected = "Invisible light";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Invisible max test OK");
        }
        else {
            System.out.println("Invisible max test FAIL");
        }
    }

    public void colInvisMin (){
        int waveLength = 350;
        String colExpected = "Invisible light";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult == colExpected){
            System.out.println("Invisible min test OK");
        }
        else {
            System.out.println("Invisible min test FAIL");
        }
    }

}
