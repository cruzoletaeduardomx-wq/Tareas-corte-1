class EmpleadoRepartidor extends Empleado {

    private int zonasRepartidas;

    public EmpleadoRepartidor(String name, double salarioBase, int zonasRepartidas) {
        super(name, salarioBase);
        this.zonasRepartidas = zonasRepartidas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (zonasRepartidas * 50);
    }
}
