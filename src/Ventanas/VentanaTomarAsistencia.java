/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import t2poo.Curso;
import t2poo.Estudiante;
import t2poo.ReporteDeAsistencia;

/**
 *
 * @author USER
 */
public class VentanaTomarAsistencia extends javax.swing.JFrame {
    Curso cursoSelec;
    Estudiante[] estudiantes = new Estudiante[10];
    VentanaCursos ventanaAnterior;

    /**
     * Creates new form VentanaCursos
     */
    public VentanaTomarAsistencia() {
        initComponents();
    }
    public VentanaTomarAsistencia(Curso curso, VentanaCursos padre) {
        cursoSelec = curso;
        estudiantes = curso.getEstudiantesEnElCurso();
        ventanaAnterior = padre;
        initComponents();
        lbl_titulo.setText(curso.getTitulo());
        lbl_Estudiante1.setText(estudiantes[0].getNombre());
        lbl_Estudiante2.setText(estudiantes[1].getNombre());
        lbl_Estudiante3.setText(estudiantes[2].getNombre());
        lbl_Estudiante4.setText(estudiantes[3].getNombre());
        lbl_Estudiante5.setText(estudiantes[4].getNombre());
        lbl_Estudiante6.setText(estudiantes[5].getNombre());
        lbl_Estudiante7.setText(estudiantes[6].getNombre());
        lbl_Estudiante8.setText(estudiantes[7].getNombre());
        lbl_Estudiante9.setText(estudiantes[8].getNombre());
        lbl_Estudiante10.setText(estudiantes[9].getNombre());                      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_Estudiante1 = new javax.swing.JLabel();
        lbl_Estudiante2 = new javax.swing.JLabel();
        lbl_Estudiante3 = new javax.swing.JLabel();
        lbl_Estudiante4 = new javax.swing.JLabel();
        lbl_Estudiante5 = new javax.swing.JLabel();
        lbl_Estudiante6 = new javax.swing.JLabel();
        lbl_Estudiante7 = new javax.swing.JLabel();
        lbl_Estudiante8 = new javax.swing.JLabel();
        lbl_Estudiante9 = new javax.swing.JLabel();
        lbl_Estudiante10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_estAsis1 = new javax.swing.JTextField();
        txt_estAsis2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_estAsis3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_estAsis4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_estAsis5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_estAsis6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_estAsis7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_estAsis8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_estAsis9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_estAsis10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbl_FlechaAtras = new javax.swing.JLabel();
        lbl_CuaAtras = new javax.swing.JLabel();
        lbl_VerRegistros = new javax.swing.JLabel();
        lbl_CuaAzul = new javax.swing.JLabel();
        lbl_iconAsistencia = new javax.swing.JLabel();
        lbl_CuaVerde = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("CURSO SELECCIONADO");
        lbl_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, -1));

        lbl_Estudiante1.setText("jLabel13");
        jPanel1.add(lbl_Estudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 20));

        lbl_Estudiante2.setText("jLabel13");
        jPanel1.add(lbl_Estudiante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 20));

        lbl_Estudiante3.setText("jLabel13");
        jPanel1.add(lbl_Estudiante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 20));

        lbl_Estudiante4.setText("jLabel13");
        jPanel1.add(lbl_Estudiante4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 20));

        lbl_Estudiante5.setText("jLabel13");
        jPanel1.add(lbl_Estudiante5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, 20));

        lbl_Estudiante6.setText("jLabel13");
        jPanel1.add(lbl_Estudiante6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 20));

        lbl_Estudiante7.setText("jLabel13");
        jPanel1.add(lbl_Estudiante7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 20));

        lbl_Estudiante8.setText("jLabel13");
        jPanel1.add(lbl_Estudiante8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 20));

        lbl_Estudiante9.setText("jLabel13");
        jPanel1.add(lbl_Estudiante9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 20));

        lbl_Estudiante10.setText("jLabel13");
        jPanel1.add(lbl_Estudiante10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("A / T / F");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 50, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ESTUDIANTES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txt_estAsis1.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 30, 20));

        txt_estAsis2.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txt_estAsis3.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 30, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txt_estAsis4.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 30, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txt_estAsis5.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txt_estAsis6.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 30, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txt_estAsis7.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 30, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txt_estAsis8.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txt_estAsis9.setBackground(new java.awt.Color(204, 209, 215));
        txt_estAsis9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 30, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txt_estAsis10.setBackground(new java.awt.Color(204, 204, 204));
        txt_estAsis10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estAsis10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 30, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecGris.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lbl_FlechaAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FlechaAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconAtras.png"))); // NOI18N
        lbl_FlechaAtras.setToolTipText("");
        lbl_FlechaAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_FlechaAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_FlechaAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_FlechaAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_FlechaAtrasMouseExited(evt);
            }
        });
        jPanel1.add(lbl_FlechaAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 30, 30));

        lbl_CuaAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaBlanco.png"))); // NOI18N
        jPanel1.add(lbl_CuaAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lbl_VerRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_VerRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconVerRegistrosAsistencias.png"))); // NOI18N
        lbl_VerRegistros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_VerRegistros.setMaximumSize(new java.awt.Dimension(20, 20));
        lbl_VerRegistros.setMinimumSize(new java.awt.Dimension(20, 20));
        lbl_VerRegistros.setPreferredSize(new java.awt.Dimension(20, 20));
        lbl_VerRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VerRegistrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_VerRegistrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_VerRegistrosMouseExited(evt);
            }
        });
        jPanel1.add(lbl_VerRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 30, 30));

        lbl_CuaAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaAzul.png"))); // NOI18N
        jPanel1.add(lbl_CuaAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        lbl_iconAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iconAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconAsistencia.png"))); // NOI18N
        lbl_iconAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_iconAsistenciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_iconAsistenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_iconAsistenciaMouseExited(evt);
            }
        });
        jPanel1.add(lbl_iconAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 30, 30));

        lbl_CuaVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaVerde.png"))); // NOI18N
        jPanel1.add(lbl_CuaVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Fondo.png"))); // NOI18N
        jPanel1.add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_FlechaAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FlechaAtrasMouseClicked
        ventanaAnterior.setLocationRelativeTo(this);
        this.setVisible(false);
        ventanaAnterior.setVisible(true);  
    }//GEN-LAST:event_lbl_FlechaAtrasMouseClicked

    private void lbl_iconAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iconAsistenciaMouseClicked
                
        ReporteDeAsistencia nuevoReporte = new ReporteDeAsistencia();

        Estudiante[] est = new Estudiante[10];        
        
        for (int i = 0; i < 10; i++) {
            Estudiante estudiante = new Estudiante();

            estudiante.setNombre(estudiantes[i].getNombre());   
            switch (i) {
                case 0:
                    estudiante.setEstAsistencia(txt_estAsis1.getText());
                    break;
                case 1:
                    estudiante.setEstAsistencia(txt_estAsis2.getText());
                    break;
                case 2:
                    estudiante.setEstAsistencia(txt_estAsis3.getText());
                    break;
                case 3:
                    estudiante.setEstAsistencia(txt_estAsis4.getText());
                    break;
                case 4:
                    estudiante.setEstAsistencia(txt_estAsis5.getText());
                    break;
                case 5:
                    estudiante.setEstAsistencia(txt_estAsis6.getText());
                    break;
                case 6:
                    estudiante.setEstAsistencia(txt_estAsis7.getText());
                    break;
                case 7:
                    estudiante.setEstAsistencia(txt_estAsis8.getText());
                    break;
                case 8:
                    estudiante.setEstAsistencia(txt_estAsis9.getText());
                    break;
                case 9:
                    estudiante.setEstAsistencia(txt_estAsis10.getText());
                    break;
                default:                    
                    break;
            }
            est[i] = estudiante;        
        }
        for (int i = 0; i < 10; i++) {
            nuevoReporte.agregarEstudianteAlRegistro2(est[i], i);
        }
        int num = cursoSelec.getListaDeReportesDeAsistencia().size() + 1;
        nuevoReporte.setTitulo("REGISTRO " + num);
        
        cursoSelec.agregarRegistroDeAsistencia(nuevoReporte);     
        vaciarCeldas();     
    }//GEN-LAST:event_lbl_iconAsistenciaMouseClicked

    private void lbl_VerRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VerRegistrosMouseClicked
        
        vaciarCeldas();          
        VentanaVerRegistros ventanaVerRegistros 
                = new VentanaVerRegistros(cursoSelec, this);
        ventanaVerRegistros.TenerListaActualizada();
        ventanaVerRegistros.setLocationRelativeTo(this);
        ventanaVerRegistros.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_VerRegistrosMouseClicked

    private void lbl_FlechaAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FlechaAtrasMouseEntered
        lbl_CuaAtras.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Imgs/CuaBlancoO.png")));
    }//GEN-LAST:event_lbl_FlechaAtrasMouseEntered

    private void lbl_FlechaAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FlechaAtrasMouseExited
        lbl_CuaAtras.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Imgs/CuaBlanco.png")));
    }//GEN-LAST:event_lbl_FlechaAtrasMouseExited

    private void lbl_iconAsistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iconAsistenciaMouseEntered
        lbl_CuaVerde.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Imgs/CuaVerdeO.png")));
    }//GEN-LAST:event_lbl_iconAsistenciaMouseEntered

    private void lbl_iconAsistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iconAsistenciaMouseExited
        lbl_CuaVerde.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Imgs/CuaVerde.png")));
    }//GEN-LAST:event_lbl_iconAsistenciaMouseExited

    private void lbl_VerRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VerRegistrosMouseEntered
        lbl_CuaAzul.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Imgs/CuaAzulO.png")));
    }//GEN-LAST:event_lbl_VerRegistrosMouseEntered

    private void lbl_VerRegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VerRegistrosMouseExited
        lbl_CuaAzul.setIcon(new javax.swing.ImageIcon(getClass()
                .getResource("/Imgs/CuaAzul.png")));
    }//GEN-LAST:event_lbl_VerRegistrosMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaTomarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTomarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTomarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTomarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTomarAsistencia().setVisible(true);
            }
        });
    }
    
    public void vaciarCeldas(){
        txt_estAsis1.setText("");
        txt_estAsis2.setText("");
        txt_estAsis3.setText("");
        txt_estAsis4.setText("");
        txt_estAsis5.setText("");
        txt_estAsis6.setText("");
        txt_estAsis7.setText("");
        txt_estAsis8.setText("");
        txt_estAsis9.setText("");
        txt_estAsis10.setText("");    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_CuaAtras;
    private javax.swing.JLabel lbl_CuaAzul;
    private javax.swing.JLabel lbl_CuaVerde;
    private javax.swing.JLabel lbl_Estudiante1;
    private javax.swing.JLabel lbl_Estudiante10;
    private javax.swing.JLabel lbl_Estudiante2;
    private javax.swing.JLabel lbl_Estudiante3;
    private javax.swing.JLabel lbl_Estudiante4;
    private javax.swing.JLabel lbl_Estudiante5;
    private javax.swing.JLabel lbl_Estudiante6;
    private javax.swing.JLabel lbl_Estudiante7;
    private javax.swing.JLabel lbl_Estudiante8;
    private javax.swing.JLabel lbl_Estudiante9;
    private javax.swing.JLabel lbl_FlechaAtras;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_VerRegistros;
    private javax.swing.JLabel lbl_iconAsistencia;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_estAsis1;
    private javax.swing.JTextField txt_estAsis10;
    private javax.swing.JTextField txt_estAsis2;
    private javax.swing.JTextField txt_estAsis3;
    private javax.swing.JTextField txt_estAsis4;
    private javax.swing.JTextField txt_estAsis5;
    private javax.swing.JTextField txt_estAsis6;
    private javax.swing.JTextField txt_estAsis7;
    private javax.swing.JTextField txt_estAsis8;
    private javax.swing.JTextField txt_estAsis9;
    // End of variables declaration//GEN-END:variables
}
