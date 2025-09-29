package com.ejercicio1;

/**
 * Clase de prueba para demostrar el funcionamiento de la clase Circle
 */
public class CircleTest {
    public static void main(String[] args) {
        System.out.println("=== Pruebas de la clase Circle ===\n");
        
        // Prueba 1: Círculo con radio 5
        System.out.println("Prueba 1: Radio = 5");
        Circle circle1 = new Circle(5.0);
        System.out.printf("Radio: %.2f\n", circle1.getRadius());
        System.out.printf("Diámetro: %.2f\n", circle1.calculateDiameter());
        System.out.printf("Área: %.2f\n\n", circle1.calculateArea());
        
        // Prueba 2: Círculo con radio 3.5
        System.out.println("Prueba 2: Radio = 3.5");
        Circle circle2 = new Circle(3.5);
        System.out.printf("Radio: %.2f\n", circle2.getRadius());
        System.out.printf("Diámetro: %.2f\n", circle2.calculateDiameter());
        System.out.printf("Área: %.2f\n\n", circle2.calculateArea());
        
        // Prueba 3: Círculo con radio 1
        System.out.println("Prueba 3: Radio = 1");
        Circle circle3 = new Circle(1.0);
        System.out.printf("Radio: %.2f\n", circle3.getRadius());
        System.out.printf("Diámetro: %.2f\n", circle3.calculateDiameter());
        System.out.printf("Área: %.2f\n\n", circle3.calculateArea());
        
        // Prueba 4: Modificar radio existente
        System.out.println("Prueba 4: Modificando radio de 1 a 10");
        circle3.setRadius(10.0);
        System.out.printf("Nuevo radio: %.2f\n", circle3.getRadius());
        System.out.printf("Nuevo diámetro: %.2f\n", circle3.calculateDiameter());
        System.out.printf("Nueva área: %.2f\n\n", circle3.calculateArea());
        
        // Prueba 5: Manejo de errores
        System.out.println("Prueba 5: Intentando crear círculo con radio negativo");
        try {
            Circle invalidCircle = new Circle(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado correctamente: " + e.getMessage());
        }
        
        System.out.println("\n=== Todas las pruebas completadas ===");
    }
}