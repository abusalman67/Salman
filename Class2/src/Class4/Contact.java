package Class4;

public class Contact {

    public String cell_number;
    public String email_address;

    public void cont(String a, String b) {

        cell_number = a;
        email_address = b;

    }

    public String Print() {
        return ("  Cell number : " + cell_number
                + System.lineSeparator()
                + "Email address : " + email_address);

    }
}
