import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class MaintenanceMainMenuUI {
	
	private JFrame frame = new JFrame();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaintenanceMainMenuUI window = new MaintenanceMainMenuUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MaintenanceMainMenuUI() {
		initialize();
	}

	protected void initialize() {
		JFrame frame = new JFrame();
	//	frame.setBounds(100, 100, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseChooseOperation = new JLabel("Please choose operation");
		lblPleaseChooseOperation.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 20));
		lblPleaseChooseOperation.setBounds(850, 255, 204, 32);
		frame.getContentPane().add(lblPleaseChooseOperation);
		
		JButton btnVerifyMaintenance = new JButton("Verify Maintenance");
		btnVerifyMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				VerifyMaintenanceUI verifyMenu = new VerifyMaintenanceUI();
				verifyMenu.initialize();
			}
		});
		btnVerifyMaintenance.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnVerifyMaintenance.setBackground(Color.LIGHT_GRAY);
		btnVerifyMaintenance.setBounds(783, 338, 338, 51);
		frame.getContentPane().add(btnVerifyMaintenance);
		
		JButton btnScheduleMaintenance = new JButton("Schedule Maintenance");
		btnScheduleMaintenance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ScheduleMaintenanceUI scheduleScreen = new ScheduleMaintenanceUI();
				scheduleScreen.initialize();
			}
		});
		btnScheduleMaintenance.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnScheduleMaintenance.setBackground(Color.LIGHT_GRAY);
		btnScheduleMaintenance.setBounds(783, 434, 338, 51);
		frame.getContentPane().add(btnScheduleMaintenance);
		
		JButton btnViewSchedule = new JButton("View Schedule");
		btnViewSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewScheduleUI viewSch = new ViewScheduleUI();
				viewSch.initialize();
			}
		});
		btnViewSchedule.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnViewSchedule.setBackground(Color.LIGHT_GRAY);
		btnViewSchedule.setBounds(783, 530, 338, 51);
		frame.getContentPane().add(btnViewSchedule);
		
		JLabel lblGoodAfternoonJohn = new JLabel("Good Afternoon, John Doe");
		lblGoodAfternoonJohn.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblGoodAfternoonJohn.setBounds(41, -48, 5110, 144);
		frame.getContentPane().add(lblGoodAfternoonJohn);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(10, 47, 5147, 21);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("16:35, 04/12/2021");
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(2109, 34, 3411, 182);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("16:35, 04/12/2021");
		lblNewLabel_2_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(1643, -26, 3000, 100);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton_5 = new JButton("New");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				LoginUI loginPage = new LoginUI();
				loginPage.initialize();
			}
		});
		btnNewButton_5.setBounds(47, 95, 51, 40);
		frame.getContentPane().add(btnNewButton_5);
		ImageIcon imgBack2 = new ImageIcon(this.getClass().getResource("logoutPic.jpg"));
		btnNewButton_5.setIcon(imgBack2);
		
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(41, 79, 51, 40);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("New");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UpdateProfileUI updatePage = new UpdateProfileUI();
				updatePage.initialize();
			}
		});
		btnNewButton_4.setBounds(129, 79, 51, 40);
		frame.getContentPane().add(btnNewButton_4);
		ImageIcon imgBack = new ImageIcon(this.getClass().getResource("profilePic.jpg"));
		btnNewButton_4.setIcon(imgBack);
		
		frame.setVisible(true);
	}
}
