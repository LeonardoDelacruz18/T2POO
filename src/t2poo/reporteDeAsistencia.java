/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2poo;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class reporteDeAsistencia {
    
    private String titulo;
    private ArrayList<Estudiante> registroEstudiantes = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public ArrayList<Estudiante> getRegistroEstudiantes() {
        return registroEstudiantes;
    }
    
    public void agregarEstudianteAlRegistro(Estudiante est) {
        this.registroEstudiantes.add(est);
    }
    
    
    
}
