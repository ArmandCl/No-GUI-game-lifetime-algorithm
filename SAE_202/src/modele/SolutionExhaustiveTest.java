package modele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SolutionExhaustiveTest {
    @Test
    void trouverQuetePlusProche(){
        //instanciation des champs :
        Joueur joueur = new Joueur(); // la position du joueur est à 0,0 par défaut
        Scenario scenario = new Scenario();

        // on ajoute les quetes dans le scénario
        Quete quete1 = new Quete("10|(9, 4)|()|1|100|explorer cimetière de Thilal Taesi");
        scenario.ajout(quete1);
        Quete quete2 = new Quete("1|(8, 9)|()|4|200|dialoguer avec le pere Fouras");// cette quete est la quete la plus proche du joueur
        scenario.ajout(quete2);
        Quete quete3 = new Quete("5|(2, 7)|()|8|250|battre le boss de l'elden ring");
        scenario.ajout(quete3);

        // on crée une nouvelle solution efficace avec le scénario du dessus(3 quetes) et le joueur
        SolutionExhaustive solution = new SolutionExhaustive(scenario,joueur);

        //application de la méthode :
        Quete quetePlusProche = solution.trouverQuetePlusProche(scenario.getChQuetes());

        //Test :
        assertEquals(quete3,quetePlusProche); // Les deux quetes sont les memes car la quete 3 est la plus proche du joueur. posJ = [0,0] posQ3 = [2,7]

        assertNotEquals(quete1,quetePlusProche); // les deux quetes ne sont pas les memes car la quete 1 n'est pas la plus proche du joueur qui se situe en [0,0]

    }
}
