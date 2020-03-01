package Class4;

public class Main {

    public static void main(String[] args) {

        Person salman = new Person();

        salman.personalinfro.Setpasingpramiter("Md.Abu Salman Hossain", "Md. Abdur Awal Sarker", "Miss Nurzahan Begum", "20-10-2000", "Male");
        System.out.println("           My Personal Information");
        System.out.println(salman.personalinfro.addresPrint());

        salman.contact.cont("01780315793", "salman120522@gmail.com");
        System.out.println();
        System.out.println("           Contact Way");
        // System.out.println();
        System.out.println(salman.contact.Print());

        salman.address.Setpassingpramiter("74/1,Bonogram Abasik Area", "Sirajgonj Sadar", "Sirajgonj", "678", "Bangladesh");
        System.out.println();
        System.out.println("           Prasent Address");
        //System.out.println();
        System.out.println(salman.address.addressPrint());

        salman.educationinfro.education("525", "5.00", "5.00", "5.00", "3.94", "4.00");
        System.out.println();
        System.out.println("            Educational Colification of CGPA");
        // System.out.println();
        System.out.println(salman.educationinfro.EducationPrint());
        System.out.println();

    }

}
