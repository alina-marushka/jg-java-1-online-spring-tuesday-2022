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
        int waveLenght = 420;
        String colExpected = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Violet test OK");
        }
        else {
            System.out.println("Violet test FAIL");
        }
    }

    public void colBlue (){
        int waveLenght = 493;
        String colExpected = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Blue test OK");
        }
        else {
            System.out.println("Blue test FAIL");
        }
    }


    public void colGreen (){
        int waveLenght = 500;
        String colExpected = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Green test OK");
        }
        else {
            System.out.println("Green test FAIL");
        }
    }

    public void colYellow (){
        int waveLenght = 580;
        String colExpected = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Yellow test OK");
        }
        else {
            System.out.println("Yellow test FAIL");
        }
    }

    public void colOrange (){
        int waveLenght = 600;
        String colExpected = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Orange test OK");
        }
        else {
            System.out.println("Orange test FAIL");
        }
    }

    public void colRed (){
        int waveLenght = 650;
        String colExpected = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Red test OK");
        }
        else {
            System.out.println("Red test FAIL");
        }
    }

    public void colInvisMax (){
        int waveLenght = 752;
        String colExpected = "Invisible light";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Ibvisible max test OK");
        }
        else {
            System.out.println("Invisible max test FAIL");
        }
    }

    public void colInvisMin (){
        int waveLenght = 350;
        String colExpected = "Invisible light";

        LightColorDetector lightColorDetector = new LightColorDetector(waveLenght);
        String realResult = lightColorDetector.detect();
        if (realResult == colExpected){
            System.out.println("Invisible min test OK");
        }
        else {
            System.out.println("Invisible min test FAIL");
        }
    }

}
