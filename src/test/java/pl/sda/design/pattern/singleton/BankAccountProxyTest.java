package pl.sda.design.pattern.singleton;

import org.junit.Before;
import org.junit.Test;
import pl.sda.design.pattern.proxy.BankAccountProxy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class BankAccountProxyTest {

    private BankAccountProxy bankAccountProxy;

    @Before
    public void setup() {
        bankAccountProxy = new BankAccountProxy();
    }

    @Test
    public void testWithdrawAmount() {
        bankAccountProxy.withdrawAmount(100.0);

        assertThat(bankAccountProxy.getBalance(), equalTo(0.0));
    }

}
