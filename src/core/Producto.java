/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;

/**
 *
 * @author Jose
 */
public class Producto {
    protected int id;
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected boolean estadoActivo;
    protected double Valor;

    public Producto(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, double Valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoActivo = estadoActivo;
        this.Valor = Valor;
    }
    
    
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public double getValor() {
        return Valor;
    }
    
    
    
}
