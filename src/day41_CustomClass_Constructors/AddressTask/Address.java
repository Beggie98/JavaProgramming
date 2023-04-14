package day41_CustomClass_Constructors.AddressTask;

public class Address {
    public String buildingNumber, street, city, state;
    public int zipcode;

    public static String country;

    static {
        country = "USA";
    }

    public Address(String buildingNumber, String street, String city, String state, int zipcode){
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString(){
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipcode + " " + country;
    }

}
