package students.georgy_bakulin.lesson_4.level_5.task_15;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.viloletMin();
        lightColorDetectorTest.viloletMax();
        lightColorDetectorTest.blueMin();
        lightColorDetectorTest.blueMax();
        lightColorDetectorTest.minGreen();
        lightColorDetectorTest.maxGreen();
        lightColorDetectorTest.minYellow();
        lightColorDetectorTest.maxYellow();
        lightColorDetectorTest.orangeMin();
        lightColorDetectorTest.orangeMax();
        lightColorDetectorTest.redMin();
        lightColorDetectorTest.redMax();
        lightColorDetectorTest.invisibleMin();
        lightColorDetectorTest.invisibleMax();
    }

    void viloletMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(380);
        assertEquals("Violet", detectedColor, "Violet minimum value ");
    }

    void viloletMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(449);
        assertEquals("Violet", detectedColor, "Violet maximum value ");
    }

    void blueMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(450);
        assertEquals("Blue", detectedColor, "Blue minimum value ");
    }

    void blueMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(494);
        assertEquals("Blue", detectedColor, "Blue maximum value ");
    }

    void minGreen() {

        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(495);
        assertEquals("Green", detectedColor, "Green minimum value ");
    }

    void maxGreen() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(569);
        assertEquals("Green", detectedColor, "Green maximum value ");
    }

    void minYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(570);
        assertEquals("Yellow", detectedColor, "Yellow minimum value ");
    }

    void maxYellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(589);
        assertEquals("Yellow", detectedColor, "Yellow maximum value ");
    }

    void orangeMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(590);
        assertEquals("Orange", detectedColor, "Orange minimum value ");
    }

    void orangeMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(619);
        assertEquals("Orange", detectedColor, "Orange maximum value ");
    }

    void redMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(620);
        assertEquals("Red", detectedColor, "Red minimum value ");
    }

    void redMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(750);
        assertEquals("Red", detectedColor, "Red maximum value ");
    }

    void invisibleMin() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(379);
        assertEquals("Invisible light", detectedColor, "Invisible light minimum value ");
    }

    void invisibleMax() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String detectedColor = lightColorDetector.detect(751);
        assertEquals("Invisible light", detectedColor, "Invisible light maximum value ");
    }

    void assertEquals(String expectedColor, String detectedColor, String option) {
        if (expectedColor.equals(detectedColor)) {
            System.out.println(" Color Test " + option + "passed ! ");
        } else {
            System.out.println("Color Test" + option + "failed !");
        }
    }
}

