import java.util.Random;
import java.util.Scanner;

public class buscarNumArray {
    static int[] array = new int[100];
    static Scanner numUsuario = new Scanner(System.in);
    public static boolean numEncontrado= false;
    public static int numBuscado;
    public static Random aleatorio = new Random();

    public static void rellenarArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(100);
            System.out.println(i + ": " + array[i]);
        }
    }

    public static void preguntar() {
        System.out.println("Ingresa el numero que quieras buscar en el Array");
        numBuscado = numUsuario.nextInt();
    }

    public static void buscarNumero() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numBuscado) {
                System.out.println("El numero ocupa la posición: " + i);
                numEncontrado = true;
            }
        }
        if (!numEncontrado) {
            System.out.println("El numero no se ha encontrado en el array");
        }
    }

    public static void main(String[] args) {
        rellenarArray();
        preguntar();
        buscarNumero();
    }
}