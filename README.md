# Ejercicio1 - Calculadora de Círculo

Este proyecto de Java es para calcular el área y diámetro de un círculo dado su radio.

## Características

- Calcula el área de un círculo usando la fórmula: π * r²
- Calcula el diámetro de un círculo usando la fórmula: 2 * r
- Incluye validación de entrada (no permite radios negativos)
- Manejo de errores para entradas inválidas
- Interfaz de usuario interactiva por consola

## Estructura del Proyecto

```
src/
└── main/
    └── java/
        └── com/
            └── ejercicio1/
                ├── Circle.java      # Clase principal para cálculos del círculo
                ├── Main.java        # Clase principal con interfaz de usuario
                └── CircleTest.java  # Clase de pruebas para demostrar funcionalidad
```

## Cómo usar

### Compilar el proyecto
```bash
javac -d . src/main/java/com/ejercicio1/*.java
```

### Ejecutar el programa principal (interactivo)
```bash
java com.ejercicio1.Main
```

### Ejecutar las pruebas
```bash
java com.ejercicio1.CircleTest
```

## Ejemplo de uso

```
=== Calculadora de Círculo ===
Este programa calcula el área y diámetro de un círculo
Ingrese el radio del círculo: 5

=== Resultados ===
Radio: 5.00
Diámetro: 10.00
Área: 78.54
```
