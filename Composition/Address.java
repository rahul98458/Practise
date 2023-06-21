package Composition;

public class Address {
    private String country;
    private String State;
    private String city;
    public Address(String country, String state, String city) {
        this.country = country;
        State = state;
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Address [country=" + country + ", State=" + State + ", city=" + city + "]";
    }
}
