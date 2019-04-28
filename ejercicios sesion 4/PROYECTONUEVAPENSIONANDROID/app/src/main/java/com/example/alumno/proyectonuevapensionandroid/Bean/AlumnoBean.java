package com.example.alumno.proyectonuevapensionandroid.Bean;

public class AlumnoBean {
    private String categoria;
    private String tipo;
    private int promedio;
    private int pension;
    private double descuento;
    private double nuevapension;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getNuevapension() {
        return nuevapension;
    }

    public void setNuevapension(double nuevapension) {
        this.nuevapension = nuevapension;
    }
}
