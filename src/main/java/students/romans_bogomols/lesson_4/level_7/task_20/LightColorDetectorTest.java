package students.romans_bogomols.lesson_4.level_7.task_20;

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
        assertThatEqual("Violet", lightColorDetector.detect(405), "Expected color violet");
    }
    void testBlue(){
       assertThatEqual("Blue", lightColorDetector.detect(475), "Expected color Blue");
    }
    void testGreen(){
        assertThatEqual("Green", lightColorDetector.detect(505), "Expected color green");
    }
    void testYellow(){
            assertThatEqual("Yellow", lightColorDetector.detect(585), "Expected color yellow");
        }
    void testOrange (){
            assertThatEqual("Orange", lightColorDetector.detect(619), "Expected color orange");
        }
    void testRed(){
            assertThatEqual("Red", lightColorDetector.detect(620), "Expected color red");
        }
    void testInvisible(){
            assertThatEqual("Invisible Light", lightColorDetector.detect(760), "Expected color - invisible color");
        }
    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}



