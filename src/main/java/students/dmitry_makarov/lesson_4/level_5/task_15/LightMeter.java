package students.dmitry_makarov.lesson_4.level_5.task_15;

import java.util.Scanner;

class LightMeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input light wave length: ");

        int waveLength = scanner.nextInt();

        LightColorDetector lightColorDetectorNew = new LightColorDetector ();
        lightColorDetectorNew.detect(waveLength);
        String lightMeterPrint = lightColorDetectorNew.detect(waveLength);
        System.out.println(lightMeterPrint);

    }

}
