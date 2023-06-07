package modele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Cette classe nous permettra de tester les différentes méthodes de la classe SolutionEfficace et de nous assurer qu'elles fonctionnent comme voulu.
 */
public class SolutionEfficaceTest {
    @Test
    void trouverQuetePlusProche(){
        //instanciation des champs :
        Joueur joueur = new Joueur(); // la position du joueur est à 0,0 par défaut
        Scenario scenario = new Scenario();

        // on ajoute les quetes dans le scénario
        Quete quete1 = new Quete("10|(19, 3)|()|1|100|dialoguer avec Osiris le dieu des morts-vivants");
        scenario.ajout(quete1);
        Quete quete2 = new Quete("1|(2, 4)|()|4|200|explorer cimetière de Thilal Taesi");// cette quete est la quete la plus proche du joueur
        scenario.ajout(quete2);
        Quete quete3 = new Quete("5|(20, 16)|()|8|250|explorer porte de Mythalian");
        scenario.ajout(quete3);

        // on crée une nouvelle solution efficace avec le scénario du dessus(3 quetes) et le joueur
        SolutionEfficace solution = new SolutionEfficace(scenario,joueur);

        //application de la méthode :
        Quete quetePlusProche = solution.trouverQuetePlusProche(scenario.getChQuetes());

        //Test :
        assertEquals(quete2,quetePlusProche); // Les deux quetes sont les memes car la quete 2 est la plus proche du joueur. posJ = [0,0] posQ1 = [2,4]

        assertNotEquals(quete3,quetePlusProche); // les deux quetes ne sont pas les memes car la quete 3 n'est pas la plus proche du joueur qui se situe en [0,0]

    }
}
