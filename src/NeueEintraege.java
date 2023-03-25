public class NeueEintraege {
    public static Kontakt erzeugeEintrag(String kontakt) {

        String[] split = kontakt.split("; ");

        Kontakt neuerEintrag = new Kontakt(split[0], split[1], split[2]);

        return neuerEintrag;
    }
}
