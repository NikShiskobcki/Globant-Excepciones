//Inicializar un objeto de la clase Persona ejercicio 7 de la guía 8 POO, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//con una cláusula try-catch para probar la nueva excepción que debe ser controlada.

import Models.Persona;
import Services.PServ;

public class Main {
    public static void main(String[] args) {
        try {
            Persona persona = new Persona();
            PServ.esMayorDeEdad(persona);
        }
        catch (NullPointerException x){
            System.out.println("Persona inicializada incorrectamente");
        }
    }
}