package students.aleksandrs_binduks.lesson_2.level_1.lesson_3.level_4.Task_13;

class Book {

    String title;

    Book(String newTitle) {
        this.title = newTitle;
    }

    String getTitle() {
        return this.title;
    }
}
class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}