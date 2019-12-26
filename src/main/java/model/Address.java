package model;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;
import java.util.StringJoiner;

@Builder
public class Address {

    private String city;
    private String street;
    private int index;

    public Address(String city, String street, int index) {
        this.city = city;
        this.street = street;
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return index == address.index &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, index);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("city='" + city + "'")
                .add("street='" + street + "'")
                .add("index=" + index)
                .toString();
    }
}
