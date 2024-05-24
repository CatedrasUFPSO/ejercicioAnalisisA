package InformeFinal;

import Archivos.Alquiler;
import Archivos.Inquilinos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InformeFinal {
    private void Informe(){
    Alquiler informe = new Alquiler();
    try{
        FileWriter escritura = new FileWriter("informe.txt");
    escritura.write("El apartamento " + informe.getApartamento1());
    escritura.write("El apartamento " + informe.getApartamento4());
    escritura.write("El apartamento " + informe.getApartamento6());
    escritura.write("El apartamento " + informe.getApartamento8());
    escritura.write("El apartamento " + informe.getApartamento10());
    escritura.write("El apartamento " + informe.getApartamento11());
    escritura.write("El apartamento " + informe.getApartamento13());
    escritura.write("El apartamento " + informe.getApartamento15());
    escritura.write("El apartamento " + informe.getApartamento16());
    escritura.write("El apartamento " + informe.getApartamento18());
    escritura.write("El apartamento " + informe.getApartamento20());
    
    }catch(IOException excepcion){
        System.out.println("No han pagado " + informe.getApartamento2());
        System.out.println("No han pagado " + informe.getApartamento3());
        System.out.println("No han pagado " + informe.getApartamento5());
        System.out.println("No han pagado " + informe.getApartamento7());
        System.out.println("No han pagado " + informe.getApartamento9());
        System.out.println("No han pagado " + informe.getApartamento12());
        System.out.println("No han pagado " + informe.getApartamento14());
        System.out.println("No han pagado " + informe.getApartamento17());
        System.out.println("No han pagado " + informe.getApartamento19());
    
    }
    
  
    }
     
    private void leerInformeFinal() {
        String contenido;
        try {
            FileReader lector = new FileReader("informe.txt"); // indicamos el archivo a leer 
            BufferedReader lectura = new BufferedReader(lector); // Le pasamos el archivo a leer

            contenido = lectura.readLine();

            while (contenido != null) {

                System.out.println(contenido );
                contenido = lectura.readLine();
            }
            System.out.println(contenido);
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }

    }
    public static void main(String[] args) {
        InformeFinal Final = new InformeFinal();
        Final.Informe();
        Final.leerInformeFinal();
}
}
