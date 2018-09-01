package pl.sda.design.pattern;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class StringTest {

    @Test
    public void testEquals() {
        String a = "sample";
        String b = "sample";

        assertThat(a == b, equalTo(true));
    }

}
