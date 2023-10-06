import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("Digite a temperatura em celsius: ");
        celsius = input.nextDouble();

        ConversorCelsiusFahrenheit conversor = new ConversorCelsiusFahrenheit(celsius);
        fahrenheit = conversor.conversorParaFahrenheit();

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        input.close();
    }
}