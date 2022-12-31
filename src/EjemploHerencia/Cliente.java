package EjemploHerencia;
 import java.util.Date;
public class Cliente extends Persona{
    private int idCliente;
    private  Date fechaRegistro;
    private boolean vip;
    private static  int contadorClientes;

    public Cliente(Date fechaRegistro,boolean vip){
        this.idCliente=++contadorClientes;
        this.fechaRegistro=fechaRegistro;
        this.vip=vip;
    }

    public int getIdCliente() {return idCliente;}


    public Date getFechaRegistro() {return fechaRegistro;}


    public boolean isVip() {return vip;}

    public void setVip(boolean vip) {this.vip = vip;}

    @Override
    public String toString() {
        //Primero mandamos a llamar el metodo toString de la clase persona para que podamos
        // observar los valores de la clase padre y despues imprimimos los valores de la clase hija
        return super.toString()+ "Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                '}';
    }
}
