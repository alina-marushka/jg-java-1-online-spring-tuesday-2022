package instructor.lesson_8.demo_7;

import java.util.Scanner;

class StrategyDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Intel, 2 - AMD, 3 - Apple Silicon");
        int option = scanner.nextInt();

        Processor processor = selectProcessor(option);
        Motherboard motherboard = new Motherboard(processor);

        motherboard.power();
    }

    static Processor selectProcessor(int option) {
        return switch (option) {
            case 1 -> new IntelProcessor();
            case 2 -> new AmdProcessor();
            case 3 -> new AppleSiliconProcessor();
            default -> new NoopProcessor();
        };
    }
}
