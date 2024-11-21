package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andres Matamoros", 43);

        Empleado empleado1 = new Empleado("German Pertuz", 42, "Salud publica");
        
        System.out.println("________________________________________________");
        System.out.println("Detalles de la Persona:");
        persona1.mostrarDetalles();
        System.out.println("________________________________________________");
        System.out.println("Detalles del Empleado:");
        empleado1.mostrarDetalles();
    }
}

