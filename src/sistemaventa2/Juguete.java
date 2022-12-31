package sistemaventa2;

public class Juguete {
    private double precio;
    private String nombre;
    private int id;
    private boolean existencia;

    private static  int contadorJuguete;

    public Juguete(boolean existencia) {
        this.existencia = existencia;
    }

    public Juguete(double precio, String nombre, boolean existencia) {
        this.precio = precio;
        this.nombre = nombre;
        this.id = ++contadorJuguete;
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public static int getContadorJuguete() {
        return contadorJuguete;
    }

    public static void setContadorJuguete(int contadorJuguete) {
        Juguete.contadorJuguete = contadorJuguete;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", existencia=" + existencia +
                '}';
    }
}
