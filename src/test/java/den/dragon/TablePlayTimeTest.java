package den.dragon;

import org.junit.Test;

public class TablePlayTimeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderOver21ThrowsException() {
        TablePlayTime tableGenerator = new TablePlayTime();
        tableGenerator.generateHeader(null, null, 22);
    }
}
