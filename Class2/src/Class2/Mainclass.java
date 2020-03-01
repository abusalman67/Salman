package Class2;

public class Mainclass {

    public static void main(String[] args) {
        Address salman_add = new Address();
       /* salman_add.my_name = "Md.Abu Salman Hossain";
        salman_add.recipient = "Md. Abdur Awal Sarker";
        salman_add.address_line1 = "74/1,Bonogram Abasik Area  ";
        salman_add.address_line2 = "Sirajgonj Sadar";
        salman_add.district = "Sirajgonj";
        salman_add.postal_code = "678";
        salman_add.country = "Bangladesh";*/
        
        salman_add.Setpassingpramiter("74/1,Bonogram Abasik Area", "Sirajgonj Sadar", "Sirajgonj", "678", "Bangladesh");

      System.out.println(salman_add.addressPrint());
    }

}
