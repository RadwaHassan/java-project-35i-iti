/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ITI.Messenger;

/**
 *
 * @author dina
 */

import java.awt.BorderLayout;
import java.awt.Color;
import org.jdesktop.xswingx.PromptSupport;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engy
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        SignInP.setBackground(Color.PINK);
        PromptSupport.setPrompt("user email", EmailT);
        PromptSupport.setPrompt("password", PasswordT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignInP = new javax.swing.JPanel();
        EmailL = new javax.swing.JLabel();
        EmailT = new javax.swing.JTextField();
        PasswordL = new javax.swing.JLabel();
        PasswordT = new javax.swing.JTextField();
        SignInB = new javax.swing.JButton();
        SmilleyIconL = new javax.swing.JLabel();
        orL = new javax.swing.JLabel();
        SignUpB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        EmailL.setText("Enter email:");

        PasswordL.setText("Enter password:");

        SignInB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SignInB.setText("Sign In");
        SignInB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBActionPerformed(evt);
            }
        });

        SmilleyIconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("smile.jpg"))); // NOI18N
        SmilleyIconL.setBorder(new javax.swing.border.MatteBorder(null));

        orL.setText("OR");

        SignUpB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SignUpB.setText("Sign Up");
        SignUpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignInPLayout = new javax.swing.GroupLayout(SignInP);
        SignInP.setLayout(SignInPLayout);
        SignInPLayout.setHorizontalGroup(
            SignInPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInPLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(EmailL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SignInPLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(SignInPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SignInPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SignInPLayout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(PasswordL))
                        .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SignInPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SignUpB, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(SignInB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orL)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SmilleyIconL)
                .addGap(147, 147, 147))
        );
        SignInPLayout.setVerticalGroup(
            SignInPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInPLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(SmilleyIconL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(EmailL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordL)
                .addGap(18, 18, 18)
                .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(SignInB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SignUpB)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(SignInP, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInBActionPerformed

    private void SignUpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpBActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SignIn().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailL;
    private javax.swing.JTextField EmailT;
    private javax.swing.JLabel PasswordL;
    private javax.swing.JTextField PasswordT;
    private javax.swing.JButton SignInB;
    private javax.swing.JPanel SignInP;
    private javax.swing.JButton SignUpB;
    private javax.swing.JLabel SmilleyIconL;
    private javax.swing.JLabel orL;
    // End of variables declaration//GEN-END:variables
}
