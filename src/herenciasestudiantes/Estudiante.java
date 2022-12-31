package herenciasestudiantes;

import java.util.Date;
public class Estudiante extends Persona{
    private int idEstudiante;
    private boolean activo;
    private String carrera;


    private static  int contadorEstudiantes;

    public Estudiante(String nombre,boolean activo, String carrera) {
        super(nombre);
        this.idEstudiante = ++contadorEstudiantes;
        this.activo = activo;
        this.carrera = carrera;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public String toString() {
        return "Estudiante: "+super.toString()+".";
    }
}
