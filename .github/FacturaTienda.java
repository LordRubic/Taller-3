/*
*Taller N.2 - Programacion 1
*Grupo: 1 Fecha: 9/21/2026
*Integrante1: Carlos Barria - 8-1025-1008
*Integrante2: Angel Diaz  - 8-1047-925
*/

public class FacturaTienda {
    public static void main(String[] args) {
        
        // Ejercicio 1 
        String nombreProducto = "Monitor"; 
        int cantidad = 2;
        double precioUnitario = 150.00;
        boolean aplicaDescuento = true;
        final double TASA_ITBMS = 0.07;

        // Ejercicio 2
        double subtotal = cantidad * precioUnitario;
        double montoITBMS = subtotal * TASA_ITBMS;
        double total = subtotal + montoITBMS;

        System.out.println("RESULTADOS EJERCICIO 2");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Monto ITBMS (7%): $" + montoITBMS);
        System.out.println("Total a pagar: $" + total);

        //Ejercicio 3

        double descuento;
        
        /* CÁLCULO A MANO ESPERADO:
         * subtotal = 2 * 150.00 = 300.00
         * Expresión: total = 300.00 + (300.00 * 0.07) - (300.00 * 0.10)
         * Resultado esperado: 291.00
         */
        
        double totalFinal = subtotal + (subtotal * TASA_ITBMS) - (subtotal * 0.10);
        
        System.out.println("\n RESULTADOS EJERCICIO 3");
        System.out.println("Total a pagar (con descuento): $" + totalFinal);

        //Ejercicio 4
        int a = 7, b = 4, c = 2, d = 5;
        boolean resultadoBooleano = (a % b == 3) && (c * d > 8 || a - b <= c);
        
        System.out.println("\n RESULTADOS EJERCICIO 4");
        System.out.println("Resultado de la expresión booleana compuesta: " + resultadoBooleano);

        //Ejercicio 5: Reto Final

        int retoFinal = a + b * c % d; // Utilizamos +, * y %
        
        /* EXPLICACIÓN PASO A PASO:
         * Expresión: a + b * c % d
         * Valores:   7 + 4 * 2 % 5
         * 
         * 1 Según la jerarquía, la Multiplicacion (*) y el residuo(%) tienen la misma prioridad 
         *    y se evalúan de izquierda a derecha antes que la suma (+).
         * 2 Multiplicación: b * c -> 4 * 2 = 8
         *    La expresión queda: 7 + 8 % 5
         * 3 Residuo: 8 % 5 = 3 
         *    La expresión queda: 7 + 3
         * 4 Suma: 7 + 3 = 10
         * 
         * El resultado será 10.
         */

        System.out.println("\n RESULTADOS EJERCICIO 5");
        System.out.println("Resultado del reto final: " + retoFinal);
    }
}