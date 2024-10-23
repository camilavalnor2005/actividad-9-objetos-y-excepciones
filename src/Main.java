import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            String nombre = "camila";
            double peso = 62.0;
            double altura = 1.67;

            Paciente paciente = new Paciente(nombre, peso, altura);
            String resultadoIMC = paciente.calcularIMC();
            System.out.println(resultadoIMC);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
