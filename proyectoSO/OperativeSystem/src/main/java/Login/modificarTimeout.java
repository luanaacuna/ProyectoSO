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
import Login.Advanced_Frame;
import Login.Advanced_Frame;

/**
 *
 * @author Kevin
 */
public class modificarTimeout extends javax.swing.JFrame {

    /**
     * Creates new form Advanced_Frame
     */
    public modificarTimeout() {
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

        timeout = new javax.swing.JTextField();
        errorLoglbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        validCPULbl = new javax.swing.JLabel();
        errorCPULbl = new javax.swing.JLabel();
        cpulbl = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        cpulbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(431, 424));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeout.setBackground(new java.awt.Color(26, 41, 60));
        timeout.setFont(new java.awt.Font("Bauhaus", 1, 48)); // NOI18N
        timeout.setForeground(new java.awt.Color(153, 153, 153));
        timeout.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeout.setToolTipText("");
        timeout.setBorder(null);
        timeout.setCaretColor(new java.awt.Color(51, 51, 51));
        timeout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                timeoutMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                timeoutMouseMoved(evt);
            }
        });
        timeout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeoutMouseExited(evt);
            }
        });
        timeout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeoutActionPerformed(evt);
            }
        });
        getContentPane().add(timeout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 360, 60));

        errorLoglbl.setFont(new java.awt.Font("Bauhaus Light", 0, 24)); // NOI18N
        errorLoglbl.setForeground(new java.awt.Color(204, 204, 204));
        errorLoglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLoglbl.setText("Choose time quantum:");
        getContentPane().add(errorLoglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 420, 40));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Bauhaus", 1, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Timeout");
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

        checkButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\Files\\Images\\checkIcon.png")); // NOI18N
        checkButton.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\Files\\Images\\pressedCheck.png")); // NOI18N
        checkButton.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\Files\\Images\\checkRollover.png")); // NOI18N
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 60, 60));

        cpulbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kevin\\Documents\\GitHub\\Files\\Images\\advancedBackground.png")); // NOI18N
        cpulbl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpulbl1KeyPressed(evt);
            }
        });
        getContentPane().add(cpulbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpulblKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpulblKeyPressed

    }//GEN-LAST:event_cpulblKeyPressed

    private void timeoutMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeoutMouseDragged

    }//GEN-LAST:event_timeoutMouseDragged

    private void timeoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeoutMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_timeoutMouseMoved

    private void timeoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeoutMouseClicked

    }//GEN-LAST:event_timeoutMouseClicked

    private void timeoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeoutMouseExited

    }//GEN-LAST:event_timeoutMouseExited

    private void timeoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeoutActionPerformed

    private void cpulbl1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpulbl1KeyPressed

    }//GEN-LAST:event_cpulbl1KeyPressed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        Scheduler.SetTimeOut(Integer.parseInt(timeout.getText()));
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
            java.util.logging.Logger.getLogger(modificarTimeout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarTimeout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarTimeout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarTimeout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarTimeout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel cpulbl;
    private javax.swing.JLabel cpulbl1;
    private javax.swing.JLabel errorCPULbl;
    private javax.swing.JLabel errorLoglbl;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField timeout;
    private javax.swing.JLabel validCPULbl;
    // End of variables declaration//GEN-END:variables
}