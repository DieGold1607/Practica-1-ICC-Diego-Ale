package icc;

import java.util.Scanner;

/**
 * Programa para generar el RFC a partir del nombre completo
 * y la fecha de nacimiento del usuario.
 *
 * La práctica consiste en:
 * 1. Pedir el nombre completo en una línea.
 * 2. Pedir la fecha de nacimiento en formato dd/mm/aa.
 * 3. Extraer las letras necesarias del nombre y apellidos.
 * 4. Extraer el año, mes y día de la fecha.
 * 5. Construir el RFC y mostrarlo al usuario.
 *
 * @author Diego Alejandro Peña Suárez
 * @version 1.0
 */
public class RFC {

    /**
     * Método principal del programa.
     * Aquí se realiza la captura de datos y la construcción del RFC.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Doy el mensaje de bienvenida al usuario y le pido su nombre, además de su fecha de nacimiento.

        System.out.println("Hola. Bienvenido al creador de RFC! Por favor, dame tu nombre completo y tu fecha de nacimiento, para poder generar tu RFC.");
        String nombreCompleto = in.nextLine().trim();

        System.out.println("¡Gracias! Ahora, por favor, ingresa tu fecha de nacimiento en el formato dd/mm/aa.");
        String fechaNacimiento = in.nextLine().trim();


        // Aquí estoy separando el nombre completo en partes para poder extraer las letras necesarias para el RFC.

            String nombre = nombreCompleto.substring(0, nombreCompleto.indexOf(" "));

            String apellidoPaterno = nombreCompleto.substring(nombreCompleto.indexOf(" ") + 1, nombreCompleto.lastIndexOf(" "));

            String apellidoMaterno = nombreCompleto.substring(nombreCompleto.lastIndexOf(" ") + 1);

        // Aquí estoy separando la fecha de nacimiento en día, mes y año para poder construir la parte numérica del RFC.

            String dia = fechaNacimiento.substring(0, 2);

            String mes = fechaNacimiento.substring(3, 5);

            String ano = fechaNacimiento.substring(fechaNacimiento.length() - 2);

            String rfc = (apellidoPaterno.substring(0, 2) + apellidoMaterno.substring(0, 1) + nombre.substring(0, 1) + ano + mes + dia).toUpperCase();


        // Aquí declaro el RFC final y lo muestro al usuario, además de dar un mensaje de cierre del programa.  


            System.out.println("Perfecto, estimado. Su RFC ha sido generado correctamente. Por favor, compruébelo a continuación.");
        
            System.out.println("El RFC de " + nombreCompleto + " es: " + rfc + ".");

        // Aquí convierto el RFC final a mayúculas para dar el RFC en el formato correcto y lo muestro al usuario.

             System.out.println(rfc.toUpperCase() + " es la versión final de tu RFC, espero tenga un buen día.");

             
        in.close();

        
    }
}
