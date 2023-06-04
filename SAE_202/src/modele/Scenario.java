package modele;


import java.util.ArrayList;
import java.util.TreeMap;

public class Scenario {
    private ArrayList<Quete> chQuetes;
    private TreeMap<Integer, ArrayList<Quete>> chTreeMapScenario; //arbre avec pour clé un numéro de scénario et pour valeur une liste de quete

    /**
     * Methode constructeur de la classe Scenario qui sert à instancier les champs
     */
    public Scenario() {
        chQuetes = new ArrayList<>();
        chTreeMapScenario = new TreeMap<>();
    }

    /**
     * ajoute une quete à une liste de quetes
     *
     * @param quete Quete La quete qu'on veut ajouter à la liste
     */
    public void ajout(Quete quete) {

    }

    public void ajouterQueteAuScenario(int numeroScenario, Quete quete) {

    }

    // Autres méthodes de la classe Scenario...

    /**
     * recupere le champ chQuetes
     *
     * @return chQuetes ArrayList<Quete>
     */
    public ArrayList<Quete> getChQuetes() {

    }

    /**
     * récupère le champ chTreeMapScenario
     * @return chTreeMapScenario TreeMap<Integer, ArrayList<Quete>> L'arbre avec pour clé un numéro de scénario et pour valeur une liste de quete
     */
    public TreeMap<Integer, ArrayList<Quete>> getchTreeMapScenario() {

    }
}
