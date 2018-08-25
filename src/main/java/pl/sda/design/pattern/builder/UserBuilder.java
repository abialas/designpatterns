package pl.sda.design.pattern.builder;

import java.time.LocalDate;

/**
 * Created by adam.
 */
public interface UserBuilder {

    User build();

    UserBuilder setFirstName(String firstName);

    UserBuilder setLastName(String lastName);

    UserBuilder setBirthDate(LocalDate birthDate);

    UserBuilder setPlaceOfBirth(String placeOfBirth);

    UserBuilder setSex(char sex);

    UserBuilder setIdNumber(String idNumber);

}
