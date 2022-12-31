package sistemaventa2;

import sistemaventas.Juguete;

public class Departamento extends Juguete {
    private String nombreDepatamento;
    private String seccion;



    public Departamento(boolean existencia, String nombreDepatamento, String seccion) {
        super(existencia);
        this.nombreDepatamento = nombreDepatamento;
        this.seccion = seccion;

    }

    public String getNombreDepatamento() {
        return nombreDepatamento;
    }

    public void setNombreDepatamento(String nombreDepatamento) {
        this.nombreDepatamento = nombreDepatamento;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Departamento: "+ nombreDepatamento+ ", seccion: " + seccion;
    }
}
