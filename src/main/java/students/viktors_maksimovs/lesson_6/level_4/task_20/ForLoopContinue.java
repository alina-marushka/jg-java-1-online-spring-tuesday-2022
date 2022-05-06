package students.viktors_maksimovs.lesson_6.level_4.task_20;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int n = 1; n <= 5;) {
            if (n == 2) {
                continue;
            }
            System.out.println("Loop");
            n++;
        }
    }
}
