/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;


import Logic.Scheduler;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import InitSO.TaskManagerFrame;

/**
 *
 * @author Kevin
 */
public class Advanced_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Advanced_Frame
     */
    public Advanced_Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        checkButton.setContentAreaFilled(false); //to make the content area transparent
        checkButton.setBorderPainted(false); //to make the borders transparent
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpuTxt = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        errorLoglbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        validCPULbl = new javax.swing.JLabel();
        errorCPULbl = new javax.swing.JLabel();
        cpulbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(431, 424));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpuTxt.setBackground(new java.awt.Color(26, 41, 60));
        cpuTxt.setFont(new java.awt.Font("Bauhaus", 1, 48)); // NOI18N
        cpuTxt.setForeground(new java.awt.Color(153, 153, 153));
        cpuTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpuTxt.setToolTipText("");
        cpuTxt.setBorder(null);
        cpuTxt.setCaretColor(new java.awt.Color(51, 51, 51));
        cpuTxt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cpuTxtMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cpuTxtMouseMoved(evt);
            }
        });
        cpuTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpuTxtMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cpuTxtMouseExited(evt);
            }
        });
        cpuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cpuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 360, 60));

        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 60, 60));

        errorLoglbl.setFont(new java.awt.Font("Bauhaus Light", 0, 24)); // NOI18N
        errorLoglbl.setForeground(new java.awt.Color(204, 204, 204));
        errorLoglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLoglbl.setText("Choose CPUs quantity:");
        getContentPane().add(errorLoglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 420, 40));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Bauhaus", 1, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CPU");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 380, 80));

        validCPULbl.setFont(new java.awt.Font("Bauhaus Light", 0, 24)); // NOI18N
        validCPULbl.setForeground(new java.awt.Color(153, 255, 153));
        validCPULbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(validCPULbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 360, 50));

        errorCPULbl.setFont(new java.awt.Font("Bauhaus Light", 0, 24)); // NOI18N
        errorCPULbl.setForeground(new java.awt.Color(255, 102, 102));
        errorCPULbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(errorCPULbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 360, 50));

        cpulbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpulblKeyPressed(evt);
            }
        });
        getContentPane().add(cpulbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpulblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpulblKeyPressed

    }//GEN-LAST:event_cpulblKeyPressed

    private void cpuTxtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpuTxtMouseDragged

    }//GEN-LAST:event_cpuTxtMouseDragged

    private void cpuTxtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpuTxtMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cpuTxtMouseMoved

    private void cpuTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpuTxtMouseClicked

    }//GEN-LAST:event_cpuTxtMouseClicked

    private void cpuTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpuTxtMouseExited

    }//GEN-LAST:event_cpuTxtMouseExited

    private void cpuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpuTxtActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        String cpu = cpuTxt.getText();
        
        try{
            int parseInt = Integer.parseInt(cpu);
            if(parseInt > 0 && parseInt < 100){
                validCPULbl.setText("Configuration Applied");
                Scheduler.cpusLeft = parseInt; 
            }
            Thread.sleep(1000);
              
        }catch(NumberFormatException e){
            errorCPULbl.setText("Ingrese un valor numerico");
        } catch (InterruptedException ex) {
            Logger.getLogger(Advanced_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_checkButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Advanced_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Advanced_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Advanced_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Advanced_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Advanced_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JTextField cpuTxt;
    private javax.swing.JLabel cpulbl;
    private javax.swing.JLabel errorCPULbl;
    private javax.swing.JLabel errorLoglbl;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel validCPULbl;
    // End of variables declaration//GEN-END:variables
}
