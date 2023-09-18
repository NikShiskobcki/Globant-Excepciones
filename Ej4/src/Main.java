//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Random random = new Random();

        int r = random.nextInt(501);
        int guess = -1;
        int intentos = 0;

        System.out.println(r);
        System.out.println("Adivine el numero");

        while (guess!=r){
            try {
                System.out.println("Ingrese un numero");
                guess = rd.nextInt();
                rd.nextLine();
                intentos++;
            }
            catch (InputMismatchException x){
                System.out.println("Debe ingresar numeros enteros");
                rd.next();
                intentos++;
            }
        }
        System.out.println("Adivinó el numero en "+ intentos + " intentos");
    }
}