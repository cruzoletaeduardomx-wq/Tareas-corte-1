public class Estudiante {

    // Atributos
    private String nombre;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Método para cambiar la calificación
    public void setCalificacion(double nuevaCalif) {
        this.calificacion = nuevaCalif;
    }

    // Método para verificar si aprobó
    public boolean haAprobado() {
        return this.calificacion >= 6.0;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Nota: " + calificacion);
        System.out.println("¿Aprobado?: " + (haAprobado() ? "Sí" : "No"));
        System.out.println("-------------------------");
    }
}