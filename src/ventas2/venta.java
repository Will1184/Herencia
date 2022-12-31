package ventas2;


import sistemaventa2.*;
public class venta {
    public static void main(String[] args) {
        Juguete obj1= new Juguete(true);
        Departamento dep1=new Departamento(true,"Jugueteria", "Seccion");
        Distribuidor dist1=new Distribuidor(true,"Coplasa","Mexico");
        System.out.println(agregarJuguete(dep1,dist1));
    }
    static String agregarJuguete(Departamento d, Distribuidor distribuidor){
        return  d + " "+ distribuidor;
    }
}
