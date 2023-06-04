package modele;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LectureFichierTexte {
    static Scenario scenario;

    /**
     * Permet de lire un fichier voulu en utilisant un scanner.
     * Crée un scénario (du type Scénario) où il stocke ce qu'il a lut du fichier
     *
     * @param fichier File Le fichier que nous voulons lire
     */
    public static void lecture(File fichier){
        scenario = new Scenario();
        try {
            Scanner scanner = new Scanner(fichier);
            while (scanner.hasNext()){
                Quete quete = (new Quete(scanner.nextLine()));
                scenario.ajout(quete);
                //System.out.println(quete);
            }
        }
        catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }

    /**
     * Permet de recuperer le scénario qui sera créé grâce à la méthode lecture
     *
     * @return scenario Scenario
     */
    public Scenario getScenario() {

    }
}
