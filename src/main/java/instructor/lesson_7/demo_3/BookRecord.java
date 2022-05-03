package instructor.lesson_7.demo_3;

class BookRecord {

    private String isbn;
    private String author;
    private String title;

    BookRecord(String isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    String isbn() {
        return isbn;
    }

    String author() {
        return author;
    }

    String title() {
        return title;
    }

    String asString() {
        return "BookRecord(isbn='" + isbn + "', author='" + author + "', title='" + title + "')";
    }
}
