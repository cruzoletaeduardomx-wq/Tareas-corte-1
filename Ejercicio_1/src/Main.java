public class Main {
    public static void main(String[] args){
// Creamos dos objetos de tipo Estudiante usando el constructor Estudiante alumno1 = new Estudiante("Carlos", 7.5);
        Estudiante alumno2 = new Estudiante("Sofía", 4.2);

// Mostramos su información inicial alumno1.mostrarInfo();
        alumno2.mostrarInfo();

// El alumno 2 estudia y sube su calificación System.out.println("¡Sofía repitió el examen!");
        alumno2.setCalificacion(8.0);

// Volvemos a mostrar su información actualizada alumno2.mostrarInfo();
    }
}