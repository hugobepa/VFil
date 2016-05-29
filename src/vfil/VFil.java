/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vfil;

import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author hugo
 */
public class VFil {

   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displayJFrame();
            }
        });
    }
 
    static void displayJFrame()
    {
        V v = new V();
       
        v.setVisible(true);
    }
   
}
