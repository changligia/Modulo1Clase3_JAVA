import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var listaString = crearLista();
        var mapPrecio = crearMapPrecio(listaString);
        var mapStock = crearMapStock(listaString);

        var scanner = new Scanner(System.in);
        String key;

        do {
            imprimirKeyMayusculas(mapStock);

            System.out.print("Escriba el Key: ");
            key = scanner.nextLine();
            if (mapPrecio.containsKey(key)) {
                System.out.printf("El item %s tiene un precio de %.2f USD y su stock es de %d unidades%n",
                        key, mapPrecio.get(key), mapStock.get(key));
            } else {
                System.out.println("Eso no existe");
            }
        } while (mapPrecio.containsKey(key));
        scanner.close();
    }

    static List<String> crearLista() {
        var listaString = new ArrayList<String>(); //Creo la lista vacía
        listaString.add("25.12USD,CHOMPA,3"); // Relleno la lisa con valores hardcodeados
        listaString.add("741.12USD,POLERA,15");
        listaString.add("9000.1USD,CASACA,2");
        listaString.add("90.00USD,ZAPATO,1");
        return listaString;
    }

    static HashMap<String, Double> crearMapPrecio(List<String> lista) {
        var mapPrecio = new HashMap<String, Double>(); //creo el map vacío, key: nombre, value: precio
        for (var linea : lista) {
            var listaLinea = Arrays.asList(linea.split(","));

            var precioLista = listaLinea.get(0);
            var index = precioLista.indexOf("USD"); //posición
            var precioSinUsd = precioLista.substring(0, index); // "25.12"
            var precioDouble = Double.parseDouble(precioSinUsd); //25.12

            var nombre = listaLinea.get(1);
            mapPrecio.put(nombre, precioDouble);
        }
        return mapPrecio;
    }

    static HashMap<String, Integer> crearMapStock(List<String> lista) {
        var mapStock = new HashMap<String, Integer>(); //creo el map vacío, key: nombre, value: stock
        for (var linea : lista) {
            var listaLinea = Arrays.asList(linea.split(","));
            var nombre = listaLinea.get(1);
            var stock = Integer.parseInt(listaLinea.get(2));
            mapStock.put(nombre, stock);
        }
        return mapStock;
    }

    static void imprimirKeyMayusculas(HashMap<String, Integer> map) {
        for (var set : map.entrySet()) {
            System.out.println(set.getKey().toUpperCase());
        }
    }
}
