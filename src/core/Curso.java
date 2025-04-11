/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Curso extends Producto{
    private ArrayList<Instructor> instructores ;
    private ArrayList<ProductoCliente> productosclientes;

    public Curso(ArrayList<Instructor> instructores, ArrayList<ProductoCliente> productosclientes, int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, double Valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, Valor);
        this.instructores = instructores;
        this.productosclientes = productosclientes;
    } 
    
    
    

    
    
    
    
    
    
}
