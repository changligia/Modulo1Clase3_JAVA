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
            if (index >= 0 && index < lista.size()) {
                System.out.println("El index que usted seleccionó es: " + lista.get(index));
            } else {
                System.out.println("Index no existe: ");
            }
        } while (index != -1);

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
            System.out.printf("Index: %d, Palabra: %s\n ", i, palabra);
        }
    }
}
