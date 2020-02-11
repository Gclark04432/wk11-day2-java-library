import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void loanBookFromLibrary(Library library, Book book) {
        library.remove(book);
        this.collection.add(book);
    }
}
