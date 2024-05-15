package com.example;

public class Main {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        Empleado empleado1 = new Empleado("Juan", "Pérez", "123456789", 30, 2000000, 117172, 0, 0, 0, 0, 0);
        Empleado empleado2 = new Empleado("Ana", "Gómez", "987654321", 30, 2500000, 0, 0, 0, 0, 0, 0);

        nomina.agregarEmpleado(empleado1);
        nomina.agregarEmpleado(empleado2);

        nomina.calcularNomina();
    }
}