package herenciasestudiantes;

public class TestHerencia {
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("Carlos",true,"Ingenieria en sistemas");
        e1.setEdad(18);
        e1.setGenero('M');
        Curso c1=new Curso("Matematicas","1:00 pm");
        Maestro m1=new Maestro("Martha","Matematica 1");
        m1.setEdad(40);
        m1.setGenero('F');
        System.out.println(e1+" "+agregarCurso(c1)+" "+agregarMaestro(m1));
    }
    static Curso agregarCurso(Curso o){
        return o;
    }

    static Maestro agregarMaestro(Maestro m1){
        return m1;
    }
}
