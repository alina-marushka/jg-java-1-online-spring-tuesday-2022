package instructor.lesson_7.demo_3;

class ArrayBookRepository {

    private BookRecord[] books;
    private int sequence = 0;

    ArrayBookRepository() {
        this(100); // this.books = new BookRecord[100];
    }

    ArrayBookRepository(int capacity) {
        this.books = new BookRecord[capacity];
    }

    void save(BookRecord record) {
        books[sequence++] = record;
    }

    BookRecord[] index() {
        BookRecord[] buffer = new BookRecord[size()];
        int cursor = 0;

        for (BookRecord record : books) {
            if (record != null) {
                buffer[cursor++] = record;
            }
        }

        return buffer;
    }

    BookRecord findByISBN(String isbn) {
        for (BookRecord record : books) {
            if (record == null) {
                continue;
            }

            if (record.isbn().equals(isbn)) {
                return record;
            }
        }

        return null;
    }

    void delete(BookRecord record) {
        for (int i = 0; i < books.length; i++) {
            BookRecord book = books[i];

            if (book == null) {
                continue;
            }

            if (book.isbn().equals(record.isbn())) {
                books[i] = null;
            }
        }
    }

    private int size() {
        int size = 0;

        for (BookRecord record : books) {
            if (record != null) {
                size++;
            }
        }

        return size;
    }
}
