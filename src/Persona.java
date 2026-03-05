public class Persona {
    private String nombre;
    private Corazon corazon; // Composición: la persona TIENE un corazón

    public Persona(String nombre) {
        this.nombre = nombre;
        // El corazón se crea junto con la persona
        this.corazon = new Corazon(72);
}
    public void mostrarEstado() {
        System.out.println("Persona: " + nombre);
        corazon.latir();
    }