import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    ArrayList<String> respuestas;
    HashMap<String, String> respuestasUser;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestasUser = new HashMap<>(); 
        

        respuestas.add("Muy bien");
        respuestas.add("Dime más detalles");
        respuestas.add("No te entiendo");
        respuestas.add("¿Qué sistema operativo usas?");
        respuestas.add("¿Estás seguro?");
        respuestas.add("Estamos trabajando en ello");

        respuestasUser.put("teclado", "Compruebe que el teclado está conectado");
        respuestasUser.put("internet", "Compruebe la conexión y vuelva a intentarlo");
        respuestasUser.put("windows", "Nuesto software no funciona con Windows.");
        respuestasUser.put("linux", "Nuesto software no funciona con Linux");
    }   

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        String respuesta = null;
        Iterator<String> iterator = userInput.iterator();
        boolean searching = true;
        
        while(iterator.hasNext() && searching){
            respuesta = respuestasUser.get(iterator.next());
            
            if (respuesta != null){
                searching = false;
            }
        }
        
        for(String element : userInput){
            
            if(respuesta ==null){
                respuesta = respuestasUser.get(element);
            }
        }
        
        if (respuesta == null){
            respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }
        
        return respuesta;
    }
}


