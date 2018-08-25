package pl.sda.design.pattern;

import org.junit.Before;
import org.junit.Test;
import pl.sda.design.pattern.builder.User;
import pl.sda.design.pattern.builder.UserBuilderImpl;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class UserBuilderImplTest {

    private UserBuilderImpl userBuilderSUT;

    @Before
    public void setup() {
        userBuilderSUT = new UserBuilderImpl();
    }

    @Test
    public void givenAllDataWhenBuildThenReturnUserWithAllData() {
        // given
        userBuilderSUT.setFirstName("Adam")
          .setLastName("Bialas")
          .setSex('M')
          .setBirthDate(LocalDate.of(1986, 8, 3));

        // when
        User user = userBuilderSUT.build();

        // then
        assertThat(user.getFirstName(), equalTo("Adam"));
        assertThat(user.getLastName(), equalTo("Bialas"));
        assertThat(user.getSex(), equalTo('M'));
        assertThat(user.getBirthDate(), equalTo(LocalDate.of(1986, 8, 3)));
    }

}
