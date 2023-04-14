package day40_CustomClass_Statics.addressTask;

public class Address {
    public int buildingNumber, zipcode;
    public String street, city, state;

    public static String country = "USA";


    public void setInfo(int buildingNumber, String street, String city, String state, int zipcode){
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state +", " + zipcode + " " + country;
    }
}
