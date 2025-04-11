/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Instructor extends Persona{
    private ArrayList<Curso> cursos;

   

    public Instructor(String name, String id, String tel, String email){
        this.cursos = new ArrayList<>();
        this.nombre = name;
        this.cedula = id;
        this.telefono = tel;
        this.email = email;
    }

}
