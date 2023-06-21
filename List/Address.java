package List;

public class Address {
   private String country;
   private String state;
   private String city;
public Address(String country, String state, String city) {
    this.country = country.toUpperCase();
    this.state = state.toUpperCase();
    this.city = city.toUpperCase();
}
@Override
public String toString() {
    return "Address [country=" + country + ", state=" + state + ", city=" + city + "]";
}
public String getCountry() {
    return country;
}
public void setCountry(String country) {
    this.country = country;
}
public String getState() {
    return state;
}
public void setState(String state) {
    this.state = state;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
}
