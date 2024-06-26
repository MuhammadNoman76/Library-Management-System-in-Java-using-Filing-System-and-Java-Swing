
import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noman
 */
public class MemberDelete extends javax.swing.JFrame {
   
    Stack<String> stack = new Stack<String>();
    
    /**
     * Creates new form DeleteMember
     */
    DataOfMember data = new DataOfMember();
    public MemberDelete() {
        
        initComponents();
             
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
             this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
             setExtendedState(JFrame.MAXIMIZED_BOTH);
         
       if(data.file.isFile()){
           try {
            data.osi   = new ObjectInputStream(new FileInputStream(data.file));
            data.a = (LinkedList<MemberAdding>) data.osi.readObject();
            data.osi.close();
           } 
           catch (Exception e) 
           {
           }
    }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sideLogin.png"))); // NOI18N
        jLabel13.setText("jLabel4");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 560, 560));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 590, 610));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setBackground(new java.awt.Color(0, 0, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 610, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Recent Deleted");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 188, 180, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deletesmall.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, 112));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MEMBER ID");
        jLabel4.setAlignmentX(1080.0F);
        jLabel4.setAlignmentY(1080.0F);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, 590, 610));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("REMOVE A MEMBER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backicON.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 200, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Member_Area().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     boolean found = false;
               if(data.file.isFile()){
                   ListIterator li = data.a.listIterator();
                   
                  while(li.hasNext()){
                        MemberAdding e =(MemberAdding)li.next();
                        if(jTextField1.getText().equalsIgnoreCase(e.ID)){
                            
                            stack.add(e.ID+"\t\t"+e.ename+"\t\t"+e.Department);
                             li.remove();
                             found = true;
                             
                        }
                        
                    }
                  if(found){
                      
                      JOptionPane.showMessageDialog(null,"DATA DELETE SUCESSFULLY");
                      try {
                       data.oss = new  ObjectOutputStream(new FileOutputStream(data.file));
                       data.oss.writeObject(data.a);
                       data.oss.close();
                       jTextField1.setText("");
                          
                      } catch (Exception e) {
                      }
                if (!stack.isEmpty()) {
                    jTextArea2.setText("            "+stack.pop());    
                 }
                else{
                   jTextArea2.setText("No History");
                }
                     
                  }
                  if(!found){
                    JOptionPane.showMessageDialog(null,"THERE IS NO DATA OF THIS ID");
                      
                       
                    }
                     
                            
                        
                  
                 
                    
                      }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MemberDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
