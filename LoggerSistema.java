import java.io.FileWriter;
import java.io.IOException;

public class LoggerSistema {

    public static void registrar(String mensaje){

        try(FileWriter fw =
                    new FileWriter("logs.txt", true)){

            fw.write(mensaje + "\n");

        } catch(IOException e){

            System.out.println("Error en log");
        }
    }
}
