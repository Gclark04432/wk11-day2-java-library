import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {
    private Library library;

    @Before
    public void before() {
        library = new Library();
    }

    @Test
    public void booksStartsEmpty() {
        assertEquals(0, library.booksCount());
    }
}
