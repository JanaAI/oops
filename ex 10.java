/*
* To change this license header, choose License Headers in Project 
Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
Package javaapplication2;
Import javax.swing.JTextField;
/**
*
* @author 20uad009
*/
Public class jan extends javax.swing.JFrame {
 String a,b,c;
 /**
 * Creates new form vino
 */
 Public jan() {
 initComponents();
 }
 /**
 * This method is called from within the constructor to initialize the 
form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
 @SuppressWarnings(“unchecked”)
 // <editor-fold defaultstate=”collapsed” desc=”Generated Code”> 
 Private void initComponents() {
 jLabel1 = new javax.swing.JLabel();
 jLabel2 = new javax.swing.JLabel();
 jLabel3 = new javax.swing.JLabel();
 jButton1 = new javax.swing.JButton();
 jButton2 = new javax.swing.JButton();
 jButton3 = new javax.swing.JButton();
 jButton4 = new javax.swing.JButton();
 jTextField1 = new javax.swing.JTextField();
 jTextField2 = new javax.swing.JTextField();
 jTextField3 = new javax.swing.JTextField();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 jLabel1.setText(“Number1”);
 jLabel2.setText(“Number 2”);
 jLabel3.setText(“Result”);
 jButton1.setText(“-“);
 jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton1ActionPerformed(evt);
 }
 });
 jButton2.setText(“+”);
 jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton2ActionPerformed(evt);
 }
 });
 jButton3.setText(“*”);
 jButton3.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton3ActionPerformed(evt);
 }
 });
 jButton4.setText(“/”);
 jButton4.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jButton4ActionPerformed(evt);
 }
 });
 jTextField1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
 jTextField1ActionPerformed(evt);
 }
 });
 javax.swing.GroupLayout layout = new 
javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
 
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(29, 29, 29)
 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADIN
G)
 .addGroup(layout.createSequentialGroup()
 .addGap(62, 62, 62)
 .addComponent(jLabel3)
 .addGap(18, 18, 18)
 .addComponent(jTextField3, 
javax.swing.GroupLayout.PREFERRED_SIZE, 119, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
layout.createSequentialGroup()
 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADIN
G)
 .addGroup(layout.createSequentialGroup()
 .addComponent(jLabel1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addComponent(jTextField1, 
javax.swing.GroupLayout.PREFERRED_SIZE, 49, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addGroup(layout.createSequentialGroup()
 .addComponent(jLabel2)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addComponent(jTextField2, 
javax.swing.GroupLayout.PREFERRED_SIZE, 46, 
javax.swing.GroupLayout.PREFERRED_SIZE)))
 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, 
Short.MAX_VALUE)
 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADIN
G)
 .addComponent(jButton2)
 .addComponent(jButton3))
 .addGap(18, 18, 18) 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADIN
G)
 .addComponent(jButton1)
 .addComponent(jButton4))
 .addGap(119, 119, 119))))
 );
 Layout.setVerticalGroup(
 
Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(layout.createSequentialGroup()
 .addGap(54, 54, 54)
 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELI
NE)
 .addComponent(jLabel1)
 .addComponent(jButton1)
 .addComponent(jTextField1, 
javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jButton2))
 .addGap(23, 23, 23)
 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELI
NE)
 .addComponent(jLabel2)
 .addComponent(jButton3)
 .addComponent(jTextField2, 
javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.PREFERRED_SIZE)
 .addComponent(jButton4))
 .addGap(28, 28, 28)
 
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELI
NE)
 .addComponent(jLabel3)
 .addComponent(jTextField3, 
javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
javax.swing.GroupLayout.PREFERRED_SIZE))
 .addContainerGap(129, Short.MAX_VALUE))
 );
jLabel1.getAccessibleContext().setAccessibleName(“Number 1”);
 jLabel2.getAccessibleContext().setAccessibleName(“Number 2”);
 jLabel3.getAccessibleContext().setAccessibleName(“Result”);
 pack();
 }// </editor-fold> 
 Private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 
 
 } 
 Private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 A=jTextField1.getText();
 B=jTextField2.getText();
 Int x,y,z;
 X=Integer.parseInt(a);
 Y=Integer.parseInt(b);
 Z = x+y;
 C=Integer.toString(z);
 jTextField3.setText©;
 } 
Private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 A=jTextField1.getText();
 B=jTextField2.getText();
 Int x,y,z;
 X=Integer.parseInt(a);
 Y=Integer.parseInt(b);
 Z = x-y;
 C=Integer.toString(z);
 jTextField3.setText©;
 } 
 Private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 A=jTextField1.getText();
 B=jTextField2.getText();
 Int x,y,z;
 X=Integer.parseInt(a);
 Y=Integer.parseInt(b);
 Z = x*y;
 C=Integer.toString(z);
 jTextField3.setText©;
 } 
 Private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { 
 // TODO add your handling code here:
 A=jTextField1.getText();
 B=jTextField2.getText();
 Int x,y,z;
 X=Integer.parseInt(a);
 Y=Integer.parseInt(b);
 Z = x/y;
 C=Integer.toString(z);
 jTextField3.setText©;
 } 
 /**
 * @param args the command line arguments
 */
 Public static void main(String args[]) {
 /* Set the Nimbus look and feel */
 //<editor-fold defaultstate=”collapsed” desc=” Look and feel setting 
code (optional) “>
 /* If Nimbus (introduced in Java SE 6) is not available, stay with 
the default look and feel. 
* For details see 
http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
 */
 Try {
 For (javax.swing.UIManager.LookAndFeelInfo info : 
javax.swing.UIManager.getInstalledLookAndFeels()) {
 If (“Nimbus”.equals(info.getName())) {
 
Javax.swing.UIManager.setLookAndFeel(info.getClassName());
 Break;
 }
 }
 } catch (ClassNotFoundException ex) {
 
Java.util.logging.Logger.getLogger(vino.class.getName()).log(java.util.loggin
g.Level.SEVERE, null, ex);
 } catch (InstantiationException ex) {
 
Java.util.logging.Logger.getLogger(vino.class.getName()).log(java.util.loggin
g.Level.SEVERE, null, ex);
 } catch (IllegalAccessException ex) {
 
Java.util.logging.Logger.getLogger(vino.class.getName()).log(java.util.loggin
g.Level.SEVERE, null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 
Java.util.logging.Logger.getLogger(vino.class.getName()).log(java.util.loggin
g.Level.SEVERE, null, ex);
 }
 //</editor-fold>
 /* Create and display the form */
 Java.awt.EventQueue.invokeLater(new Runnable() {
 Public void run() {
 New vino().setVisible(true);
 }
 });
 } 
// Variables declaration – do not modify 
 Private javax.swing.JButton jButton1;
 Private javax.swing.JButton jButton2;
 Private javax.swing.JButton jButton3;
 Private javax.swing.JButton jButton4;
 Private javax.swing.JLabel jLabel1;
 Private javax.swing.JLabel jLabel2;
 Private javax.swing.JLabel jLabel3;
 Private javax.swing.JTextField jTextField1;
 Private javax.swing.JTextField jTextField2;
 Private javax.swing.JTextField jTextField3;
 // End of variables declaration 
}
