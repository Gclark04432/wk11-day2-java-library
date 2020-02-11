import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library();
        book1 = new Book("Ulysees", "James Joyce", "Modernist");
        book2 = new Book("War & Peace", "Leo Tolstoy", "Historical");
        book3 = new Book("Pride & Prejudice", "Jane Austen", "Period Drama");
        book4 = new Book("Gulliver's Travels", "Jonathan Swift", "Fantasy");
    }

    @Test
    public void canGetCollectionSize() {
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection() {
        library.add(book1);
        library.add(book2);
        library.add(book3);
        borrower.loanBookFromLibrary(library, book2);
        assertEquals(1, borrower.collectionCount());
        assertEquals(2, library.booksCount());
    }
}
