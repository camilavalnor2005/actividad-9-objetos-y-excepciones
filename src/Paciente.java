public class Paciente {
    private String nombre;
    private double peso;
    private double altura;


    public Paciente(String camila, double peso, double altura) {
        this.nombre = camila;
        this.peso = peso;
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // Método para calcular el IMC
    public String calcularIMC() {
        try {
            double imc = peso / (altura * altura);
            if (imc < 18.5) {
                return nombre + ", tu IMC es " + String.format("%.2f", imc) + ". Estás bajo de peso.";
            } else if (imc < 24.9) {
                return nombre + ", tu IMC es " + String.format("%.2f", imc) + ". Tienes un peso normal.";
            } else if (imc < 29.9) {
                return nombre + ", tu IMC es " + String.format("%.2f", imc) + ". Tienes   sobrepeso.";
            } else {
                return nombre + ", tu IMC es " + String.format("%.2f", imc) + ". Tienes obesidad.";
            }
        } catch (ArithmeticException e) {
            return "Error: La altura no puede ser cero.";
        } catch (Exception e) {
            return "Error inesperado: " + e.getMessage();
        }
    }
}
