/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uide.programacion;

/**
 * Clase principal que demuestra el cálculo del factorial
 * de los números del 1 al 13 utilizando la clase Calculadora.
 * 
 * Muestra los resultados en consola.
 * 
 * @author Sebastian Chavez
 * 
 * Fecha de compilación: 15/11/2025
 */
public class Factorial {

    /**
     * Método principal (punto de entrada del programa).
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        System.out.println("Factorial de un numero del 1 al 13:");

        // Crear una instancia de la clase Calculadora
        Calculadora calculadora = new Calculadora();

        // Calcular y mostrar los factoriales del 1 al 13
        for (int i = 1; i < 14; i++) {
            long factorial = calculadora.factorial(i);
            System.out.println("El factorial de " + i + " es " + factorial);
        }
    }
}
