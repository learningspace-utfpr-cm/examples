import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReversewordTest {
    @Test
    public void testReverseWordAsterisk() {
        char delimiter = '*';
        String input = "ola*teste";
        String output = "alo*etset";
        Reverseword rw = new Reverseword(delimiter);

        String result = rw.reverseWords(input);

        assertEquals(output, result);
    }

    @Test
    public void testReverseWordSpace() {
        char delimiter = ' ';
        String input = "ola teste";
        String output = "alo etset";
        Reverseword rw = new Reverseword(delimiter);

        String result = rw.reverseWords(input);

        assertEquals(output, result);
    }

    @Test
    public void testReverseWordPlus() {
        char delimiter = '+';
        String input = "ola+teste";
        String output = "alo+etset";
        Reverseword rw = new Reverseword(delimiter);

        String result = rw.reverseWords(input);

        assertEquals(output, result);
    }
}
