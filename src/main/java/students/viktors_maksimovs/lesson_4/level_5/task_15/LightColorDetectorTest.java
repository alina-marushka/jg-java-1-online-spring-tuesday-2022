package students.viktors_maksimovs.lesson_4.level_5.task_15;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest colorDetectorTest = new LightColorDetectorTest();
        colorDetectorTest.violetMin();
        colorDetectorTest.violetMax();
        colorDetectorTest.blueMin();
        colorDetectorTest.blueMax();
        colorDetectorTest.greenMin();
        colorDetectorTest.greenMax();
        colorDetectorTest.yellowMin();
        colorDetectorTest.yellowMax();
        colorDetectorTest.orangeMin();
        colorDetectorTest.orangeMax();
        colorDetectorTest.redMin();
        colorDetectorTest.redMax();
        colorDetectorTest.invisibleMin();
        colorDetectorTest.invisibleMax();


    }
    void violetMin() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(380);
        assertEquals("Violet", real, "Violet low value");
    }
    void violetMax() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(449);
        assertEquals("Violet", real, "Violet high value");
    }
    void blueMin() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(450);
        assertEquals("Blue", real, "Blue low value");
    }
    void blueMax() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(494);
        assertEquals("Blue", real, "Blue high value");
    }
    void greenMin() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(495);
        assertEquals("Green", real, "Green low value");
    }
    void greenMax() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(569);
        assertEquals("Green", real, "Green high value");
    }
    void yellowMin() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(570);
        assertEquals("Yellow", real, "Yellow low value");
    }
    void yellowMax() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(589);
        assertEquals("Yellow", real, "Yellow high value");
    }
    void orangeMin() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(590);
        assertEquals("Orange", real, "Orange low value");
    }
    void orangeMax() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(619);
        assertEquals("Orange", real, "Orange high value");
    }
    void redMin() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(628);
        assertEquals("Red", real, "Red low value");
    }
    void redMax() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(750);
        assertEquals("Red", real, "Red high value");
    }
    void invisibleMin() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(379);
        assertEquals("Invisible Light", real, "Invisible Light low value");
    }
    void invisibleMax() {
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(751);
        assertEquals("Invisible Light", real, "Invisible Light high value");
    }




    void assertEquals(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }

    /*
     void violetMin() {
        String expected = "Violet";
        LightColorDetector colorDetector = new LightColorDetector();
        String real = colorDetector.detect(380);

        if (expected.equals(real)) {
            System.out.println("Violet min test : PASS");
        } else {
            System.out.println("Violet min test : FAIL");

        }
    }
     */
}
