/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.Color;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.painter.CompoundPainter;
import org.jdesktop.swingx.painter.GlossPainter;
import org.jdesktop.swingx.painter.MattePainter;
import org.jdesktop.swingx.painter.PinstripePainter;

/**
 *
 * @author Usuario
 */
public class PropiedadesGUI {
    
    
    public static void setupPainters(JXPanel jXPanel1,Color color  ) {
       
        GlossPainter gloss = new GlossPainter(new Color(1.0f, 1.0f, 1.0f, 0.4f),GlossPainter.GlossPosition.TOP);
        PinstripePainter stripes = new PinstripePainter();
        stripes.setPaint(new Color(1.0f, 1.0f, 1.0f, 0.4f));
        stripes.setSpacing(5.0);
        MattePainter matte = new MattePainter(color);
        jXPanel1.setBackgroundPainter(new CompoundPainter(matte, stripes, gloss));
    }
    
}
