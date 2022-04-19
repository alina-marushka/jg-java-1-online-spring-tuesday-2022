package instructor.lesson_5.demo_7;

class Demo7 {

    public static void main(String[] args) {

        char[] symbols = "Hello World. Such a wonderful day today.".toCharArray();

        System.out.println("For i:");
        for (int i = 0; i < symbols.length; i++) {
            char symbol = symbols[i];
            System.out.print(symbol);
        }

        System.out.println();
        System.out.println("For each:");
        for (char symbol : symbols) {
            System.out.print(symbol);
        }

        System.out.println();

    }
}
