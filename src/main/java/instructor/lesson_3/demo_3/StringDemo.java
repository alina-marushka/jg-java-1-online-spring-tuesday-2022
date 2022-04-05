package instructor.lesson_3.demo_3;

class StringDemo {

    public static void main(String[] args) {

        String text = "Hello World";
        System.out.println(text);

        System.out.println("text.length() = " + text.length());
        System.out.println("text.toLowerCase() = " + text.toLowerCase());
        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        System.out.println("text.isEmpty() = " + text.isEmpty());
        System.out.println("text.startsWith(\"Hello\") = " + text.startsWith("Hello"));
        System.out.println("text.startsWith(\"Foo\") = " + text.startsWith("Foo"));
        System.out.println("text.replaceAll(\"o\", \"X\") = " + text.replaceAll("o", "X"));

    }
}
