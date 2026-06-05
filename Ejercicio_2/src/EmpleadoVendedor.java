class EmpleadoVendedor extends Empleado {

    private double comision;

    public EmpleadoVendedor(String name, double salarioBase, double comision) {
        super(name, salarioBase);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}

