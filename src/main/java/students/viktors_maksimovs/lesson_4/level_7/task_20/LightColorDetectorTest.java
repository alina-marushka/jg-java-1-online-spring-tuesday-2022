package students.viktors_maksimovs.lesson_4.level_7.task_20;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet();
        lightColorDetector.testBlue();
        lightColorDetector.testGreen();
        lightColorDetector.testYellow();
        lightColorDetector.testOrange();
        lightColorDetector.testRed();
        lightColorDetector.testInvisible();
    }
    LightColorDetector lightColorDetector = new LightColorDetector();
    void testViolet() {
        assertThatEqual("Violet", lightColorDetector.detect(405), "Wave is Violet");
    }
    void testBlue(){
        assertThatEqual("Blue", lightColorDetector.detect(475), "Wave is Blue");
    }
    void testGreen(){
        assertThatEqual("Green", lightColorDetector.detect(505), "Wave is Green");
    }
    void testYellow(){
        assertThatEqual("Yellow", lightColorDetector.detect(585), "Wave is Yellow");
    }
    void testOrange (){
        assertThatEqual("Orange", lightColorDetector.detect(619), "Wave is Orange");
    }
    void testRed(){
        assertThatEqual("Red", lightColorDetector.detect(620), "Wave is Red");
    }
    void testInvisible(){
        assertThatEqual("Invisible Light", lightColorDetector.detect(760), "Invisible light");
    }
    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }

}
