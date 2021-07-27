import org.junit.Test;

import java.io.IOException;

import static Utilities.ReadFileUtility.readAFile;
import static org.junit.Assert.assertEquals;

public class ReadFileTest {

    @Test
    public void checkForCopying() throws IOException {

        String expected =" to change the world and reimagine the future. See this keynote and more from the Hitachi Social\n" +
                " Hitachi Vantara is a data storage systems provider, previously known as Hitachi Data Systems (HDS).\n" +
                " Headquartered in Santa Clara, Calif., Hitachi Vantara is a wholly owned subsidiary of Hitachi Ltd.\n" +
                " Gajen Kandiah became chief executive officer of Hitachi Vantara in July 2020.\n" +
                " like Aldus PageMaker including versions of Lorem Ipsum. Hitachi\n";

        String actual= readAFile();
        assertEquals(actual,expected);
    }
}
