import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class KontaktMain {

    public static String auslesen(String path) {
        String fileContent = "";


        try (BufferedReader in = Files.newBufferedReader(Paths.get(path))) { // das mit den Klammern ist dafür da, um den BufferedReader wieder sauber zu schließen
            String line = in.readLine();
            while (line != null) {
                fileContent += line + "\n";
                line = in.readLine();
            }
        }
        catch (IOException e) { // wenn der File fehlerhaft ist oder nix drin steht, dann wird die Exeption geworden
            System.out.println("Didn't work on file" + path);
        }
        return fileContent;
    }

    public static void KontaktArray() {
        Kontakt[] array = new Kontakt[155];
    }

    public static Kontakt suchen(String nameOderTelefonnummer) {
        return null;
    }






    public static void main(String[] args) {
        Kontakt niklas = new Kontakt("Müller", "Niklas", "02391/9422-412");
        Kontakt steffen = new Kontakt("Schmidt", "Steffen", "02391/4325-423");

        System.out.println(niklas.toString());
        System.out.println(steffen.toString());
        String text = auslesen("src/Telefonbuchdaten.txt");
        System.out.println(text);

        Scanner scan = new Scanner(System.in);
        String ausgabe = "";
        ausgabe += "Bitte wählen Sie aus: \n";
        ausgabe += "1. Adressen aus einer Datei in das Programm laden \n";
        ausgabe += "2. Nach einer speziellen Adresse suchen \n";
        ausgabe += "3. Eine neue Adresse speichern \n";
        ausgabe += "4. Programm beenden \n";
        System.out.println(ausgabe);
        String eingabe = scan.nextLine();
        String ergebnis = "";
        boolean weiter = true;
        while (weiter) {
            switch (eingabe) {
                case "Lade Adressen":
                    ergebnis = "";
                    break;
                case "Suche Adressen":
                    ergebnis = "";
                    break;
                case "Erstelle neunen Eintrag":
                    NeueEintraege.erzeugeEintrag("Schmidt; Oliver; 023391/32443-424");
                    break;
                case "Beende Programm":
                    weiter = false;
            }
        }


        System.out.println(ergebnis);





    }


}
