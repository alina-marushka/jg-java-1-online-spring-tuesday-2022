package students.viktors_maksimovs.lesson_6.level_4.task_20;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;

        while (true) {
            if (i == 10) {
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }
}
