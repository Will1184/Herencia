package venta;

import sistemaventas.Departamento;
import sistemaventas.Distribuidor;
import sistemaventas.Juguete;

public class MainJuguete {
    public static void main(String[] args) {
        Juguete j1= new Juguete(2000,"Superman",true);
        Juguete j2= new Juguete(2500,"Batman",true);
        Departamento dep1=new Departamento(j1.isExistencia(), "Juguetes electronicos ","Juvenil");
        Distribuidor dist1=new Distribuidor(j1.isExistencia(), "San nicolas.inc","Costa Rica");
        Departamento dep2=new Departamento(j2.isExistencia(), "Juguetes electronicos ","Juvenil");
        Distribuidor dist2=new Distribuidor(j2.isExistencia(), "San nicolas.inc","Costa Rica");
       Double suma= SumaVenta(j1.isExistencia(),j2.isExistencia(),j1.getPrecio(),j2.getPrecio());
       imprimir(dist1.toString(),dep1.toString(),dist2.toString(),dep2.toString(),suma,j1.getPrecio(),j2.getPrecio(),j1.getNombre(),j2.getNombre(),j1,j2);

    }
    public static double SumaVenta(boolean j1existencia,boolean j2existencia,double j1, double j2){
        double suma = 0;
        suma= j1+j2;
        return suma;
    }
    public static void imprimir(String dist1, String dep1, String dist2, String dep2, double suma, double precj1, double precj2, String nomj1, String nomj2, Juguete j1, Juguete j2){
        System.out.println(j1+" "+dist1+"\n----------------------------\n"+dep1+"\n----------------------------\n"+dist2+"\n----------------------------\n"+ j2+""+dep2+"\n----------------------------\n"+"Producto 1: "+nomj1+" $ "+precj1+" "+"\nProducto 2: "+nomj2+" $ "+precj2+" "+"\nEl total de la venta es: $"+suma);
    }
}

