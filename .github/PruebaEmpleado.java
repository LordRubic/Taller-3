/*
*Taller N.2 - Programacion 1
*Grupo: 1 Fecha: 9/21/2026
*Integrante1: Carlos Barria - 8-1025-1008
*Integrante2: Angel Diaz  - 8-1047-925
*/

public class PruebaEmpleado {
    public static void main(String[] args) {
        
        //Ejercicio 2
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Angel Diaz";
        empleado1.cedula = "8-1047-925";
        empleado1.cargo = "Gerente de Ventas";
        empleado1.salarioBase = 900.0;
        empleado1.añosServicio = 3;
        empleado1.esSupervisor = true;

        Empleado empleado2 = new Empleado();
        empleado2.nombre = "Carlos Barria";
        empleado2.cedula = "8-1025-1008";
        empleado2.cargo = "Asistente Operativo";
        empleado2.salarioBase = 750.0;
        empleado2.añosServicio = 5;
        empleado2.esSupervisor = false;

        //Ejercicio 3 
        
        // Cálculos Empleado 1
        double bonoAntiguedad1 = empleado1.salarioBase * 0.05 * empleado1.añosServicio;
        double bonoSupervisor1 = 0;
        if (empleado1.esSupervisor) {
            bonoSupervisor1 = 150.0; // Bono extra si es supervisor (Ejercicio 5)
        }
        double totalEmpleado1 = empleado1.salarioBase + bonoAntiguedad1 + bonoSupervisor1;

        // Cálculos Empleado 2
        double bonoAntiguedad2 = empleado2.salarioBase * 0.05 * empleado2.añosServicio;
        double bonoSupervisor2 = 0;
        if (empleado2.esSupervisor) {
            bonoSupervisor2 = 150.0; 
        }
        double totalEmpleado2 = empleado2.salarioBase + bonoAntiguedad2 + bonoSupervisor2;

        //Datos Ordenados
        System.out.println("=== DATOS DEL EMPLEADO 1 ===");
        System.out.println("Nombre: " + empleado1.nombre + " | Cédula: " + empleado1.cedula);
        System.out.println("Cargo: " + empleado1.cargo + " | Años de servicio: " + empleado1.añosServicio);
        System.out.println("Es Supervisor: " + (empleado1.esSupervisor ? "Sí" : "No"));
        System.out.println("Salario Base: $" + String.format("%.2f", empleado1.salarioBase));
        System.out.println("Bono Antigüedad: $" + String.format("%.2f", bonoAntiguedad1));
        System.out.println("Bono Supervisor: $" + String.format("%.2f", bonoSupervisor1));
        System.out.println("SALARIO TOTAL: $" + String.format("%.2f", totalEmpleado1));
        System.out.println();

        System.out.println("=== DATOS DEL EMPLEADO 2 ===");
        System.out.println("Nombre: " + empleado2.nombre + " | Cédula: " + empleado2.cedula);
        System.out.println("Cargo: " + empleado2.cargo + " | Años de servicio: " + empleado2.añosServicio);
        System.out.println("Es Supervisor: " + (empleado2.esSupervisor ? "Sí" : "No"));
        System.out.println("Salario Base: $" + String.format("%.2f", empleado2.salarioBase));
        System.out.println("Bono Antigüedad: $" + String.format("%.2f", bonoAntiguedad2));
        System.out.println("Bono Supervisor: $" + String.format("%.2f", bonoSupervisor2));
        System.out.println("SALARIO TOTAL: $" + String.format("%.2f", totalEmpleado2));
        System.out.println();

        //Ejercicio 4
        System.out.println("RESULTADO DE COMPARACIÓN");
        if (totalEmpleado1 > totalEmpleado2) {
            System.out.println("El empleado " + empleado1.nombre + " tiene el salario total más alto.");
        } else if (totalEmpleado2 > totalEmpleado1) {
            System.out.println("El empleado " + empleado2.nombre + " tiene el salario total más alto.");
        } else {
            System.out.println("Ambos empleados tienen exactamente el mismo salario total.");
        }
    }
}