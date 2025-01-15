import java.util.ArrayList;
import java.util.List;

public class Empresa
{
    private List<Servicio> servicios = new ArrayList<>();
    private UnidadAtencion unidadAtencion = new UnidadAtencion();
    
    public void addServicio(Servicio servicio){
    servicios.add(servicio);
    }
    
    // Método para listar todos los servicios
    public List<Servicio> getServicios(){
    return servicios;
    }
    
    // Método para asignar un operador a la unidad de atención
    public void addOperador(Operador operador){
    unidadAtencion.addOperador(operador);
    }
    
    // Método para obtener la unidad de atención
    public UnidadAtencion getUnidadAtencion(){
    return unidadAtencion;
    }
}
