package sistemaventas;

public class Juguete {
    private double precio;
    private String nombre;
    private int id;
    private boolean existencia;

    private static  int contadorJuguete;

    public Juguete(boolean existencia) {
        this.existencia = existencia;
    }
    public Juguete(){
        this.id=++contadorJuguete;
    }

    public Juguete(double precio, String nombre, boolean existencia) {
        this();
        this.precio = precio;
        this.nombre = nombre;
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
