package pl.sda.design.pattern.builder;

/**
 * Created by adam.
 */
public class Address {

    private String street;
    private String houseNumber;
    private String flatNumber;
    private String city;
    private String postCode;

    private Address(Builder builder) {
        this.city = builder.city;
        this.houseNumber = builder.houseNumber;
        this.flatNumber = builder.flatNumber;
        this.street = builder.street;
        this.postCode = builder.postCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public static class Builder {
        private String street;
        private String houseNumber;
        private String flatNumber;
        private String city;
        private String postCode;

        public String getStreet() {
            return street;
        }

        public Builder setStreet(String street) {
            this.street = street;
            // return this to allow Fluent API
            return this;
        }

        public String getHouseNumber() {
            return houseNumber;
        }

        public Builder setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public String getFlatNumber() {
            return flatNumber;
        }

        public Builder setFlatNumber(String flatNumber) {
            this.flatNumber = flatNumber;
            return this;
        }

        public String getCity() {
            return city;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public String getPostCode() {
            return postCode;
        }

        public Builder setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

}
