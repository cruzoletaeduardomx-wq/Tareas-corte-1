class Servicio {
    private String nombre;
    private double costoBase;

    public Servicio(String nombre, double costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public double calcularCosto() {
        return costoBase;
    }
}
