import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("Ulysees", "James Joyce", "Modernist");
        book2 = new Book("War & Peace", "Leo Tolstoy", "Historical");
        book3 = new Book("Pride & Prejudice", "Jane Austen", "Period Drama");
        book4 = new Book("Gulliver's Travels", "Jonathan Swift", "Fantasy");
    }

    @Test
    public void booksStartsEmpty() {
        assertEquals(0, library.booksCount());
    }

    @Test
    public void canAddBook() {
        library.add(book1);
        assertEquals(1, library.booksCount());
    }

    @Test
    public void canOnlyAddBookIfSpaceAvailable() {
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        assertEquals(3, library.booksCount());
    }

    @Test
    public void canRemoveBookFromLibrary() {
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.remove(book2);
        assertEquals(2, library.booksCount());
    }

    @Test
    public void cantRemoveFromLibraryIfNoBooksAvailable() {
        assertEquals(null, library.remove(book1));
    }
}
