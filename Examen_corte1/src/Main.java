public class Main {
    public static void main(String[] args) {

        Servicio[] servicios = {
                new Streaming("Netflix", 200, 6, 3, true),
                new Musica("Spotify", 100, 12, "premium"),
                new Cloud("AWS Cloud", 500, 50, 200, "Corporativo")
        };

        System.out.println("=== COSTO DE SERVICIOS ===");

        for (Servicio s : servicios) {
            System.out.println(
                    s.getNombre() + " -> $" + s.calcularCosto()
            );
        }
    }
}