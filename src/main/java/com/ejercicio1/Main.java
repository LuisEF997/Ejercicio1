package com.ejercicio1;

import java.util.Scanner;

/**
 * Clase principal para demostrar el cálculo del área y diámetro de un círculo
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculadora de Círculo ===");
        System.out.println("Este programa calcula el área y diámetro de un círculo");
        
        try {
            System.out.print("Ingrese el radio del círculo: ");
            double radius = scanner.nextDouble();
            
            Circle circle = new Circle(radius);
            
            double area = circle.calculateArea();
            double diameter = circle.calculateDiameter();
            
            System.out.println("\n=== Resultados ===");
            System.out.printf("Radio: %.2f\n", circle.getRadius());
            System.out.printf("Diámetro: %.2f\n", diameter);
            System.out.printf("Área: %.2f\n", area);
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Por favor ingrese un número válido");
        } finally {
            scanner.close();
        }
    }
}