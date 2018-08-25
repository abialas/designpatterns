package pl.sda.design.pattern.builder;

import java.time.LocalDate;

/**
 * Created by adam.
 */
public class UserBuilderImpl implements UserBuilder {

    private User user;

    public UserBuilderImpl() {
        user = new User();
    }

    @Override
    public User build() {
        return user;
    }

    @Override
    public UserBuilder setFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    @Override
    public UserBuilder setLastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    @Override
    public UserBuilder setBirthDate(LocalDate birthDate) {
        user.setBirthDate(birthDate);
        return this;
    }

    @Override
    public UserBuilder setPlaceOfBirth(String placeOfBirth) {
        user.setPlaceOfBirth(placeOfBirth);
        return this;
    }

    @Override
    public UserBuilder setSex(char sex) {
        user.setSex(sex);
        return this;
    }

    @Override
    public UserBuilder setIdNumber(String idNumber) {
        user.setIdNumber(idNumber);
        return this;
    }
}
