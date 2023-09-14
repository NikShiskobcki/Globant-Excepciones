//Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción IndexOutOfBoundsException (índice de arreglo fuera
//de rango).
import Models.Listado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        int[] aux = {15, 25, 33, 65, 48, 56};
        ArrayList <Integer> nums = new ArrayList<>();
        for (int i = 0; i<aux.length; i++){
            nums.add(aux[i]);
        }

        Listado listado = new Listado(nums, aux.length);

        System.out.println("ingrese indice a consultar (0-5)");
        int idx = rd.nextInt();

        try {
            int num = nums.get(idx);
            System.out.println(num);
        }
        catch (IndexOutOfBoundsException x){
            System.out.println("Indice fuera de rango");
        }
    }
}