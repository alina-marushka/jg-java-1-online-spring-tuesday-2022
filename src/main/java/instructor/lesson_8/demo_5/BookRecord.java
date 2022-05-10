package instructor.lesson_8.demo_5;

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

//    String asString() {
//        return "BookRecord(isbn='" + isbn + "', author='" + author + "', title='" + title + "')";
//    }

    @Override
    public String toString() {
        return "BookRecord{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
