import com.damdaw.Automobil;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;  

public class TestAutomobil {
    
    @Test
    public void testValidarMatricula() {
        // Test de matrícules vàlides
        assertTrue(com.damdaw.Automobil.validarMatricula("1234PAB")); // True
        assertTrue(Automobil.validarMatricula("1234ABC")); // True
        assertTrue(Automobil.validarMatricula("5678XYZ"));
        
        // Test de matrícules invàlides
        assertFalse(Automobil.validarMatricula("1234ABCD")); // massa llarga
        assertFalse(Automobil.validarMatricula("123ABC")); // massa curta
        assertFalse(Automobil.validarMatricula("1234abc")); // lletres minúscules
        assertFalse(Automobil.validarMatricula("1234")); // massa curta
        assertFalse(Automobil.validarMatricula("1234!@#")); // cadena buida

    }


}
