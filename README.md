# Práctica 1 - Introducción a Ciencias de la Computación

Práctica de laboratorio sobre manipulación de cadenas (String) en Java.

## Objetivo

Familiarizarse con la creación y uso de objetos de la clase `String` utilizando algunos de sus métodos principales en la elaboración de programas que interactúen con el usuario.

## Contenido

Este repositorio contiene dos programas principales:

### 1. Psicologo.java
Simula una sesión inicial de consulta psicológica. El programa:
- Solicita información del paciente (nombre, edad, ocupación, sexo, motivo de consulta)
- Registra fecha y hora de la cita
- Genera un expediente con los datos capturados

**Métodos String utilizados:**
- `nextLine()` - lectura de entrada
- `trim()` - eliminación de espacios
- `split()` - separación de datos
- `substring()` - extracción de partes

### 2. RFC.java
Genera el RFC (Registro Federal de Contribuyentes) a partir del nombre completo y fecha de nacimiento del usuario.

**Algoritmo:**
- Extrae 2 letras del apellido paterno
- Extrae 1 letra del apellido materno
- Extrae 1 letra del nombre
- Añade año, mes y día de nacimiento (formato: aa/mm/dd)

**Métodos String utilizados:**
- `indexOf()` - búsqueda de caracteres
- `substring()` - extracción de porciones
- `split()` - separación de cadenas
- `toUpperCase()` - conversión a mayúsculas

## Estructura del Proyecto

```
practica01/
├── src/
│   └── icc/
│       ├── Psicologo.java
│       └── RFC.java
├── .gitignore
└── README.md
```

## Compilación y Ejecución

### Compilar
```bash
javac -d out src/icc/Psicologo.java src/icc/RFC.java
```

### Ejecutar Psicologo
```bash
java -cp out icc.Psicologo
```

### Ejecutar RFC
```bash
java -cp out icc.RFC
```

## Requisitos

- Java 17 o superior
- Terminal/Consola

## Autor

**Diego Alejandro Peña Suárez**

## Fecha de Entrega

9 de octubre de 2026

## Notas Importantes

- Todo el código está documentado con formato Javadoc
- El código respeta los estándares de indentación
- Se utilizan métodos de la clase String sin estructuras condicionales (`if`)
- Los archivos compilados (`.class`) están en `.gitignore`
