/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesaka;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author dell
 */
public class KF {
    
    public static MainMenu MainMenu = new MainMenu();
        public static IFKASIR IFKASIR = new IFKASIR();
      public static IFMANAGER IFMANAGER = new IFMANAGER();
    public static void untukIF(JInternalFrame IFapa, JPanel panelapa) {
        try {
            panelapa.removeAll();
            panelapa.add(IFapa);
            IFapa.setVisible(true);
            IFapa.setMaximum(true);
            IFapa.setBorder(null);
            ((BasicInternalFrameUI) IFapa.getUI()).setNorthPane(null);
            panelapa.repaint();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(KF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
