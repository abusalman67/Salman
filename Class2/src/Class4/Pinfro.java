package Class4;

public class Pinfro {

    public String my_name;
    public String my_Father_name;
    public String my_Mother_name;
    public String date_of_birth;
    public String Gender;

    public void Setpasingpramiter(String a, String b, String c, String d, String e) {
        my_name = a;
        my_Father_name = b;
        my_Mother_name = c;
        date_of_birth = d;
        Gender = e;

    }

    public String addresPrint() {
        return ("       My name : " + my_name
                + System.lineSeparator()
                + "My Father name : " + my_Father_name
                + System.lineSeparator()
                + "My Mother name : " + my_Mother_name
                + System.lineSeparator()
                + " Date of birth : " + date_of_birth
                + System.lineSeparator()
                + "        Gender : " + Gender);
    }

}
