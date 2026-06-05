class Musica extends ServicioSuscripcion {
    private String calidad;

    public Musica(String nombre, double costoBase, int meses, String calidad) {
        super(nombre, costoBase, meses);
        this.calidad = calidad.toLowerCase();
    }

    @Override
    public double calcularCosto() {
        double costo = super.calcularCosto();

        switch (calidad) {
            case "baja":
                costo += 20;
                break;
            case "media":
                costo += 50;
                break;
            case "alta":
                costo += 100;
                break;
            case "premium":
                costo += 150;
                break;
        }

        return costo;
    }
}