package herenciasestudiantes;


public class Maestro extends Persona {
    private int idMaestro;
    private String materia;

    private static  int contadorMaestro;
    public Maestro(String nombre,String materia) {
        super(nombre);
        this.idMaestro = ++contadorMaestro;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Maestro: "+ super.toString()+" Materia: " + materia+" .";
    }
}
