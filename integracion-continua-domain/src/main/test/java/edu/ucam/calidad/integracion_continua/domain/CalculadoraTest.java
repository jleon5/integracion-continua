package edu.ucam.calidad.integracion_continua.domain;

// Importante: Asegúrate de importar JUnit correctamente. 
// Si te sale error aquí, puede que necesites añadir JUnit 4 al Build Path o al pom.xml
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(5, 3);
        assertEquals(2, resultado);
    }
    
    // No hacemos test de 'dividir' para ver cómo baja la cobertura en SonarQube
}