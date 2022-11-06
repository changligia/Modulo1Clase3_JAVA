import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String opcion;

        do {
            imprimirMenu();
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (!opcion.equals("Despedirse"));
        scanner.close();
    }

    static void imprimirMenu() {
        System.out.println("***Elija una palabra:***");
        System.out.println("Saludarme");
        System.out.println("Hora");
        System.out.println("Comida");
        System.out.println("Despedirse");
    }

    static void ejecutarOpcion(String palabra) {
        switch (palabra) {
            case "Saludarme":
                System.out.println("Hola, como estas?");
                break;
            case "Hora":
                System.out.println("Ok, te diré la hora");
                break;
            case "Comida":
                System.out.println("Es hora de comer!");
                break;
            case "Despedirse":
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opción Incorrecta");
                break;
        }
    }
}
