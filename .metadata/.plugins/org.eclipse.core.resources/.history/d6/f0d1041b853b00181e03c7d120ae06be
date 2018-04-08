package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 420);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpt = new JMenu("File");
		menuBar.add(mnOpt);
		
		JMenu mnAbout = new JMenu("About");
		mnOpt.add(mnAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel mainPanel = new JPanel();
		tabbedPane.addTab("Mysql DB", null, mainPanel, null);
		mainPanel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel titleLabel = new JLabel("Mysql query executer");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainPanel.add(titleLabel);
		
		JPanel NorthPanel = new JPanel();
		mainPanel.add(NorthPanel);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setEditable(true);
		comboBox.setSelectedItem("SELECT * FROM exampleTable;");
		
		
		
		
		JButton button = new JButton("Execute query");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.setEnabled(true);
		GroupLayout gl_NorthPanel = new GroupLayout(NorthPanel);
		gl_NorthPanel.setHorizontalGroup(
			gl_NorthPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_NorthPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, 0, 358, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(button)
					.addContainerGap())
		);
		gl_NorthPanel.setVerticalGroup(
			gl_NorthPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_NorthPanel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_NorthPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		NorthPanel.setLayout(gl_NorthPanel);
		
		JPanel centerPanel = new JPanel();
		mainPanel.add(centerPanel);
		centerPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JTextPane txtpnQueryResult = new JTextPane();
		txtpnQueryResult.setEditable(false);
		txtpnQueryResult.setText("Query result");
		centerPanel.add(txtpnQueryResult);
		
		JPanel centerRightPanel = new JPanel();
		centerPanel.add(centerRightPanel);
		centerRightPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		centerRightPanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblQueryStats = new JLabel("Query stats");
		lblQueryStats.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblQueryStats);
		
		JPanel panel_2 = new JPanel();
		centerRightPanel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblExecutionTime = new JLabel("Execution time");
		lblExecutionTime.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblExecutionTime);
		
		txts = new JTextField();
		txts.setEditable(false);
		txts.setHorizontalAlignment(SwingConstants.CENTER);
		txts.setText("0.00s");
		panel_2.add(txts);
		txts.setColumns(10);
		
		JLabel lblServiceStatusDisconnected = new JLabel("Service status: CONNECTED");
		lblServiceStatusDisconnected.setHorizontalAlignment(SwingConstants.CENTER);
		mainPanel.add(lblServiceStatusDisconnected);
		this.pack();
	}

}
