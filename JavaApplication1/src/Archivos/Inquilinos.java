//CONTENIDO DE LA EVALUACIÓN
//El administrador de un edificio que posee 20 apartamentos desea llevar el control de
//pagos de alquiler por parte de sus inquilinos, para ello se busca registrar los datos del
//inquilino y de cada apartamento.
//Se desea almacenar el listado de movimientos de cada uno de los inquilinos, donde se
//indique si pagó o no pagó la mensualidad.
//Se requiere además realizar un informe de final de mes para conocer quienes están al
//día y quienes son deudores. Revise el listado de movimientos y genere una excepción
//cuando se detecte el no pago, el resultado deberá ser un archivo con deudores y otro con
//inquilinos que se encuentren a paz y salvo.
//La información de inquilinos y pagos deberá ser almacenada y consultada desde archivos
//de texto.
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Inquilinos {

    private void escribirAlArchivoDeTexto() {
        Alquiler alquiler = new Alquiler();

        try {

            FileWriter escritura = new FileWriter("apartamentos.txt",true); //Solo es quitarlo si desea no volver agregar, Ese true se utiliza para añadir texto 
            escritura.write(" \nEl apartamento1 Pago? " + alquiler.apartamento1);
            escritura.write(" \nEl apartamento2 Pago? " + alquiler.apartamento2);
            escritura.write(" \nEl apartamento3 Pago? " + alquiler.apartamento3);
            escritura.write(" \nEl apartamento4 Pago? " + alquiler.apartamento4);
            escritura.write(" \nEl apartamento5 Pago? " + alquiler.apartamento5);
            escritura.write(" \nEl apartamento6 Pago? " + alquiler.apartamento6);
            escritura.write(" \nEl apartamento7 Pago? " + alquiler.apartamento7);
            escritura.write(" \nEl apartamento8 Pago? " + alquiler.apartamento8);
            escritura.write(" \nEl apartamento9 Pago? " + alquiler.apartamento9);
            escritura.write(" \nEl apartamento10 Pago? " + alquiler.apartamento10);
            escritura.write(" \nEl apartamento11 Pago? " + alquiler.apartamento11);
            escritura.write(" \nEl apartamento12 Pago? " + alquiler.apartamento12);
            escritura.write(" \nEl apartamento13 Pago? " + alquiler.apartamento13);
            escritura.write(" \nEl apartamento14 Pago? " + alquiler.apartamento14);
            escritura.write(" \nEl apartamento15 Pago? " + alquiler.apartamento15);
            escritura.write(" \nEl apartamento16 Pago? " + alquiler.apartamento16);
            escritura.write(" \nEl apartamento17 Pago? " + alquiler.apartamento17);
            escritura.write(" \nEl apartamento18 Pago? " + alquiler.apartamento18);
            escritura.write(" \nEl apartamento10 Pago? " + alquiler.apartamento19);
            escritura.write(" \nEl apartamento20 Pago? " + alquiler.apartamento20);
            //escritura.write("\nHola desde java!!"); //podemos añadirlo desde acá quitanso el true dejamos de añadir
            escritura.close();
            //System.out.println("Texto añadido");

        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }

    private void leerArchivosDeTexto() {
        String contenido;
        try {
            FileReader lector = new FileReader("apartamentos.txt"); // indicamos el archivo a leer 
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
        Inquilinos apartamentos = new Inquilinos();
        //apartamentos.crearArchivoDeTexto();
        apartamentos.escribirAlArchivoDeTexto();
        apartamentos.leerArchivosDeTexto();
    }

}
