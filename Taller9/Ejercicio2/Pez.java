package Ejercicio2;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    public String getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + getTipoDeAgua());
    }
}