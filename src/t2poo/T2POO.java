/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2poo;

import Ventanas.VentanaCursos;

/**
 *
 * @author USER
 */
public class T2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Curso[] cursos = new Curso[3];
        for (int i = 0; i < cursos.length; i++) {
            Curso curso = new Curso();
            switch (i) {
                case 0:
                    curso.setTitulo("TRIGONOMETRIA");
                    break;
                case 1:
                    curso.setTitulo("GEOMETRIA");
                    break;
                case 2:
                    curso.setTitulo("ALGEBRA");
                    break;
                default:
                    break;
            }
            cursos[i] = curso;
        }
        
        VentanaCursos ventanaCursos = new VentanaCursos(cursos);
        ventanaCursos.setLocationRelativeTo(null);
        ventanaCursos.setVisible(true);        
    }
    
}
