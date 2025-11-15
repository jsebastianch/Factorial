/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uide.programacion;

/**
 * Clase que contiene métodos matemáticos,
 * incluyendo el cálculo del factorial de un número entero.
 * 
 * El método factorial utiliza el tipo long, lo cual permite
 * calcular correctamente factoriales hasta 20!.
 * 
 * @author Sebastian Chavez
 * 
 * Fecha de compilación: 15/11/2025
 */
public class Calculadora {

    /**
     * Calcula el factorial de un número entero.
     * 
     * El factorial se define como:
     * n! = n × (n - 1) × (n - 2) × ... × 1
     * 
     * Casos especiales:
     * 0! = 1  
     * 1! = 1
     *
     * @param numero número entero del cual se desea obtener el factorial.
     *               Debe ser mayor o igual que 0.
     * @return el factorial de numero como long.
     */
    public long factorial(int numero) {
        
        // Se utiliza 'long' porque el tipo 'int' se queda corto:
        // int solo soporta hasta 2,147,483,647, pero 13! = 6,227,020,800,
        // lo que provoca overflow. En cambio, long permite valores
        // mucho más grandes (hasta 9,223,372,036,854,775,807),
        // suficientes para calcular factoriales hasta aproximadamente 20!.
        
        // Caso base: 0! y 1! valen 1
        if (numero == 0 || numero == 1) {
            return 1;
        }

        // Variable donde se acumula el resultado
        long respuesta = numero;

        // Multiplicar el número por todos los enteros menores que él
        for (int i = numero - 1; i >= 1; i--) {
            respuesta = respuesta * i;
        }

        return respuesta;
    }
}