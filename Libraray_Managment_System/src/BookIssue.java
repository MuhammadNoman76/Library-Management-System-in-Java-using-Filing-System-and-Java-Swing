
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest-a
 */
public class BookIssue extends javax.swing.JFrame {
     DATAODBOOKS data1 = new DATAODBOOKS();
     DataOfMember data = new DataOfMember();
    /**
     * Creates new form IssueBooks
     */
    public BookIssue() {
        
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
         
       if(data1.file.isFile()){
           try {
            data1.osi1   = new ObjectInputStream(new FileInputStream(data1.file));
            data1.a1 = (LinkedList<BookAdding>) data1.osi1.readObject();
            data1.osi1.close();
           } 
           catch (Exception e) 
           {
           }
    }
           if(data1.BookIssue.isFile()){ 
            
            try {
            data1.osi2  = new ObjectInputStream(new FileInputStream(data1.BookIssue));
            data1.a2 = (LinkedList<temp>) data1.osi2.readObject();
            data1.osi2.close();
           } 
           catch (Exception e) 
           {
           }
          
        }
    }
    class IsueBook{
        
        public void bookia() throws Exception{
                     String BookNameTemp;
                     String BookIDTemp;
            
                    String StudentID = "";
                    String StduentName = "";
                    boolean foundmember=false;                 
                    if(data.file.isFile()){   
                    String MemberID = jTextField1.getText();
                    ListIterator li3 =  data.a.listIterator();
                    while( li3.hasNext()){
                    MemberAdding e2 =(MemberAdding)li3.next();
                    
                    
                    if(MemberID.equalsIgnoreCase(e2.ID)){
                         
                         StudentID = e2.ID;
                         StduentName = e2.ename;                      
                         foundmember = true;
                         jLabel5.setText("BOOK HAS BEEN GIVIING TO "+e2.ename+" OF ID "+e2.ID);
                    }                   
                    }
                    if(!foundmember){
                        jLabel5.setText("THERE IS NO MEMBER OF THIS ID ");
                    }                                        
                    }
                                     
                   if(data1.file.isFile()){
                       
                    ListIterator li =  data1.a1.listIterator();
                    ListIterator li2 =  data1.a2.listIterator();
                    
                    boolean found = false;
                    
                    String BookID = jTextField2.getText();
                    
     while(li.hasNext()){
                        
                    BookAdding e3 =(BookAdding)li.next();
                    
                    if(BookID.equalsIgnoreCase(e3.BookID) && foundmember){   
                    jLabel6.setText("THE BOOK NAME IS "+e3.ename+" AND ID IS "+e3.BookID);     
                    LocalDate  Curent_date = LocalDate.now();
                    LocalDate nextWeek = Curent_date.plus(1, ChronoUnit.WEEKS);
                    LocalDate  Return_date = LocalDate.of(nextWeek.getYear(),nextWeek.getMonth(), nextWeek.getDayOfMonth());
                    found = true;
                        
                        data1.a2.add(new temp(e3.BookID, e3.ename, e3.genre, StudentID, StduentName, Curent_date.toString(), Return_date.toString(), Curent_date, Return_date));
                        data1.oss2 = new ObjectOutputStream(new FileOutputStream(data1.BookIssue));
                        data1.oss2.writeObject(data1.a2);
                        data1.oss2.close();
                        li.remove();
                         
                  }
               
  }
     
                     if (!foundmember) {
                         JOptionPane.showMessageDialog(null,"There is no Member of This ID");  
                    }
                    if(!found){
                        JOptionPane.showMessageDialog(null,"There is no Book of This ID");
                        jLabel6.setText("BUT THERE IS NO BOOK IN DATA");
                    }
                    else{
                      
                        if (foundmember && found) {
                           JOptionPane.showMessageDialog(null,"Book Issue Successfully");
                    
                       
                        data1.oss1 = new ObjectOutputStream(new FileOutputStream(data1.file));
                        data1.oss1.writeObject(data1.a1);
                        data1.oss1.close();  
                        }
                      
                    }
                    
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
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sideLogin.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 560, 560));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 590, 610));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEMBER ID TO ISSUE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 190, 40));

        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 190, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOK ID TO ISSUE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-3KK.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 100, 112));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 580, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 470, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, 590, 610));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("BOOK ISSUE ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 760, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backicON.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IsueBook obj = new IsueBook();
          if (jTextField1.getText().equals("")) {
                  JOptionPane.showMessageDialog(null, "MEMBER ID TEXTFIELD IS EMPTY");
                  return;
        }
        if (jTextField2.getText().equals("")) {
              JOptionPane.showMessageDialog(null, "BOOK ID TEXTFIELD IS EMPTY");
                  return;
            
        }
        try {

            obj.bookia();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Book_Area().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookIssue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookIssue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
