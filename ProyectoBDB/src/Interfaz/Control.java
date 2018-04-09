package Interfaz;

import java . awt . event.ActionEvent;
import java . awt . event.ActionListener;
import java.util.Calendar;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import dbDriver.DummySqlConnection;

public class Control implements ActionListener {

	ViewMainPanel win ;
	List<ViewMainPanel> panel;
	archivo arch;
	
	public Control(ViewMainPanel w, List<ViewMainPanel> p, archivo a) {
		win = w ;
		panel =p;
		arch = a;
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand( );
		String s = (String) win.getComboBox().getSelectedItem();
		
		if (command == "Execute query"){
			if(s!=null && !win.getHistorial().contains(s)){
				win.changeText(s);
				win.writeHistorial(s);
				arch.escribir(win.getHistorial());
				for(ViewMainPanel v : panel)
					if(v!=win)
						v.notify(s);
			}
			win.showResult(win.getConn().executeQuery(s));
			win.getCenterP().setSQLTime(win.getConn().getExTime());
		}
		
	}
}
