package entities;

public class Retangulo {

    public double altura;
    public double largura;

    public double area(){
        return altura * largura;
    }

    public double perimetro() {
        return 2 * (altura + largura);
    }

    public double diagonal() {
        return Math.sqrt((largura * largura) + (altura * altura));
    }

    public String toString() {
        return
                String.format("ÁREA = %.2f%n", area())
                + String.format("PERÍMETRO = %.2f%n", perimetro())
                + String.format("DIAGONAL = %.2f%n", diagonal());
    }
}