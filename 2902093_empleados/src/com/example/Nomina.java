package com.example;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados;

    public Nomina() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void calcularNomina() {
        for (Empleado empleado : empleados) {
            double totalDevengos = calcularTotalDevengos(empleado);
            double totalDescuentos = calcularTotalDescuentos(empleado);
            double salarioNeto = totalDevengos - totalDescuentos;


            System.out.println("Empleado: " + empleado.getNombres() + " " + empleado.getApellidos());
            System.out.println("Documento: " + empleado.getDocumento());
            System.out.println("Total Devengos: " + totalDevengos);
            System.out.println("Total Descuentos: " + totalDescuentos);
            System.out.println("Salario Neto: " + salarioNeto);
            System.out.println("Subsidio Transporte: " + empleado.getAuxilioTransporte());
            System.out.println("---------------------------");
        }
    }

    private double calcularTotalDevengos(Empleado empleado) {
        return empleado.getSalarioBasico() + empleado.getAuxilioTransporte() + empleado.getHorasExtras() + empleado.getRecargosNocturnos() + empleado.getBonificaciones() + empleado.getComisiones();
    }

    private double calcularTotalDescuentos(Empleado empleado) {
        double salarioBaseCotizacion = empleado.getSalarioBasico();
        double aporteSalud = salarioBaseCotizacion * 0.04;
        double aportePension = salarioBaseCotizacion * 0.04;
        double aporteRiesgos = salarioBaseCotizacion * 0.00522;
        double retencionFuente = 0;

        if (salarioBaseCotizacion > 2400000) {
            retencionFuente = (salarioBaseCotizacion - 2400000) * 0.1;
        }

        return aporteSalud + aportePension + aporteRiesgos + retencionFuente + empleado.getPrestamosEmbargos();
    }


}

