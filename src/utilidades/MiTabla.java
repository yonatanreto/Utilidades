package utilidades;

/**
 * MiTabla.java
 *
 * Created on 12 de octubre de 2007, 07:40 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



/**
 *
 * @author Administrador
 */


import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class MiTabla extends JTable{

	private Color color1;
	private Color color2;
	
	private int idRender=1;//1 para intercalado, 2 para log
	
	public MiTabla () {
		super ();
		setColors (Color.white,new Color(240,240,240));
                
	}
	
	public MiTabla (TableModel tbm) {
		super (tbm);
		setColors (Color.white, Color.CYAN);
	}
	
	public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
        Component returnComp = super.prepareRenderer(renderer, row, column);
        Color alternateColor = color1;
        Color whiteColor = color2;
                
        	if (!returnComp.getBackground().equals(getSelectionBackground())){
                Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
                returnComp .setBackground(bg);
                bg = null;
            }
            //this.setShowGrid(true);    
        return returnComp;
	}
	
	public void setColors (Color colora, Color colorb) {
		color1=colora;
		color2=colorb;
	}
	
	
	
}
