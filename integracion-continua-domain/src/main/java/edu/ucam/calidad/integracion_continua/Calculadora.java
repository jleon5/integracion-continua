package edu.ucam.calidad.integracion_continua;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    // He añadido este método con un pequeño "Code Smell" (System.out.println)
    // para comprobar que SonarQube se queja de que deberíamos usar un Logger.
    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero"); // SonarQube suele marcar esto como "Code Smell"
            return 0;
        }
        return a / b;
    }
}