package pl.sda.design.pattern.singleton;

import org.junit.Test;

/**
 * Created by adam.
 */
public class FileSystemReaderTest {

    @Test
    public void testIfContentIsEmpty() {
        FileSystemReader.INSTANCE.showDiskContent("d");
    }

}
