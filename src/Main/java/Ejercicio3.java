import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var lista = crearListaStrings();

        var scanner = new Scanner(System.in);
        int index;

        do {
            imprimirLista(lista);
            index = scanner.nextInt();
            try {
                System.out.printf("La palabra seleccionada es: %s%n", lista.get(index));
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println("La palabra con ese index no existe");
            }
        }
        while (index != -1);
        scanner.close();
    }

    static List<String> crearListaStrings() {
        var listaString = new ArrayList<String>(); //Creo la lista vacía
        listaString.add("Hola"); // Relleno la lisa con valores hardcodeados
        listaString.add("Mundo");
        listaString.add("Aloha");
        listaString.add("Bota Vieja");
        return listaString;
    }

    static void imprimirLista(List<String> lista) {
        for (var i = 0; i < lista.size(); i++) {
            var palabra = lista.get(i);
            System.out.printf("Index: %d, Palabra: %s%n ", i, palabra);
        }
    }
}
