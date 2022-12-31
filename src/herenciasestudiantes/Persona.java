package herenciasestudiantes;

public class Persona {
    private String nombre;
    private int edad;
    private  char genero;

    public Persona(String nombre) {this.nombre = nombre;}

    //Constructor completo
    public Persona(String nombre, char genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre ;
    }
}
