package modele;


import java.io.File;

/**
 * Cette classe représente le point d'entrée du programme.
 * Elle exécute les solutions gloutonne et exhaustive sur un scénario donné.
 */
public class Client {
    /**
     * Méthode principale du programme.
     * Elle charge le scénario à partir d'un fichier, crée les instances de joueur et de solutions,
     * puis exécute les solutions gloutonne et exhaustive.
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        File file = new File("SAE_202"+ File.separator + "scenario" + File.separator + "scenario_1.txt");
        LectureFichierTexte lectureFichierTexte = new LectureFichierTexte();
        lectureFichierTexte.lecture(file);

        // Récupérer le scénario et le joueur
        Scenario scenario = lectureFichierTexte.getScenario();
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();

        // Créer une instance de Solution
        SolutionEfficace gloutonne = new SolutionEfficace(scenario, joueur1);
        SolutionExhaustive exhaustive = new SolutionExhaustive(scenario, joueur2);


        // Appliquer la solution gloutonne
        gloutonne.solutionGloutonne();

        System.out.println("");
        // Appliquer la solution exhaustive
        exhaustive.solutionExhaustive();
    }
}
