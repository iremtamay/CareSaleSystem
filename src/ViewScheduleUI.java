import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewScheduleUI {
	
	private JFrame frame = new JFrame();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewScheduleUI window = new ViewScheduleUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewScheduleUI() {
		initialize();
	}

	protected void initialize() {
		JFrame frame = new JFrame();
	//	frame.setBounds(100, 100, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1929, 65);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel);
		
		JLabel lblViewSchedule = new JLabel("View Schedule");
		lblViewSchedule.setBounds(30, 10, 173, 45);
		panel.add(lblViewSchedule);
		lblViewSchedule.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MaintenanceMainMenuUI mainMenu = new MaintenanceMainMenuUI();
				mainMenu.initialize();
			}
		});
		btnBack.setBounds(30, 95, 102, 41);
		btnBack.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnBack);
		ImageIcon img = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(img);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(268, 276, 1368, 420);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1.setBounds(0, 62, 1368, 355);
		panel_1.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_1.setBounds(0, 60, 1193, 296);
		panel_1_1.add(panel_1_1_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2.setBounds(0, 0, 173, 391);
		panel_1_1_1.add(panel_1_1_2);
		
		JPanel panel_1_1_2_7 = new JPanel();
		panel_1_1_2_7.setLayout(null);
		panel_1_1_2_7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2_7.setBounds(0, 0, 173, 390);
		panel_1_1_2.add(panel_1_1_2_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(0, 0, 173, 101);
		panel_1_1_2_7.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTime_1 = new JLabel("09.00-12.00");
		lblTime_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblTime_1.setBounds(22, 26, 151, 45);
		panel_2.add(lblTime_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_1.setBounds(0, 97, 173, 101);
		panel_1_1_2_7.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblTime_1_1 = new JLabel("12.00-15.00");
		lblTime_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblTime_1_1.setBounds(22, 25, 151, 45);
		panel_2_1.add(lblTime_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_2.setBounds(0, 195, 173, 108);
		panel_1_1_2_7.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblTime_1_1_1 = new JLabel("15.00-18.00");
		lblTime_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblTime_1_1_1.setBounds(22, 32, 151, 45);
		panel_2_2.add(lblTime_1_1_1);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2_1.setBounds(169, 0, 173, 298);
		panel_1_1_1.add(panel_1_1_2_1);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_4.setBounds(0, 0, 173, 101);
		panel_1_1_2_1.add(panel_2_4);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_5.setBounds(0, 97, 173, 101);
		panel_1_1_2_1.add(panel_2_5);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_6.setBounds(0, 194, 173, 104);
		panel_1_1_2_1.add(panel_2_6);
		
		JPanel panel_1_1_2_2 = new JPanel();
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2_2.setBounds(340, 0, 173, 298);
		panel_1_1_1.add(panel_1_1_2_2);
		
		JPanel panel_2_8 = new JPanel();
		panel_2_8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_8.setBounds(0, 0, 173, 101);
		panel_1_1_2_2.add(panel_2_8);
		panel_2_8.setLayout(null);
		
		JLabel lblabc = new JLabel("82ABC01");
		lblabc.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblabc.setBounds(29, 24, 116, 45);
		panel_2_8.add(lblabc);
		
		JPanel panel_2_9 = new JPanel();
		panel_2_9.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_9.setBounds(0, 98, 173, 101);
		panel_1_1_2_2.add(panel_2_9);
		
		JPanel panel_2_10 = new JPanel();
		panel_2_10.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_10.setBounds(0, 195, 173, 103);
		panel_1_1_2_2.add(panel_2_10);
		
		JPanel panel_1_1_2_3 = new JPanel();
		panel_1_1_2_3.setLayout(null);
		panel_1_1_2_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2_3.setBounds(511, 0, 173, 298);
		panel_1_1_1.add(panel_1_1_2_3);
		
		JPanel panel_2_12 = new JPanel();
		panel_2_12.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_12.setBounds(0, 0, 173, 101);
		panel_1_1_2_3.add(panel_2_12);
		
		JPanel panel_2_13 = new JPanel();
		panel_2_13.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_13.setBounds(0, 98, 173, 101);
		panel_1_1_2_3.add(panel_2_13);
		
		JPanel panel_2_14 = new JPanel();
		panel_2_14.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_14.setBounds(0, 196, 173, 102);
		panel_1_1_2_3.add(panel_2_14);
		
		JPanel panel_1_1_2_4 = new JPanel();
		panel_1_1_2_4.setLayout(null);
		panel_1_1_2_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2_4.setBounds(680, 0, 173, 298);
		panel_1_1_1.add(panel_1_1_2_4);
		
		JPanel panel_2_16 = new JPanel();
		panel_2_16.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_16.setBounds(0, 0, 173, 101);
		panel_1_1_2_4.add(panel_2_16);
		
		JPanel panel_2_17 = new JPanel();
		panel_2_17.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_17.setBounds(0, 99, 173, 101);
		panel_1_1_2_4.add(panel_2_17);
		panel_2_17.setLayout(null);
		
		JLabel lblabc_2 = new JLabel("82ABC02");
		lblabc_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblabc_2.setBounds(33, 28, 116, 45);
		panel_2_17.add(lblabc_2);
		
		JPanel panel_2_18 = new JPanel();
		panel_2_18.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_18.setBounds(0, 195, 173, 103);
		panel_1_1_2_4.add(panel_2_18);
		
		JPanel panel_1_1_2_5 = new JPanel();
		panel_1_1_2_5.setLayout(null);
		panel_1_1_2_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2_5.setBounds(851, 0, 173, 298);
		panel_1_1_1.add(panel_1_1_2_5);
		
		JPanel panel_2_20 = new JPanel();
		panel_2_20.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_20.setBounds(0, 0, 173, 101);
		panel_1_1_2_5.add(panel_2_20);
		
		JPanel panel_2_21 = new JPanel();
		panel_2_21.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_21.setBounds(0, 99, 173, 101);
		panel_1_1_2_5.add(panel_2_21);
		
		JPanel panel_2_22 = new JPanel();
		panel_2_22.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_22.setBounds(0, 196, 173, 102);
		panel_1_1_2_5.add(panel_2_22);
		
		JPanel panel_1_1_2_6 = new JPanel();
		panel_1_1_2_6.setLayout(null);
		panel_1_1_2_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2_6.setBounds(1021, 0, 173, 298);
		panel_1_1_1.add(panel_1_1_2_6);
		
		JPanel panel_2_24 = new JPanel();
		panel_2_24.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_24.setBounds(0, 0, 173, 101);
		panel_1_1_2_6.add(panel_2_24);
		
		JPanel panel_2_25 = new JPanel();
		panel_2_25.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_25.setBounds(0, 99, 173, 101);
		panel_1_1_2_6.add(panel_2_25);
		
		JPanel panel_2_26 = new JPanel();
		panel_2_26.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_26.setBounds(0, 198, 173, 101);
		panel_1_1_2_6.add(panel_2_26);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblTime.setBounds(51, 10, 72, 45);
		panel_1_1.add(lblTime);
		
		JLabel lblMon = new JLabel("Mon.");
		lblMon.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblMon.setBounds(222, 10, 72, 45);
		panel_1_1.add(lblMon);
		
		JLabel lblTue = new JLabel("Tue.");
		lblTue.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblTue.setBounds(392, 10, 72, 45);
		panel_1_1.add(lblTue);
		
		JLabel lblWed = new JLabel("Wed.");
		lblWed.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblWed.setBounds(570, 10, 72, 45);
		panel_1_1.add(lblWed);
		
		JLabel lblThu = new JLabel("Thu.");
		lblThu.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblThu.setBounds(731, 10, 72, 45);
		panel_1_1.add(lblThu);
		
		JLabel lblFri = new JLabel("Fri.");
		lblFri.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblFri.setBounds(912, 10, 72, 45);
		panel_1_1.add(lblFri);
		
		JLabel lblSat = new JLabel("Sat.");
		lblSat.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblSat.setBounds(1075, 10, 72, 45);
		panel_1_1.add(lblSat);
		
		JPanel panel_2_24_1 = new JPanel();
		panel_2_24_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_24_1.setBounds(1189, 60, 179, 101);
		panel_1_1.add(panel_2_24_1);
		
		JPanel panel_2_24_1_1 = new JPanel();
		panel_2_24_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_24_1_1.setBounds(1189, 159, 179, 101);
		panel_1_1.add(panel_2_24_1_1);
		
		JPanel panel_2_24_1_2 = new JPanel();
		panel_2_24_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_24_1_2.setBounds(1189, 258, 179, 101);
		panel_1_1.add(panel_2_24_1_2);
		
		JLabel lblSun = new JLabel("Sun.");
		lblSun.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblSun.setBounds(1250, 10, 72, 45);
		panel_1_1.add(lblSun);
		
		JLabel lblSchedule = new JLabel("Schedule");
		lblSchedule.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblSchedule.setBounds(607, 10, 173, 45);
		panel_1.add(lblSchedule);
		
		frame.setVisible(true);
	}

}
