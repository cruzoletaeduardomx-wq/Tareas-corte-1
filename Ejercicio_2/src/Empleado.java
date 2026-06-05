class Empleado {

    protected String name;
    protected double salarioBase;

    public Empleado(String name, double salarioBase) {
        this.name = name;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
