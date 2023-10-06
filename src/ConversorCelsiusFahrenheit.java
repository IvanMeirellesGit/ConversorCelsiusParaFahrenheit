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
}
