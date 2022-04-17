package students.romans_bogomols.lesson_4.level_5.task_15;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTestMin();
        lightColorDetectorTest.violetTestMax();
        lightColorDetectorTest.blueTestMin();
        lightColorDetectorTest.blueTestMax();
        lightColorDetectorTest.greenTestMin();
        lightColorDetectorTest.greenTestMax();
        lightColorDetectorTest.yellowTestMin();
        lightColorDetectorTest.yellowTestMax();
        lightColorDetectorTest.orangeTestMin();
        lightColorDetectorTest.orangeTestMax();
        lightColorDetectorTest.redTestMin();
        lightColorDetectorTest.redTestMax();
        lightColorDetectorTest.invisibleTestMin();
        lightColorDetectorTest.invisibleTestMax();
    }

    void violetTestMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(380);
        assertThatEqual("Violet", realResult, "Violet min");
    }
    void violetTestMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(449);
        assertThatEqual("Violet", realResult,"Violet max");
    }
    void blueTestMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(450);
        assertThatEqual("Blue", realResult,"Blue min");
    }
    void blueTestMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(494);
        assertThatEqual("Blue", realResult,"Blue max");
    }
    void greenTestMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(495);
        assertThatEqual("Green", realResult,"Green min");
    }
    void greenTestMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(569);
        assertThatEqual("Green", realResult,"Green max");
    }
    void yellowTestMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(570);
        assertThatEqual("Yellow", realResult,"Yellow min");
    }
    void yellowTestMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(589);
        assertThatEqual("Yellow", realResult,"Yellow max");
    }
    void orangeTestMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(590);
        assertThatEqual("Orange", realResult,"Orange min");
    }
    void orangeTestMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(619);
        assertThatEqual("Orange", realResult,"Orange max");
    }
    void redTestMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(620);
        assertThatEqual("Red", realResult,"Red min");
    }
    void redTestMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(750);
        assertThatEqual("Red", realResult,"Red max");
    }
    void invisibleTestMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(379);
        assertThatEqual("Invisible Light", realResult,"Invisible min");
    }
    void invisibleTestMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(751);
        assertThatEqual("Invisible Light", realResult,"Invisible max");
    }
    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}


