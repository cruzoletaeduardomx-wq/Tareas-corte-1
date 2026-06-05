class Vehiculo {

    private String marca;
    private String modelo;
    private double costoBase;

    public Vehiculo(String marca, String modelo, double costoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.costoBase = costoBase;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public double getCostoBase(){
        return costoBase;
    }

    public double calcularCosto(){
        return costoBase;
    }
}


