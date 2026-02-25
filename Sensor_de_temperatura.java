import java.util.Scanner;

public class Sensor_de_temperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        double temperatura;
        String nombre;
        int Lectura;
        boolean enAlarma;

        // Entrada de datos
        System.out.print("Ingrese el nombre del sensor: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el número de lectura: ");
        Lectura = scanner.nextInt();

        System.out.print("Ingrese la temperatura actual en °C: ");
        temperatura = scanner.nextDouble();

        // Condición de alarma
        enAlarma = temperatura > 80;

        // Mostrar resultados
        System.out.println("\n=== Estado del Sensor ===");
        System.out.println("Nombre del sensor: " + nombre);
        System.out.println("Número de lectura: " + Lectura);
        System.out.println("Temperatura actual: " + temperatura + " °C");
        System.out.println("En alarma: " + enAlarma);
    }
}