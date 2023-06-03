package modele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class QueteTest {
    @Test
    void extraitPrecond() {
        // on crée un tableau d'entier qui sera la précondition attendue par la méthode extraitPrecond
        int[] attendu = new int[4];
        attendu[0] = 2;
        attendu[1] = 16;

        Quete quete = new Quete("18|(16, 6)|((2, 16),)|1|100|vaincre Géant du feu"); // la précondition de la quete est [2,16,0,0]
        int[] precondition_quete1 = quete.extraitPrecond("((2, 16),))");

        assertArrayEquals(attendu,precondition_quete1);

        //on fait une nouvelle précondition, mais qui sera inversée [0,0,2,16], elle ne sera donc pas égale à la precond de la quete 1
        int[] precond_inverse = new int[4];
        precond_inverse[2] = 2;
        precond_inverse[3] = 16;

        assertNotEquals(precond_inverse,precondition_quete1); // [0,0,2,16] != [2,16,0,0]

        int[] precond_differente = new int[4];
        precond_differente[1] = 7;
        precond_differente[2] = 7;
        precond_differente[3] = 7;

        assertNotEquals(precond_differente,precondition_quete1); // [0,7,7,7] != [2,16,0,0]
    }
}
