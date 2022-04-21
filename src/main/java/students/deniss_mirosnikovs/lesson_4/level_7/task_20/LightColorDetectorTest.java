package students.deniss_mirosnikovs.lesson_4.level_7.task_20;

class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

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
        String result = lightColorDetector.detect(wavelength);
        assertThatEqual("LightColorDetector -Violet", result, "Violet");
    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        assertThatEqual("LightColorDetector -Blue", result, "Blue");
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        assertThatEqual("LightColorDetector -Green", result, "Green");
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        assertThatEqual("LightColorDetector -Yellow", result, "Yellow");
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        assertThatEqual("LightColorDetector -Orange", result, "Orange");
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        assertThatEqual("LightColorDetector -Red", result, "Red");
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        assertThatEqual("LightColorDetector -Invisible Light", result, "Invisible Light");
    }

    public void assertThatEqual(String TestName, String result, String expectedResult) {
        if (result.equals(expectedResult)) {
            System.out.println(TestName + " test = OK");
        } else {
            System.out.println(TestName + " test = FAIL");
        }
    }
}
