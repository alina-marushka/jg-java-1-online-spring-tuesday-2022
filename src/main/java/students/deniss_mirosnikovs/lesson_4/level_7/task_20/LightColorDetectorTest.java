package students.deniss_mirosnikovs.lesson_4.level_7.task_20;

class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }

    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.resultChecker("LightColorDetector -Violet", result, "Violet");
    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.resultChecker("LightColorDetector -Blue", result, "Blue");
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.resultChecker("LightColorDetector -Green", result, "Green");
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.resultChecker("LightColorDetector -Yellow", result, "Yellow");
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.resultChecker("LightColorDetector -Orange", result, "Orange");
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.resultChecker("LightColorDetector -Red", result, "Red");
    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.resultChecker("LightColorDetector -Invisible Light", result, "Invisible Light");
    }

    public void resultChecker(String TestName, String result, String expectedResult) {
        if (result == expectedResult) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }
}
