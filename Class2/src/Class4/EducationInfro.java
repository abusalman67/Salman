package Class4;

public class EducationInfro {

    public String PSC;
    public String JSC;
    public String SSC;
    public String HSC;
    public String BSCEng;
    public String MSCEng;

    public void education(String a, String b, String c, String d, String e, String f) {
        PSC = a;
        JSC = b;
        SSC = c;
        HSC = d;
        BSCEng = e;
        MSCEng = f;
    }

    public String EducationPrint() {
        return ("       PSC : " + PSC
                + System.lineSeparator()
                + "       JSC : " + JSC
                + System.lineSeparator()
                + "       SSC : " + SSC
                + System.lineSeparator()
                + "       HSC : " + HSC
                + System.lineSeparator()
                + "    BSCEng : " + BSCEng
                + System.lineSeparator()
                + "    MSCEng : " + MSCEng);
    }

}
