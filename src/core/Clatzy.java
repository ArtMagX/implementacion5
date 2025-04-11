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
public class Clatzy {
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }
    
    
    public void addInstructor(String name, String id, String tel, String email){
        Instructor instructor = new Instructor(name, id, tel, email);
        this.instructores.add(instructor);
    }
    
    public Instructor getInstructor (int index){
        return this.instructores.get(index);
    }
    
    public void addCurso(int id, String curso, LocalDate fecha, double costo, Instructor instructor){
        Curso newcurso = new Curso(id, curso, fecha, costo, instructor);
        this.cursos.add(newcurso);
    }
    

}
