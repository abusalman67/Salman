package Class2;

public class Address {

    public String my_name;
    public String recipient;
    public String address_line1;
    public String address_line2;
    public String district;
    public String postal_code;
    public String country = "Bangladesh";

    public void Setpassingpramiter(String c, String d, String e, String f, String g) {

        address_line1 = c;
        address_line2 = d;
        district = e;
        postal_code = f;
        country = g;

    }

    public String addressPrint() {
        return ("     Vasa number : " + address_line1
                + System.lineSeparator()
                + "          Upzila : " + address_line2
                + System.lineSeparator()
                + "         Distric : " + district
                + System.lineSeparator()
                + "     Postal code : " + postal_code
                + System.lineSeparator()
                + "         Country : " + country);
    }

}
