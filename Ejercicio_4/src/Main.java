public class Main {
    public static void main(String[] args) {

        Vehiculo auto = new Auto("Toyota", "Corolla", 20000, 4);
        Vehiculo moto = new Moto("Honda", "CBR", 10000, 600);

        System.out.println("Costo del Auto: " + auto.calcularCosto());
        System.out.println("Costo de la Moto: " + moto.calcularCosto());
    }
}