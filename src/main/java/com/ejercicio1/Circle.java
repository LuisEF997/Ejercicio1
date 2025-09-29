package com.ejercicio1;

/**
 * Clase para calcular el área y diámetro de un círculo
 */
public class Circle {
    private double radius;
    
    /**
     * Constructor que inicializa el radio del círculo
     * @param radius Radio del círculo
     */
    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        this.radius = radius;
    }
    
    /**
     * Calcula el área del círculo
     * @return Área del círculo (π * r²)
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Calcula el diámetro del círculo
     * @return Diámetro del círculo (2 * r)
     */
    public double calculateDiameter() {
        return 2 * radius;
    }
    
    /**
     * Obtiene el radio del círculo
     * @return Radio del círculo
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Establece un nuevo radio para el círculo
     * @param radius Nuevo radio del círculo
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        this.radius = radius;
    }
}