package herenciasestudiantes;

public class Curso {
    private String nombreCurso;
    private String horario;


    public Curso(String nombreCurso, String horario) {
        this.nombreCurso = nombreCurso;
        this.horario = horario;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Curso: " + nombreCurso  + ", Horario: " + horario+".";
    }
}
