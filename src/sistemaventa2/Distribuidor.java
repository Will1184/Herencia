package sistemaventa2;

import sistemaventas.Juguete;

public class Distribuidor extends Juguete {
    private String nombreEmpresa;
    private String pais;

    public Distribuidor(boolean existencia, String nombreEmpresa, String pais) {
        super(existencia);
        this.nombreEmpresa = nombreEmpresa;
        this.pais = pais;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Distribuidor:" +" " + nombreEmpresa  + ", pais: " + pais;
    }
}
