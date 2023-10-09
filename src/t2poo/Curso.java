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
public class Curso {

    private String titulo;
    private Estudiante[] estudiantesEnElCurso = new Estudiante[10];
    private ArrayList<ReporteDeAsistencia> listaDeReportesDeAsistencia
            = new ArrayList<>();
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudiante[] getEstudiantesEnElCurso() {
        return estudiantesEnElCurso;
    }

    public void setEstudiantesEnElCurso(Estudiante[] estudiantesEnElCurso) {
        this.estudiantesEnElCurso = estudiantesEnElCurso;
    }    

    public ArrayList<ReporteDeAsistencia> getListaDeReportesDeAsistencia() {
        return listaDeReportesDeAsistencia;
    }

    public void agregarRegistroDeAsistencia(ReporteDeAsistencia rAsistencias){
        this.listaDeReportesDeAsistencia.add(rAsistencias);
    }
    
    
    
    
    
}
