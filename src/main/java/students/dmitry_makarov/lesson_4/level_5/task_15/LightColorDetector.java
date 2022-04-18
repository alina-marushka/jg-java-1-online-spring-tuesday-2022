package students.dmitry_makarov.lesson_4.level_5.task_15;


class LightColorDetector {

    int wave;
    String violet;
    String blue;
    String green;
    String yellow;
    String orange;
    String red;
    String invisible;

    LightColorDetector(int waveLenght) {
        this.wave = waveLenght;

    }

    public String detect() {
        this.violet = "Violet";
        this.blue = "Blue";
        this.green = "Green";
        this.yellow = "Yellow";
        this.orange = "Orange";
        this.red = "Red";
        this.invisible = "Invisible light";



        if (wave >= 380 && wave <=449) {
                return violet;
        }
        else if (wave >= 450 && wave <=494) {
                return blue;
        }
        else if (wave >= 495 && wave <= 569) {
                return green;
        }
        else if (wave >= 570 && wave <= 589) {
                return yellow;
        }
        else if (wave >= 590 && wave <= 619) {
                return orange;
        }
        else if (wave >= 620 && wave <= 750) {
                return red;
        }
        else {
            return invisible;
        }

    }

    void print (){
        System.out.println(detect());
    }
}



