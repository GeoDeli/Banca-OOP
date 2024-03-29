/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/OkCancelDialog.java to edit this template
 */
package banca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Notification;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.text.NumberFormatter;




public class CreareUtilizator extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form CreareUtilizator
     */
    public CreareUtilizator(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
        okButton.setEnabled(false);
        
        
    }

    CreareUtilizator() {
     
        initComponents();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
        okButton.setEnabled(false);
        
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextCNP = new javax.swing.JTextField();
        TextEuro = new javax.swing.JTextField();
        TextLei = new javax.swing.JTextField();

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("Creare ");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Creare Utilizator");

        jLabel2.setText("CNP:");

        jLabel3.setText("Sold cont Euro:");

        jLabel4.setText("Sold cont Lei:");

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

        TextEuro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextEuroKeyReleased(evt);
            }
        });

        TextLei.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextLeiFocusLost(evt);
            }
        });
        TextLei.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextLeiKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCNP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextLei, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                .addComponent(TextEuro, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextLei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
      try {
        Connection con;
        String database="jdbc:mysql://localhost:3306/Banca";
        String username="root";
        String pass="";
        con=DriverManager.getConnection(database,username,pass);
         int id = 0;
         String cnp=TextCNP.getText();
         float eu=Float.parseFloat(TextEuro.getText());
         float lei=Float.parseFloat(TextLei.getText());
        String query="SELECT * FROM Client ORDER BY ID_C DESC LIMIT 1 ";
        Statement statement=con.createStatement();
         ResultSet resultSet = statement.executeQuery(query);
        
         while(resultSet.next())
         {
             id=Integer.parseInt(resultSet.getString("ID_C"))+1;
             
         }
         query="INSERT INTO `client`(`ID_C`, `CNP`, `Sold_Cont_EURO`, `Sold_Cont_LEI`) VALUES ("+id+",\""+cnp+"\","+eu+","+lei+")";
          statement=con.createStatement();  
          int row = statement.executeUpdate(query); 
          if(row>0)
  JOptionPane.showMessageDialog(null, "Utilizator creat cu succes\n ID pentru autentificare: "+id, "Succes: " + "Utilizator Creat", JOptionPane.PLAIN_MESSAGE);
     doClose(RET_OK);
        } catch (SQLException ex) {
            Logger.getLogger(CreareUtilizator.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    //verifica CNP-ul sa fie in parametrii normali
    private void TextCNPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCNPKeyReleased

         String text=TextCNP.getText();
         //verifica CNP-ul sa nu depaseasca 13 caractere
         if(text.length()>13)
         JOptionPane.showMessageDialog(null, "Ati introdus mai mult de 13 caractere pentru CNP", "Eroare: " + "CNP prea lung", JOptionPane.WARNING_MESSAGE);
        if(DoarNumar(TextCNP.getText())==0)
             JOptionPane.showMessageDialog(null, "Ati introdus un caracter nepermis", "Eroare: " + "Caracter nepermis", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_TextCNPKeyReleased

    private void TextEuroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextEuroKeyReleased
         if(DoarNumar(TextEuro.getText())==0)
             JOptionPane.showMessageDialog(null, "Ati introdus un caracter nepermis", "Eroare: " + "Caracter nepermis", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_TextEuroKeyReleased

    private void TextLeiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextLeiKeyReleased
                if(DoarNumar(TextLei.getText())==0)
             JOptionPane.showMessageDialog(null, "Ati introdus un caracter nepermis", "Eroare: " + "Caracter nepermis", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_TextLeiKeyReleased
            
    //verifica daca CNP-ul are mai putine caractere decat trebuie
    private void TextCNPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextCNPFocusLost
            if(TextCNP.getText().length()<13)
        JOptionPane.showMessageDialog(null, "Ati introdus mai putin de 13 caractere pentru CNP", "Eroare: " + "CNP prea scurt", JOptionPane.WARNING_MESSAGE);
                 
    }//GEN-LAST:event_TextCNPFocusLost

    private void TextLeiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextLeiFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextLeiFocusLost

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        verificare();        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
            
    int verificare()
    {
        //se asigura ca toate campurile sunt completate
        if(TextCNP.getText().length()>0&&TextEuro.getText().length()>0&&TextLei.getText().length()>0)
          if(DoarNumar(TextCNP.getText())==1)   //verifica sa fie numere
          if(DoarNumar(TextEuro.getText())==1)
            if(DoarNumar(TextCNP.getText())==1)
            {  
                 okButton.setEnabled(true); //permite accesul la butonul de OK
                 return 1;
            }
          okButton.setEnabled(false);
         return 0;
    }
    //se asigura ca doar numerele sunt introduse in TextBox-uri
   int DoarNumar(String text)
   {
       String regex = "^.{0}$|^[0-9]+"; //regex pentru a fi doar numere sau un sir null
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
            java.util.logging.Logger.getLogger(CreareUtilizator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreareUtilizator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreareUtilizator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreareUtilizator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreareUtilizator dialog = new CreareUtilizator(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCNP;
    private javax.swing.JTextField TextEuro;
    private javax.swing.JTextField TextLei;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
