

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScheduleMaintenanceUI {

	private JFrame frame = new JFrame();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleMaintenanceUI window = new ScheduleMaintenanceUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScheduleMaintenanceUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 1922, 50);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Schedule Maintenance");
		lblNewLabel.setBounds(41, 11, 459, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBounds(20, 61, 1884, 561);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(411, 106, 1087, 56);
		panel_1.add(panel_2);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Suggested Cars");
		lblNewLabel_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(484, 11, 118, 34);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(412, 162, 285, 68);
		panel_1.add(panel_5);
		panel_5.setBackground(new Color(135, 206, 235));
		panel_5.setBorder(new LineBorder(Color.BLUE));
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Priority\r\n");
		lblNewLabel_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(111, 20, 63, 27);
		panel_5.add(lblNewLabel_4);
		
		JPanel panel_5_4 = new JPanel();
		panel_5_4.setBounds(412, 227, 285, 68);
		panel_1.add(panel_5_4);
		panel_5_4.setLayout(null);
		panel_5_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_4_4 = new JLabel("1\r\n");
		lblNewLabel_4_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_4.setBounds(136, 20, 12, 27);
		panel_5_4.add(lblNewLabel_4_4);
		
		JPanel panel_5_5 = new JPanel();
		panel_5_5.setBounds(412, 288, 285, 68);
		panel_1.add(panel_5_5);
		panel_5_5.setLayout(null);
		panel_5_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_5.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("2\r\n");
		lblNewLabel_4_4_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_4_1.setBounds(136, 20, 12, 27);
		panel_5_5.add(lblNewLabel_4_4_1);
		
		JPanel panel_5_6 = new JPanel();
		panel_5_6.setBounds(412, 353, 285, 68);
		panel_1.add(panel_5_6);
		panel_5_6.setLayout(null);
		panel_5_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_6.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_4_4_2 = new JLabel("3\r\n");
		lblNewLabel_4_4_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_4_2.setBounds(136, 20, 12, 27);
		panel_5_6.add(lblNewLabel_4_4_2);
		
		JPanel panel_5_7 = new JPanel();
		panel_5_7.setBounds(412, 419, 285, 68);
		panel_1.add(panel_5_7);
		panel_5_7.setLayout(null);
		panel_5_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_7.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_4_4_3 = new JLabel("4");
		lblNewLabel_4_4_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_4_3.setBounds(136, 20, 12, 27);
		panel_5_7.add(lblNewLabel_4_4_3);
		
		JPanel panel_5_8 = new JPanel();
		panel_5_8.setBounds(412, 482, 285, 68);
		panel_1.add(panel_5_8);
		panel_5_8.setLayout(null);
		panel_5_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_8.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_4_4_4 = new JLabel("5");
		lblNewLabel_4_4_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_4_4.setBounds(136, 20, 12, 27);
		panel_5_8.add(lblNewLabel_4_4_4);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBounds(694, 162, 285, 68);
		panel_1.add(panel_5_1);
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new LineBorder(Color.BLUE));
		panel_5_1.setBackground(new Color(135, 206, 235));
		
		JLabel lblNewLabel_4_1 = new JLabel("Car Name\r\n");
		lblNewLabel_4_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(104, 20, 77, 27);
		panel_5_1.add(lblNewLabel_4_1);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBounds(978, 162, 285, 68);
		panel_1.add(panel_5_2);
		panel_5_2.setLayout(null);
		panel_5_2.setBorder(new LineBorder(Color.BLUE));
		panel_5_2.setBackground(new Color(135, 206, 235));
		
		JLabel lblNewLabel_4_2 = new JLabel("Licence Plate");
		lblNewLabel_4_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(93, 20, 99, 27);
		panel_5_2.add(lblNewLabel_4_2);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBounds(1263, 162, 235, 68);
		panel_1.add(panel_5_3);
		panel_5_3.setLayout(null);
		panel_5_3.setBorder(new LineBorder(Color.BLUE));
		panel_5_3.setBackground(new Color(135, 206, 235));
		
		JLabel lblNewLabel_4_3 = new JLabel("Last Maintenance");
		lblNewLabel_4_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_4_3.setBounds(46, 20, 143, 27);
		panel_5_3.add(lblNewLabel_4_3);
		
		JPanel panel_5_4_1 = new JPanel();
		panel_5_4_1.setLayout(null);
		panel_5_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_1.setBackground(Color.WHITE);
		panel_5_4_1.setBounds(694, 227, 285, 68);
		panel_1.add(panel_5_4_1);
		
		JPanel panel_5_4_2 = new JPanel();
		panel_5_4_2.setLayout(null);
		panel_5_4_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_2.setBackground(Color.WHITE);
		panel_5_4_2.setBounds(694, 288, 285, 68);
		panel_1.add(panel_5_4_2);
		
		JPanel panel_5_4_3 = new JPanel();
		panel_5_4_3.setLayout(null);
		panel_5_4_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_3.setBackground(Color.WHITE);
		panel_5_4_3.setBounds(694, 353, 285, 68);
		panel_1.add(panel_5_4_3);
		
		JPanel panel_5_4_4 = new JPanel();
		panel_5_4_4.setLayout(null);
		panel_5_4_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_4.setBackground(Color.WHITE);
		panel_5_4_4.setBounds(694, 419, 285, 68);
		panel_1.add(panel_5_4_4);
		
		JPanel panel_5_4_5 = new JPanel();
		panel_5_4_5.setLayout(null);
		panel_5_4_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_5.setBackground(Color.WHITE);
		panel_5_4_5.setBounds(694, 482, 285, 68);
		panel_1.add(panel_5_4_5);
		
		JPanel panel_5_4_6 = new JPanel();
		panel_5_4_6.setLayout(null);
		panel_5_4_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_6.setBackground(Color.WHITE);
		panel_5_4_6.setBounds(978, 227, 285, 68);
		panel_1.add(panel_5_4_6);
		
		JPanel panel_5_4_7 = new JPanel();
		panel_5_4_7.setLayout(null);
		panel_5_4_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_7.setBackground(Color.WHITE);
		panel_5_4_7.setBounds(978, 288, 285, 68);
		panel_1.add(panel_5_4_7);
		
		JPanel panel_5_4_8 = new JPanel();
		panel_5_4_8.setLayout(null);
		panel_5_4_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_8.setBackground(Color.WHITE);
		panel_5_4_8.setBounds(978, 353, 285, 68);
		panel_1.add(panel_5_4_8);
		
		JPanel panel_5_4_9 = new JPanel();
		panel_5_4_9.setLayout(null);
		panel_5_4_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_9.setBackground(Color.WHITE);
		panel_5_4_9.setBounds(978, 419, 285, 68);
		panel_1.add(panel_5_4_9);
		
		JPanel panel_5_4_10 = new JPanel();
		panel_5_4_10.setLayout(null);
		panel_5_4_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_10.setBackground(Color.WHITE);
		panel_5_4_10.setBounds(978, 482, 285, 68);
		panel_1.add(panel_5_4_10);
		
		JPanel panel_5_4_11 = new JPanel();
		panel_5_4_11.setLayout(null);
		panel_5_4_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_11.setBackground(Color.WHITE);
		panel_5_4_11.setBounds(1263, 227, 235, 68);
		panel_1.add(panel_5_4_11);
		
		JPanel panel_5_4_12 = new JPanel();
		panel_5_4_12.setLayout(null);
		panel_5_4_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_12.setBackground(Color.WHITE);
		panel_5_4_12.setBounds(1263, 288, 235, 68);
		panel_1.add(panel_5_4_12);
		
		JPanel panel_5_4_13 = new JPanel();
		panel_5_4_13.setLayout(null);
		panel_5_4_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_13.setBackground(Color.WHITE);
		panel_5_4_13.setBounds(1263, 353, 235, 68);
		panel_1.add(panel_5_4_13);
		
		JPanel panel_5_4_14 = new JPanel();
		panel_5_4_14.setLayout(null);
		panel_5_4_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_14.setBackground(Color.WHITE);
		panel_5_4_14.setBounds(1263, 419, 235, 68);
		panel_1.add(panel_5_4_14);
		
		JPanel panel_5_4_15 = new JPanel();
		panel_5_4_15.setLayout(null);
		panel_5_4_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5_4_15.setBackground(Color.WHITE);
		panel_5_4_15.setBounds(1263, 482, 235, 68);
		panel_1.add(panel_5_4_15);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MaintenanceMainMenuUI mainMenu = new MaintenanceMainMenuUI();
				mainMenu.initialize();
			}
		});
		btnBack.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(30, 23, 102, 41);
		panel_1.add(btnBack);
		ImageIcon imgBack = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(imgBack);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(431, 633, 1089, 164);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(0, 0, 216, 49);
		panel_3.add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Maintenance Details");
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3 = new JLabel("Licence plate:");
		lblNewLabel_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(224, 60, 170, 43);
		panel_3.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(344, 72, 170, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Planned date: ");
		lblNewLabel_3_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(596, 60, 170, 43);
		panel_3.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(722, 72, 170, 20);
		panel_3.add(textField_1);
		
		JButton btnNewButton = new JButton("Add to Schedule");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 16));
		btnNewButton.setBounds(877, 813, 152, 50);
		frame.getContentPane().add(btnNewButton);
		
		frame.setVisible(true);
	}
}
