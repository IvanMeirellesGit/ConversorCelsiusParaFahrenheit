import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;

        ConversorCelsiusFahrenheit conversor = new ConversorCelsiusFahrenheit(0);

        if (conversor.validarEntrada()) {
            fahrenheit = conversor.conversorParaFahrenheit();

            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

            input.close();
        }
    }
}