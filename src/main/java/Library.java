import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 3;
    }

    public int booksCount() {
        return this.books.size();
    }

    public void add(Book book) {
        if (this.booksCount() < this.capacity) {
            this.books.add(book);
        }
        else {
            System.out.println("No space available in library for "+ book.getTitle());
        }
    }

    public Book remove(Book book) {
        int bookIndex = books.indexOf(book);
        return this.books.remove(bookIndex);
    }
}
