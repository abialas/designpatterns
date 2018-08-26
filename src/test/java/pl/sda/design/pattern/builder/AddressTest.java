package pl.sda.design.pattern.builder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class AddressTest {

    @Test
    public void givenAddressDataWhenBuildAddressThenReturnAddressObject() {
        Address address = new Address.Builder().setCity("Katowice")
            .setPostCode("40-000")
            .build();

        assertThat(address.getCity(), equalTo("Katowice"));
    }

}
