package modele;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ScenarioTest {
    @Test
    void ajout(){
        Scenario scenario = new Scenario();

        // comme le scénario est vide, quand on récupère les quetes, la liste est vide
        ArrayList<Quete> liste_quete_vide = scenario.getChQuetes();

        assertTrue(liste_quete_vide.isEmpty());

        //on ajoute deux quetes au scénario et on regarde si elles ont bien été ajoutées
        Quete quete1 = new Quete("1|(52, 6)|((9, 3), (8,))|12|350|explorer cascade de Nilvehona");
        scenario.ajout(quete1);
        Quete quete2 = new Quete("8|(14, 22)|((18,),)|7|250|vaincre Scorpion noir");
        scenario.ajout(quete2);
        Quete quete3 = new Quete("0|(14, 22)|((1,),(8,))|7|600|vaincre Scorpion noir");
        scenario.ajout(quete3);

        assertEquals(3, scenario.getChQuetes().size());// la taille est de 3
        assertTrue(scenario.getChQuetes().contains(quete1)); //quete 1 est bien ajoutée
        assertTrue(scenario.getChQuetes().contains(quete2)); //quete 2 est bien ajoutée
        assertTrue(scenario.getChQuetes().contains(quete3)); //quete 3 est bien ajoutée

    }
}
