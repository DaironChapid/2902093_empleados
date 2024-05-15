package com.example;

public class Empleado {
    public String nombres;
    public String apellidos;
    public String documento;
    public int diasTrabajados;
    public double salarioBasico;
    public double auxilioTransporte;
    public double horasExtras;
    public double recargosNocturnos;
    public double bonificaciones;
    public double comisiones;
    public double prestamosEmbargos;

    public Empleado(String nombres, String apellidos, String documento, int diasTrabajados, double salarioBasico, double auxilioTransporte, double horasExtras, double recargosNocturnos, double bonificaciones, double comisiones, double prestamosEmbargos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.diasTrabajados = diasTrabajados;
        this.salarioBasico = salarioBasico;
        this.auxilioTransporte = auxilioTransporte;
        this.horasExtras = horasExtras;
        this.recargosNocturnos = recargosNocturnos;
        this.bonificaciones = bonificaciones;
        this.comisiones = comisiones;
        this.prestamosEmbargos = prestamosEmbargos;
    }

    // Getters
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public double getRecargosNocturnos() {
        return recargosNocturnos;
    }

    public double getBonificaciones() {
        return bonificaciones;
    }

    public double getComisiones() {
        return comisiones;
    }

    public double getPrestamosEmbargos() {
        return prestamosEmbargos;
    }
}
