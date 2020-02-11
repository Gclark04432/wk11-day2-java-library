import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Ulysees", "James Joyce", "Modernist");
    }

    @Test
    public void booksStartsEmpty() {
        assertEquals(0, library.booksCount());
    }

    @Test
    public void canAddBook() {
        library.add(book);
        assertEquals(1, library.booksCount());
    }

    @Test
    public void canOnlyAddBookIfSpaceAvailable() {
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals(3, library.booksCount());
    }
}
