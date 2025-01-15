
public class Operador
{
    private String nombre;

    public Operador(String nombre){
        this.nombre = nombre;
    }

    // Método para atender solicitud
    public void atenderSolicitud(Cliente cliente,String solicitud){
        System.out.println("Atendiendo solicitud de " + cliente.getNombre() + ";" + solicitud);
    }
    // Método get para el nombre
    public String getNombre(){
        return nombre;
    }
}
