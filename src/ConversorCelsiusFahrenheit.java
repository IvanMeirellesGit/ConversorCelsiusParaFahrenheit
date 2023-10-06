import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
    private double celsius;

    public ConversorCelsiusFahrenheit(double celsius) {
        this.celsius = celsius;
    } // Construtor da Classe

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double conversorParaFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public boolean validarEntrada() {
        Scanner input = new Scanner(System.in);

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite a temperatura em graus Celsius: ");
                celsius = input.nextDouble();
                entradaValida = true; // A entrada é válida, saia do loop
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                input.nextLine(); // Limpa o buffer de entrada
            }
        }

        return true;
    }
}
