package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Gato");
        Pez pez1 = new Pez("Mojarra", "Salada");
        System.out.println("________________________________________________");
        System.out.println("Detalles del Animal: ");
        animal1.mostrarEspecie();
        System.out.println("________________________________________________");
        System.out.println("Detalles del Pez: ");
        pez1.mostrarEspecie();
    }
}

