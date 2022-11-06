import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var map = crearMap();

        var scanner = new Scanner(System.in);
        int keyNumero;

        do {
            imprimirKey(map);
            keyNumero = scanner.nextInt();
            if (map.containsKey(keyNumero)) {
                System.out.println("El Key que usted seleccionó es: " + map.get(keyNumero));
            } else {
                System.out.println("Eso no existe: ");
            }
        } while (keyNumero != -1);

        scanner.close();
    }

    static HashMap<Integer, String> crearMap() {
        var map = new HashMap<Integer, String>(); //creo el map vacío
        map.put(1, "Uno"); //Relleno el map con valores hardcodeados
        map.put(2, "Dos");
        map.put(3, "Tres");
        map.put(4, "Cuatro");
        map.put(5, "Cinco");
        return map;
    }

    static void imprimirKey(HashMap<Integer, String> map) {
        for (var set : map.entrySet()) {
            System.out.println("Numero: " + set.getKey());
        }
        System.out.println("Escriba -1 para salir del programa: ");
    }
}

