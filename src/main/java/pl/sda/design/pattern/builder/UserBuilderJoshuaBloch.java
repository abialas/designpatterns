package pl.sda.design.pattern.builder;

import java.time.LocalDate;

/**
 * Created by adam.
 */
public class UserBuilderJoshuaBloch {

    private String firstName;
    private String lastName;

    private LocalDate birthDate;
    private String placeOfBirth;
    private char sex;
    private String idNumber;

    private UserBuilderJoshuaBloch(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.birthDate = builder.birthDate;
        this.placeOfBirth = builder.placeOfBirth;
        this.sex = builder.sex;
        this.idNumber = builder.idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "UserBuilderJoshuaBloch{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", birthDate=" + birthDate + ", placeOfBirth='" + placeOfBirth + '\'' + ", sex=" + sex + ", idNumber='" + idNumber + '\'' + '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;

        private LocalDate birthDate;
        private String placeOfBirth;
        private char sex;
        private String idNumber;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
            return this;
        }

        public Builder setSex(char sex) {
            this.sex = sex;
            return this;
        }

        public Builder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public UserBuilderJoshuaBloch build() {
            return new UserBuilderJoshuaBloch(this);
        }

    }

}
