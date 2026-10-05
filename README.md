# Práctica 1 - Introducción a Ciencias de la Computación

Práctica de laboratorio sobre el uso de la clase `String` en Java.

- **Alumno:** Diego Alejandro Peña Suárez
- **Profesor:** Salvador López Mendoza
- **Ayudante de laboratorio:** Rosa Victoria Villa Padilla
- **Fecha de entrega:** 9 de octubre de 2026

## Objetivo

Familiarizarse con la creación y uso de objetos de la clase `String`, usando algunos de sus métodos en la elaboración de programas.

## Contenido

### 1. Psicologo.java

Simula una sesión con un psicólogo. El programa:

- Da la bienvenida y pide el nombre del paciente.
- Saluda al paciente y le pregunta cuál es su problema.
- Responde "MMMM... ya veo" y "Y dígame...", y pregunta "¿Por qué dice ...?" repitiendo el problema entre comillas.
- Lee la respuesta del paciente y se despide.

Métodos usados: `nextLine()` (de `Scanner`) y `trim()`.

Al final del archivo se dejó comentada una versión extendida que armaba un expediente (edad, ocupación, sexo, fecha y hora de la cita). Esa versión no se ejecuta.

### 2. RFC.java

Genera el RFC a partir del nombre completo y la fecha de nacimiento.

- El nombre se escribe como: nombre, apellido paterno y apellido materno, separados por un espacio.
- La fecha se escribe en formato `dd/mm/aa`.
- El RFC se forma con las dos primeras letras del apellido paterno, la inicial del apellido materno, la inicial del nombre, y el año, mes y día de nacimiento.

Ejemplo: Andrea Lopez Lopez, nacida el 14/04/92, obtiene `LOLA920414`.

Métodos usados: `nextLine()` (de `Scanner`), `trim()`, `indexOf()`, `lastIndexOf()`, `substring()`, `length()` y `toUpperCase()`.

## Estructura del proyecto

```
/
├── DPeña/
│   └── practica01/
│       └── src/
│           └── icc/
│               ├── Psicologo.java
│               └── RFC.java
├── .gitignore
└── README.md
```

## Compilación y ejecución

Desde la carpeta `DPeña/practica01`:

```
javac -encoding UTF-8 -d out src/icc/Psicologo.java src/icc/RFC.java
java -cp out icc.Psicologo
java -cp out icc.RFC
```

## Ejemplos de ejecución

Psicologo:

```
Bienvenido, estimado, eres muy importante para nosotros. ¿Cuál es su nombre?
Alberto
Buenas tardes Alberto.
Dígame, ¿cuál es su problema en la vida?
Odio tener clase los viernes
MMMM... ya veo
Y dígame...
¿Por qué dice "Odio tener clase los viernes"?
Porque no puedo concentrarme y el fin de semana me parece muy corto.
¡Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.
```

RFC:

```
Hola. Bienvenido al creador de RFC! Por favor, dame tu nombre completo para poder generar tu RFC.
Andrea Lopez Lopez
¡Gracias! Ahora, por favor, ingresa tu fecha de nacimiento en el formato dd/mm/aa.
14/04/92
Perfecto, estimado. Su RFC ha sido generado correctamente. Por favor, compruébelo a continuación.
El RFC de Andrea Lopez Lopez es: LOLA920414.
LOLA920414 es la versión final de tu RFC, espero tenga un buen día.
```

## Notas

- El código está documentado con formato Javadoc y correctamente indentado.
- No se usan estructuras condicionales (`if`).
- Probado con Java 21.
