package students.deniss_mirosnikovs.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetColorDetectionTest();
        lightColorDetectorTest.blueColorDetectionTest();
        lightColorDetectorTest.greenColorDetectionTest();
        lightColorDetectorTest.yellowColorDetectionTest();
        lightColorDetectorTest.orangeColorDetectionTest();
        lightColorDetectorTest.redColorDetectionTest();

        lightColorDetectorTest.invisibleColorDetectionTest();
    }

    public void violetColorDetectionTest() {
        int wavelength = 380;
        String expectedResult = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Violet color detection test = OK");
        } else {
            System.out.println("Violet color detection test = FAIL");
        }
    }

    public void blueColorDetectionTest() {
        int wavelength = 450;
        String expectedResult = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Blue color detection test = OK");
        } else {
            System.out.println("Blue color detection test = FAIL");
        }
    }

    public void greenColorDetectionTest() {
        int wavelength = 495;
        String expectedResult = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Green color detection test = OK");
        } else {
            System.out.println("Green color detection test = FAIL");
        }
    }

    public void yellowColorDetectionTest() {
        int wavelength = 589;
        String expectedResult = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Yellow color detection test = OK");
        } else {
            System.out.println("Yellow color detection test = FAIL");
        }
    }

    public void orangeColorDetectionTest() {
        int wavelength = 619;
        String expectedResult = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Orange color detection test = OK");
        } else {
            System.out.println("Orange color detection test = FAIL");
        }
    }

    public void redColorDetectionTest() {
        int wavelength = 620;
        String expectedResult = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Red color detection test = OK");
        } else {
            System.out.println("Red color detection test = FAIL");
        }
    }

    public void invisibleColorDetectionTest() {
        int wavelength = 751;
        String expectedResult = "Invisible Light";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);

        if (realResult == expectedResult) {
            System.out.println("Invisible Light detection test = OK");
        } else {
            System.out.println("Invisible Light detection test = FAIL");
        }
    }
}
