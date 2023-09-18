//En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        try {
            System.out.println("Ingrese un numero");
            String str1 = rd.nextLine();
            System.out.println("Ingrese otro numero");
            String str2 = rd.nextLine();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            int res = num1/num2;
            System.out.println(res);
        }

        catch (InputMismatchException x){
            System.out.println("Input erroneo");
        }

        catch (NumberFormatException x){
            System.out.println("El string no contiene solo numeros");
        }

        catch (ArithmeticException x){
            System.out.println("No se puede dividir entre 0");
        }
    }
}