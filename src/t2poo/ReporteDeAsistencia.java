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
public class ReporteDeAsistencia {
    
    private String titulo;
    private ArrayList<Estudiante> registroEstudiantes = new ArrayList<>();
    private Estudiante[] registroEstudiantes2 = new Estudiante[10];

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
    
    public void agregarEstudianteAlRegistro2(Estudiante est, int i) {
        this.registroEstudiantes2[i] = est;
    }
    public Estudiante[] getRegistroEstudiantes2() {
        return registroEstudiantes2;
    }
    
    
    
}
