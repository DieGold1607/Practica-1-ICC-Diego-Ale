package icc;

import java.util.Scanner;

/**
 * Clase principal para simular una sesión con un psicólogo.
 * El programa pide el nombre del paciente, el problema que lo aqueja
 * y el motivo por el que se siente así, y cierra con un mensaje
 * para continuar en la siguiente sesión.
 *
 * Al final del archivo se conserva, comentada, una versión extendida
 * del programa (expediente con edad, ocupación, sexo, fecha y hora de la cita).
 *
 * @author Peña Suárez Diego Alejandro
 * @version 1.2
 */
public class Psicologo {

    /**
     * Método principal que ejecuta la interacción con el usuario.
     * Se solicita el nombre del paciente y la descripción de su problema,
     * se responde con la pregunta del psicólogo y se cierra la sesión.
     *
     * @param args argumentos enviados desde la línea de comandos
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, motivoConsulta, razon;

        // Bienvenida general al paciente y solicitud de su nombre.
        System.out.println("Bienvenido, estimado, eres muy importante para nosotros. ¿Cuál es su nombre?");
        nombre = in.nextLine().trim();

        // Se saluda al paciente y se le pregunta cuál es su problema.
        System.out.println("Buenas tardes " + nombre + ".");
        System.out.println("Dígame, ¿cuál es su problema en la vida?");
        motivoConsulta = in.nextLine().trim();

        // Respuesta del psicólogo, citando entre comillas lo que dijo el paciente.
        System.out.println("MMMM... ya veo");
        System.out.println("Y dígame...");
        System.out.println("¿Por qué dice \"" + motivoConsulta + "\"?");
        razon = in.nextLine().trim();

        // Cierre de la sesión.
        System.out.println("¡Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.");

        in.close();
    }

    /*
     * -----------------------------------------------------------------
     * VERSIÓN EXTENDIDA (idea original, desactivada)
     *
     * Esta es mi primera versión del programa: arma un expediente con
     * edad, ocupación, sexo y la fecha y hora de la cita. No se ejecuta
     * porque la práctica pide un diálogo más corto. Para volver a usarla,
     * se reemplaza el cuerpo de main por el código de abajo.
     * (En esta copia cambié el nombre de la variable "razón" a "razon", puesto que las variables deben estar en minúscula y no contener ningún acento.)
     * -----------------------------------------------------------------

        Scanner in = new Scanner(System.in);
        String nombreCompletodelPaciente;
        String nombre, edad, ocupacion, sexo, motivoConsulta, razon, fechaConsulta, horaConsulta;

        // Bienvenida general al paciente.
        System.out.println("Bienvenido, estimado, eres muy importante para nosotros, deseamos brindarte el mejor servicio posible, por favor, ¿me permitirías hacerte unas preguntas?");

        // Se solicita el nombre completo del paciente para crear el expediente.
        System.out.println("Por favor, ingresa tu nombre completo para abrir tu expediente.");
        nombreCompletodelPaciente = in.nextLine().trim();
        nombre = nombreCompletodelPaciente;

        // Se solicita la edad del paciente y se limpia la entrada.
        System.out.println("¡Gracias! Eres increible, tienes un nombre muy bonito. Recuerda, eres valioso y mereces ser feliz. Ahora, por favor, ingresa tu edad.");
        edad = in.nextLine().trim();

        // Se solicita la ocupación y el sexo del paciente.
        System.out.println("¡Gracias! Ahora, por favor, necesito saber a qué te dedicas y tu sexo para poder personalizar tu consulta exactamente a tus necesidades particulares.");
        System.out.println("¿A qué te dedicas?");
        ocupacion = in.nextLine().trim();

        System.out.println("¿Cuál es tu sexo?");
        sexo = in.nextLine().trim();

        // Se solicita el motivo de consulta del paciente.
        System.out.println("¡Gracias, ahora me gustaría saber tu motivo de consulta y todo lo que te preocupa el día de hoy, para poder ayudarte de la mejor manera posible, recuerda que todo lo que me digas será confidencial y no será compartido con nadie más.");
        System.out.println("Escribe tu motivo de consulta:");
        motivoConsulta = in.nextLine().trim();

        // Se muestra una respuesta del psicólogo para continuar con la consulta.
        System.out.println("Mmm... ya veo...");
        System.out.println("¿Y por que motivo te sientes así..." + motivoConsulta + "?");

        razon = in.nextLine().trim();

        System.out.println("Entiendo perfectamente por qué te sientes así... " + razon + "...No te preocupes, estimado, lo hablaremos en la próxima consulta.");

        // Se solicita la fecha y la hora de la cita, separadas por un espacio.
        System.out.println("¡Gracias! Ahora, por favor, ingresa la fecha y hora de tu consulta para poder agendarla correctamente.");
        System.out.println("Escribe la fecha y la hora separadas por un espacio (ejemplo: 12/10/2026 18:30)");
        String fechaHora = in.nextLine().trim();
        String[] partes = fechaHora.split("\\s+");
        fechaConsulta = partes[0];
        horaConsulta = partes[1];

        // Se finaliza con el resumen del expediente del paciente.
        System.out.println("¡Me siento honrado de poder ser tu psicólogo y poder ayudarte a superar las cosas complicadas que pueden surgir en tu día a día! Recuerda que eres valioso y mereces ser feliz, y que siempre estaré aquí para escucharte y ayudarte en lo que necesites.");
        System.out.println("Gracias por tu tiempo. Tu expediente es el siguiente: \nNombre: " + nombre + "\nEdad: " + edad + "\nOcupación: " + ocupacion + "\nSexo: " + sexo + "\nMotivo de consulta y razón: " + motivoConsulta + " - " + razon + "\nFecha de consulta: " + fechaConsulta + "\nHora de consulta: " + horaConsulta);
        System.out.println("Tu expediente ha sido creado con éxito, y tu cita ha sido agendada para el día " + fechaConsulta + " a las " + horaConsulta + ". ¡Nos vemos pronto! :)");

        in.close();
     */
}
