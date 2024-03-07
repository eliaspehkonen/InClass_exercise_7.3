import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AskNumberTest {
    AskNumber askNumber = new AskNumber();

    @Test
    public void testSum() {
        askNumber.setNumber_a(1);
        askNumber.setNumber_b(-9);
        assertEquals(askNumber.sum(), -8);
    }
}
