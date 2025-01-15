// Clase principal para provar el codigo
public class Main
{
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        Servicio telefonia = new Servicio("Telefonía Celular");
        empresa.addServicio(telefonia);

        Operador maria = new Operador("Maria");
        empresa.addOperador(maria);

        Cliente honorato = new Cliente("Honorato Orfebre");

        empresa.getUnidadAtencion().buscarOperador("Maria").atenderSolicitud(honorato, " Reclamo");
    }
}
