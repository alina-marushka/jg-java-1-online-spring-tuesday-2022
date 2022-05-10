package instructor.lesson_7.demo_3;

class BookApplication {

    public static void main(String[] args) {


        BookRecord book1 = new BookRecord("0596009208", "Sierra Kathy", "Head First Java");
        BookRecord book2 = new BookRecord("1617291994", "Mycroft Alan", "Java 8 in Action");
        BookRecord book3 = new BookRecord("0132350882", "Martin Robert", "Clean Code");

        BookRepository repository = new ArrayBookRepository();

        System.out.println("Index Books: ");
        for (BookRecord record : repository.index()) {
            System.out.println(record.asString());
        }

        repository.save(book1);
        repository.save(book2);
        repository.save(book3);

        System.out.println();
        System.out.println("Index Books: ");
        for (BookRecord record : repository.index()) {
            System.out.println(record.asString());
        }

        System.out.println();
        System.out.println("Find By ISBN '0596009208':");
        System.out.println(repository.findByISBN("0596009208").asString());

        System.out.println();
        System.out.println("Find By ISBN '1617291994':");
        System.out.println(repository.findByISBN("1617291994").asString());

        System.out.println();
        System.out.println("Find By ISBN '0132350882':");
        System.out.println(repository.findByISBN("0132350882").asString());

        System.out.println();
        System.out.println("Find By ISBN 'foo':");
        System.out.println(repository.findByISBN("foo"));

        repository.delete(book1);
        repository.delete(repository.findByISBN("1617291994"));

        System.out.println();
        System.out.println("Index Books: ");
        for (BookRecord record : repository.index()) {
            System.out.println(record.asString());
        }
    }
}
