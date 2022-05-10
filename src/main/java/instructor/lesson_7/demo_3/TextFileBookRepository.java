package instructor.lesson_7.demo_3;

import java.nio.file.Files;

class TextFileBookRepository extends BookRepository {

    @Override
    void save(BookRecord record) {

    }

    @Override
    BookRecord[] index() {
        return new BookRecord[0];
    }

    @Override
    BookRecord findByISBN(String isbn) {
        return null;
    }

    @Override
    void delete(BookRecord record) {

    }
}
