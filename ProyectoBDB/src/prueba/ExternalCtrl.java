package prueba;

import java . awt . event.ActionEvent;
import java . awt . event.ActionListener;
import java.util.Calendar;

import javax.swing.JComboBox;

import InterfazJL.ViewMainPanel;

public class ExternalCtrl implements ActionListener {

	WindowPanelWithExternalCtrl win ;

	public ExternalCtrl(WindowPanelWithExternalCtrl mainPanel) {	
		win = mainPanel ;
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand ( );
		String s = (String) win.getCombox().getSelectedItem();
		
		if (command == WindowPanelWithExternalCtrl.EXECUTE){
			if(s!=null && !win.getHistorial().contains(s)){
				win.changeText(s);
				win.writeHistorial(s);
			}
		}
	}
}