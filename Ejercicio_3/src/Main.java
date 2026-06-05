public class Main {

    public static void main(String[] args) {

        Figura figura1 = new Triangulo(5, 4, 5, 4, 3);
        Figura figura2 = new Rectangulo(8, 6);
        Figura figura3 = new Circulo(7);

        Figura[] figuras = {figura1, figura2, figura3};

        for (Figura figura : figuras) {

            System.out.println("Area: " + figura.calcularArea());
            System.out.println("Perimetro: " + figura.calcularPerimetro());
            System.out.println("-----------------");
        }
    }
}