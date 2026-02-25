public class Conversor_de_unidades {
    
     public static void main(String[] args) {

        // Declaración de variables
        double tazas = 3.5;
        double mililitros;
        double litros;

        // Conversión
        mililitros = tazas * 236.588;
        litros = mililitros / 1000;

        // Mostrar resultados
        System.out.println("=== Conversor de Unidades ===");
        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros + " ml");
        System.out.println("Litros: " + litros + " L");
    }
}
