import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Ulysees", "James Joyce", "Modernist");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Ulysees", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("James Joyce", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Modernist", book.getGenre());
    }
}
