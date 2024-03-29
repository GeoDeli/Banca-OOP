/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banca;

import DB.Conectare;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import OOP.Client;
import OOP.ClientImplement;

/**
 *
 * @author delim
 */
public class AutentificareClient extends javax.swing.JFrame {

    /**
     * Creates new form AutentificareClient
     */
    public AutentificareClient() {
        initComponents();
        this.setDefaultCloseOperation(AutentificareClient.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextCNP = new javax.swing.JTextField();
        TextID = new javax.swing.JTextField();
        AutentificareBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Autentificare Client");

        jLabel2.setText("ID");

        jLabel3.setText("CNP");

        TextCNP.setColumns(13);
        TextCNP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextCNPFocusLost(evt);
            }
        });
        TextCNP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextCNPKeyReleased(evt);
            }
        });

        TextID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextIDKeyReleased(evt);
            }
        });

        AutentificareBTN.setText("Autentificare");
        AutentificareBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutentificareBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextCNP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(AutentificareBTN)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextCNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(AutentificareBTN)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCNPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCNPFocusLost
        if(TextCNP.getText().length()<13)
        JOptionPane.showMessageDialog(null, "Ati introdus mai putin de 13 caractere pentru CNP", "Eroare: " + "CNP prea scurt", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_TextCNPFocusLost

    private void TextCNPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCNPKeyReleased

        String text=TextCNP.getText();
        //verifica CNP-ul sa nu depaseasca 13 caractere
        if(text.length()>13)
        JOptionPane.showMessageDialog(null, "Ati introdus mai mult de 13 caractere pentru CNP", "Eroare: " + "CNP prea lung", JOptionPane.WARNING_MESSAGE);
        if(DoarNumar(TextCNP.getText())==0)
        JOptionPane.showMessageDialog(null, "Ati introdus un caracter nepermis", "Eroare: " + "Caracter nepermis", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_TextCNPKeyReleased

    private void TextIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIDKeyReleased
        if(DoarNumar(TextID.getText())==0)
             JOptionPane.showMessageDialog(null, "Ati introdus un caracter nepermis", "Eroare: " + "Caracter nepermis", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_TextIDKeyReleased
//verificare autentificare
    private void AutentificareBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutentificareBTNActionPerformed
        // TODO add your handling code here:
        try {
        Connection con=Conectare.getConnection();
        
        //preia textul introdus
        String cnp="";
        
          cnp=TextCNP.getText();  
          
         int ID=Integer.parseInt(TextID.getText());
        
         //cauta in baza de date utilizatorul cuc datele introduse
            ClientImplement imp=new ClientImplement();
            Client cli= imp.autentificare(ID,cnp);
       
         if(cli.getCNP().compareTo("0")!=0) {
             JOptionPane.showMessageDialog(null, "Client autentificat cu succes", "Succes " + "Autentificare reusita", JOptionPane.INFORMATION_MESSAGE);
             banca.ActiuniClient c=new banca.ActiuniClient(ID);
             c.setVisible(true);
            } else JOptionPane.showMessageDialog(null, "Datele introduse nu se gasesc in baza de date", "Eroare: " + "Utilizator inexistent", JOptionPane.ERROR_MESSAGE);

         
        } catch (SQLException ex) {
            Logger.getLogger(CreareUtilizator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AutentificareClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AutentificareBTNActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        verificare();
    }//GEN-LAST:event_formMouseMoved

   int DoarNumar(String text)
   {
       String regex = "^[0-9]+";
        if(!text.matches(regex)){
       
        return 0;
        }  
        else
            return 1;
   }

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
            java.util.logging.Logger.getLogger(AutentificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutentificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutentificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutentificareClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutentificareClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AutentificareBTN;
    private javax.swing.JTextField TextCNP;
    private javax.swing.JTextField TextID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void verificare() {
      //se asigura ca toate campurile sunt completate
        if(TextCNP.getText().length()>0&&TextID.getText().length()>0)
          if(DoarNumar(TextCNP.getText())==1)   //verifica sa fie numere
          if(DoarNumar(TextID.getText())==1)
            {  
                 AutentificareBTN.setEnabled(true); //permite accesul la butonul de Autentificare
            }
        else
          AutentificareBTN.setEnabled(false);
        
    }

  
}
