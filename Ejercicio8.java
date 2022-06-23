public class Ejercicio8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jonathan");
        persona.setEdad(36);
        persona.setTelefono(634765467);
        System.out.println("Nombre: " + persona.getNombre() + ", Edad:" + persona.getEdad() + ", Telefono: " + persona.getTelefono());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
