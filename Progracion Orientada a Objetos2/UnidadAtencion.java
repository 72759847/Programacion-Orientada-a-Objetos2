import java.util.ArrayList;
import java.util.List;
public class UnidadAtencion
{
    private List<Operador> operadores = new ArrayList<>();

    public void addOperador(Operador operador){
        operadores.add(operador);
    }

    // Método para obtener la lista de  operadores
    public List<Operador> getOperadores(){
        return operadores;
    }

    // Método para encontrar un operador por nombre
    public Operador buscarOperador(String nombre){
        for(Operador operador : operadores){
            if(operador.getNombre().equals(nombre)){
                return operador;
            }
        }
        return null; // No encontrado
    }

}
