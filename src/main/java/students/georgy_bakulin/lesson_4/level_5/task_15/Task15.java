package students.georgy_bakulin.lesson_4.level_5.task_15;

class Task15 {

 public static void main(String[] args) {

  LightColorDetector lightColorDetector = new LightColorDetector();
  System.out.println("Optical Wave color is " + lightColorDetector.detect(387));
  System.out.println("Optical Wave color is " + lightColorDetector.detect(453));
  System.out.println("Optical Wave color is " + lightColorDetector.detect(528));
  System.out.println("Optical Wave color is " + lightColorDetector.detect(574));
  System.out.println("Optical Wave color is " + lightColorDetector.detect(601));
  System.out.println("Optical Wave color is " + lightColorDetector.detect(740));
  System.out.println("Optical Wave color is " + lightColorDetector.detect(120));
 }
}
