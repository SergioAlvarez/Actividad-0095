import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("Muy bien");
        respuestas.add("Dime m�s detalles");
        respuestas.add("No te entiendo");
        respuestas.add("�Qu� sistema operativo usas?");
        respuestas.add("�Est�s seguro?");
    }   

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroDevolver = aleatorio.nextInt(5);
        return respuestas.get(numeroDevolver);
    }
}
