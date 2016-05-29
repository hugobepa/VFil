
package vfil;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static vfil.VFil.displayJFrame;


public class V extends javax.swing.JFrame implements Runnable {
    Thread hilo;
    int etapa=0,i=1;
   
     
    /**
     * Creates new form V
     * https://linuxgx.blogspot.com.es/2014/06/java-hilos-thread-jframe.html
     * http://alvinalexander.com/java/jframe-example
     * 
     * 
     *  iniciarHilo();
            if(seguirHilo){
                pararHIlo(false);
                jbLanzarHilo.setText("Reanudar hilo");
            }else{
                pararHIlo(true);
                jbLanzarHilo.setText("Detener hilo");
            }
     * 
     * 
     *  if ("Start" == e.getActionCommand()) {
            startButton.setEnabled(false);
            stopButton.setEnabled(true);
            (flipTask = new FlipTask()).execute();
        } else if ("Stop" == e.getActionCommand()) {
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
            flipTask.cancel(true);
            flipTask = null;
        }
     * 
     */
    public V() {
        initComponents();
        hilo=new Thread(this);
        hilo.start();
        etapa=1;
        run();
    }
    
    
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT1 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();
        BT3 = new javax.swing.JButton();
        LB1 = new javax.swing.JLabel();
        LB2 = new javax.swing.JLabel();
        LB3 = new javax.swing.JLabel();
        BTSuti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BT1.setText("primer");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        BT2.setText("segon");
        BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT2ActionPerformed(evt);
            }
        });

        BT3.setText("tercer");
        BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT3ActionPerformed(evt);
            }
        });

        LB1.setText("jLabel1");

        LB2.setText("jLabel1");

        LB3.setText("jLabel1");

        BTSuti.setText("Surt");
        BTSuti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSutiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BT1)
                                .addGap(119, 119, 119)
                                .addComponent(LB1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BT2)
                                    .addComponent(BT3))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LB2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(BTSuti, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(BTSuti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT1)
                    .addComponent(LB1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB2)
                    .addComponent(BT2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB3)
                    .addComponent(BT3))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT2ActionPerformed
        etapa=3;
        run();
    }//GEN-LAST:event_BT2ActionPerformed

    private void BTSutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSutiActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BTSutiActionPerformed

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed
        etapa=2;
        run();
    }//GEN-LAST:event_BT1ActionPerformed

    private void BT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT3ActionPerformed
        etapa=4;
        run();
    }//GEN-LAST:event_BT3ActionPerformed

   public void accio()
   {
       System.out.println("Hola accio");
       
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT2;
    private javax.swing.JButton BT3;
    private javax.swing.JButton BTSuti;
    private javax.swing.JLabel LB1;
    private javax.swing.JLabel LB2;
    private javax.swing.JLabel LB3;
    // End of variables declaration//GEN-END:variables

    
   /* public void iniciarHilo()
    {
        hilo=new Thread(this);
        hilo.start();
        BT2.setEnabled(false);
        BT2.setVisible(false);
        BT3.setEnabled(false);
        BT3.setVisible(false);
        LB1.setVisible(false);
        LB2.setVisible(false);
        LB3.setVisible(false);
        etapa=1;
    }*/
    
     
       
   
    public void run() {
        
        if(etapa==1)
        {
           
        BT2.setEnabled(false);
        BT2.setVisible(false);
        BT3.setEnabled(false);
        BT3.setVisible(false);
        LB1.setVisible(false);
        LB2.setVisible(false);
        LB3.setVisible(false);
        }else if(etapa==2)
            {
            System.out.println("primer process");
            i++;
            LB1.setText("primerProcess");
            LB1.setVisible(true);
            BT1.setEnabled(false);
            BT1.setVisible(false);
            BT2.setEnabled(true);
            BT2.setVisible(true);
           
        }else if(etapa==3){
            System.out.println("segon process");
            i++;
            LB2.setText("SegonProcess");
            LB2.setVisible(true);
            BT2.setEnabled(false);
            BT2.setVisible(false);
            BT3.setEnabled(true);
            BT3.setVisible(true);
        }else if(etapa==4){
            System.out.println("tancarFils");    
            JOptionPane.showMessageDialog(null, "tancarFils");
            this.setVisible(false);
            System.exit(0);
        }    
        
    }

    
    
    

          
    
       
}
