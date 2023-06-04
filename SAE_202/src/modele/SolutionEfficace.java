package modele;

import java.util.ArrayList;

public class SolutionEfficace {
    private Scenario scenario;
    private Joueur joueur;
    private boolean queteFinal;

    /**
     * methode constructeur de la classe Solution et permet d'instancier les deux champs
     * @param scenario Scenario
     * @param joueur Joueur
     */
    public SolutionEfficace(Scenario scenario, Joueur joueur) {
        this.scenario = scenario;
        this.joueur = joueur;
        queteFinal = false;
    }

    /**
     * Méthode pour trouver la quête la plus proche en termes de position
     * @param quetesDisponibles ArrayList<Quete> La liste de quete qui sont disponible ( on a eu cette liste grace à la methode getQuetesDisponibles)
     * @return quetePlusProche Quete La quete la plus proche
     */
    private Quete trouverQuetePlusProche(ArrayList<Quete> quetesDisponibles) {

    }



    /**
     * methode pour utiliser la solution gloutonne
     */
    public void solutionGloutonne() {

    }
}
