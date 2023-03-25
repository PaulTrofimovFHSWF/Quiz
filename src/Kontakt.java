public class Kontakt {
    private String name;
    private String vorname;
    private String telefonnummer;

    public Kontakt(String name, String vorname, String telefonnummer) {
        this.name = name;
        if (this.name == null) {
            this.name = "";
        }
        this.vorname = vorname;
        if (this.vorname == null) {
            this.vorname = "";
        }
        this.telefonnummer = telefonnummer;
        if (this.telefonnummer == null) {
            this.telefonnummer = "";
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (this.name == null) {
            this.name = "";
        }
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
        if (this.vorname == null) {
            this.vorname = "";
        }
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
        if (this.telefonnummer == null) {
            this.telefonnummer = "";
        }
    }

    public String toString() {
        return this.getName() + "; " + this.getVorname() + "; " + this.getTelefonnummer();
    }



}
