package Interfaz;

import java.awt.GridLayout;
import java.util.Timer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class CenterPanel extends JPanel{
	
	private JTextPane txtpnQueryResult;
	private JPanel centerRightPanel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblQueryStats;
	private JLabel lblExecutionTime;
	private JTextField txts;
	//private Time time;
	
	public CenterPanel(){
		//time = new Time();
		this.setLayout(new GridLayout(0, 2, 0, 0));
		txtpnQueryResult = new JTextPane();
		txtpnQueryResult.setEditable(false);
		txtpnQueryResult.setText("Query result");
		this.add(txtpnQueryResult);
		
		centerRightPanel = new JPanel();
		this.add(centerRightPanel);
		centerRightPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_1 = new JPanel();
		centerRightPanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		lblQueryStats = new JLabel("Query stats");
		lblQueryStats.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblQueryStats);
		
		panel_2 = new JPanel();
		centerRightPanel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblExecutionTime = new JLabel("Execution time");
		lblExecutionTime.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblExecutionTime);
		
		txts = new JTextField();
		txts.setEditable(false);
		txts.setHorizontalAlignment(SwingConstants.CENTER);
		//txts.setText(""+time.getSegundos());
		panel_2.add(txts);
		txts.setColumns(10);
	}
	
	/*public String getTime(){
		return time.toString();
	}*/
	
	public void showResult(String result){
		txtpnQueryResult.setText(result);
	}
	
	public void setSQLTime(float t) {
		txts.setText(""+t);
	}


}
