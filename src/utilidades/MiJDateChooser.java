/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.JPopupMenu;

/**
 *
 * @author jesus
 */
/*
 *  MiJDateChooser.java  - A bean for choosing a date
 *  Copyright (C) 2004 Kai Toedter
 *  kai@toedter.com
 *  www.toedter.com
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */



public class MiJDateChooser extends JDateChooser{
private JPopupMenu popup1=null;
	
	public MiJDateChooser() {
		this.popup1=this.popup;
                
	}

    /**
     * @return the popup1
     */
    public JPopupMenu getPopup1() {
        return popup1;
    }

	

}
