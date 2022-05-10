package instructor.lesson_7.demo_3;

abstract class BookRepository {

    abstract void save(BookRecord record);

    abstract BookRecord[] index();

    abstract BookRecord findByISBN(String isbn);

    abstract void delete(BookRecord record);
}
