import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ViewSellRecordUI {
	private JFrame frame = new JFrame();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSellRecordUI window = new ViewSellRecordUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ViewSellRecordUI() {
		initialize();
	}

	protected void initialize() {
		JFrame frame = new JFrame();
	//	frame.setBounds(100, 100, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Record Type: ");
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel.setBounds(288, 132, 120, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sale");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnNewButton.setBounds(418, 133, 94, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewBuyRecordUI buyRecordScreen = new ViewBuyRecordUI();
				buyRecordScreen.initialize();
			}
		});
		btnBuy.setBackground(Color.LIGHT_GRAY);
		btnBuy.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnBuy.setBounds(540, 133, 94, 31);
		frame.getContentPane().add(btnBuy);
		
		JLabel lblFilters = new JLabel("Filters: ");
		lblFilters.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblFilters.setBounds(1347, 132, 71, 32);
		frame.getContentPane().add(lblFilters);
		
		JButton btnShow = new JButton("Show");
		btnShow.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnShow.setBackground(Color.LIGHT_GRAY);
		btnShow.setBounds(1421, 133, 94, 31);
		frame.getContentPane().add(btnShow);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(288, 188, 1352, 678);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBuyRecords = new JLabel("Sell Records");
		lblBuyRecords.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 22));
		lblBuyRecords.setBounds(616, 17, 120, 32);
		panel.add(lblBuyRecords);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setForeground(new Color(135, 206, 235));
		panel_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1.setBounds(0, 60, 1352, 618);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1.setBounds(0, 52, 1352, 566);
		panel_1.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1.setBounds(0, 0, 241, 576);
		panel_1_1.add(panel_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1.setBounds(0, 0, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_1.setBounds(0, 56, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_2.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_2.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_2.setBounds(0, 112, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_2);
		
		JPanel panel_1_1_1_1_3 = new JPanel();
		panel_1_1_1_1_3.setLayout(null);
		panel_1_1_1_1_3.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_3.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_3.setBounds(0, 168, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_3);
		
		JPanel panel_1_1_1_1_4 = new JPanel();
		panel_1_1_1_1_4.setLayout(null);
		panel_1_1_1_1_4.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_4.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_4.setBounds(0, 225, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_4);
		
		JPanel panel_1_1_1_1_5 = new JPanel();
		panel_1_1_1_1_5.setLayout(null);
		panel_1_1_1_1_5.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_5.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_5.setBounds(0, 282, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_5);
		
		JPanel panel_1_1_1_1_6 = new JPanel();
		panel_1_1_1_1_6.setLayout(null);
		panel_1_1_1_1_6.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_6.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_6.setBounds(0, 339, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_6);
		
		JPanel panel_1_1_1_1_7 = new JPanel();
		panel_1_1_1_1_7.setLayout(null);
		panel_1_1_1_1_7.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_7.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_7.setBounds(0, 395, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_7);
		
		JPanel panel_1_1_1_1_8 = new JPanel();
		panel_1_1_1_1_8.setLayout(null);
		panel_1_1_1_1_8.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_8.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_8.setBounds(0, 450, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_8);
		
		JPanel panel_1_1_1_1_9 = new JPanel();
		panel_1_1_1_1_9.setLayout(null);
		panel_1_1_1_1_9.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_9.setBackground(new Color(135, 206, 235));
		panel_1_1_1_1_9.setBounds(0, 507, 241, 59);
		panel_1_1_1.add(panel_1_1_1_1_9);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_2.setBounds(237, 0, 1352, 566);
		panel_1_1.add(panel_1_1_2);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_2.setBackground(new Color(135, 206, 235));
		panel_1_1_1_2.setBounds(0, 0, 241, 576);
		panel_1_1_2.add(panel_1_1_1_2);
		
		JPanel panel_1_1_1_1_10 = new JPanel();
		panel_1_1_1_1_10.setForeground(new Color(245, 245, 245));
		panel_1_1_1_1_10.setLayout(null);
		panel_1_1_1_1_10.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_10.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_10.setBounds(0, 0, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_10);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_1_1.setBounds(0, 56, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_2_1 = new JPanel();
		panel_1_1_1_1_2_1.setLayout(null);
		panel_1_1_1_1_2_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_2_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_2_1.setBounds(0, 112, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_2_1);
		
		JPanel panel_1_1_1_1_3_1 = new JPanel();
		panel_1_1_1_1_3_1.setLayout(null);
		panel_1_1_1_1_3_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_3_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_3_1.setBounds(0, 168, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_3_1);
		
		JPanel panel_1_1_1_1_4_1 = new JPanel();
		panel_1_1_1_1_4_1.setLayout(null);
		panel_1_1_1_1_4_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_4_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_4_1.setBounds(0, 225, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_4_1);
		
		JPanel panel_1_1_1_1_5_1 = new JPanel();
		panel_1_1_1_1_5_1.setLayout(null);
		panel_1_1_1_1_5_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_5_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_5_1.setBounds(0, 282, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_5_1);
		
		JPanel panel_1_1_1_1_6_1 = new JPanel();
		panel_1_1_1_1_6_1.setLayout(null);
		panel_1_1_1_1_6_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_6_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_6_1.setBounds(0, 339, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_6_1);
		
		JPanel panel_1_1_1_1_7_1 = new JPanel();
		panel_1_1_1_1_7_1.setLayout(null);
		panel_1_1_1_1_7_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_7_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_7_1.setBounds(0, 395, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_7_1);
		
		JPanel panel_1_1_1_1_8_1 = new JPanel();
		panel_1_1_1_1_8_1.setLayout(null);
		panel_1_1_1_1_8_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_8_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_8_1.setBounds(0, 450, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_8_1);
		
		JPanel panel_1_1_1_1_9_1 = new JPanel();
		panel_1_1_1_1_9_1.setLayout(null);
		panel_1_1_1_1_9_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_9_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1_1_9_1.setBounds(0, 507, 241, 59);
		panel_1_1_1_2.add(panel_1_1_1_1_9_1);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_2_1.setBounds(238, 0, 876, 566);
		panel_1_1_2.add(panel_1_1_2_1);
		
		JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setLayout(null);
		panel_1_1_1_2_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_2_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1_2_1.setBounds(0, 0, 241, 576);
		panel_1_1_2_1.add(panel_1_1_1_2_1);
		
		JPanel panel_1_1_1_1_10_1 = new JPanel();
		panel_1_1_1_1_10_1.setLayout(null);
		panel_1_1_1_1_10_1.setForeground(new Color(245, 245, 245));
		panel_1_1_1_1_10_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_10_1.setBackground(Color.WHITE);
		panel_1_1_1_1_10_1.setBounds(0, 0, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_10_1);
		
		JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1_1.setBounds(0, 56, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_2_1_1 = new JPanel();
		panel_1_1_1_1_2_1_1.setLayout(null);
		panel_1_1_1_1_2_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_2_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_2_1_1.setBounds(0, 112, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_2_1_1);
		
		JPanel panel_1_1_1_1_3_1_1 = new JPanel();
		panel_1_1_1_1_3_1_1.setLayout(null);
		panel_1_1_1_1_3_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_3_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_3_1_1.setBounds(0, 168, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_3_1_1);
		
		JPanel panel_1_1_1_1_4_1_1 = new JPanel();
		panel_1_1_1_1_4_1_1.setLayout(null);
		panel_1_1_1_1_4_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_4_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_4_1_1.setBounds(0, 225, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_4_1_1);
		
		JPanel panel_1_1_1_1_5_1_1 = new JPanel();
		panel_1_1_1_1_5_1_1.setLayout(null);
		panel_1_1_1_1_5_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_5_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_5_1_1.setBounds(0, 282, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_5_1_1);
		
		JPanel panel_1_1_1_1_6_1_1 = new JPanel();
		panel_1_1_1_1_6_1_1.setLayout(null);
		panel_1_1_1_1_6_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_6_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_6_1_1.setBounds(0, 339, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_6_1_1);
		
		JPanel panel_1_1_1_1_7_1_1 = new JPanel();
		panel_1_1_1_1_7_1_1.setLayout(null);
		panel_1_1_1_1_7_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_7_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_7_1_1.setBounds(0, 395, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_7_1_1);
		
		JPanel panel_1_1_1_1_8_1_1 = new JPanel();
		panel_1_1_1_1_8_1_1.setLayout(null);
		panel_1_1_1_1_8_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_8_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_8_1_1.setBounds(0, 450, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_8_1_1);
		
		JPanel panel_1_1_1_1_9_1_1 = new JPanel();
		panel_1_1_1_1_9_1_1.setLayout(null);
		panel_1_1_1_1_9_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_9_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_9_1_1.setBounds(0, 507, 241, 59);
		panel_1_1_1_2_1.add(panel_1_1_1_1_9_1_1);
		
		JPanel panel_1_1_2_1_1 = new JPanel();
		panel_1_1_2_1_1.setLayout(null);
		panel_1_1_2_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_2_1_1.setBounds(238, 0, 638, 566);
		panel_1_1_2_1.add(panel_1_1_2_1_1);
		
		JPanel panel_1_1_1_2_1_1 = new JPanel();
		panel_1_1_1_2_1_1.setLayout(null);
		panel_1_1_1_2_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_2_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1_2_1_1.setBounds(0, 0, 638, 576);
		panel_1_1_2_1_1.add(panel_1_1_1_2_1_1);
		
		JPanel panel_1_1_1_1_10_1_1 = new JPanel();
		panel_1_1_1_1_10_1_1.setLayout(null);
		panel_1_1_1_1_10_1_1.setForeground(new Color(245, 245, 245));
		panel_1_1_1_1_10_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_10_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_10_1_1.setBounds(0, 0, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_10_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1_1_1.setBounds(0, 56, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_2_1_1_1 = new JPanel();
		panel_1_1_1_1_2_1_1_1.setLayout(null);
		panel_1_1_1_1_2_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_2_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_2_1_1_1.setBounds(0, 112, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_2_1_1_1);
		
		JPanel panel_1_1_1_1_3_1_1_1 = new JPanel();
		panel_1_1_1_1_3_1_1_1.setLayout(null);
		panel_1_1_1_1_3_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_3_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_3_1_1_1.setBounds(0, 168, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_3_1_1_1);
		
		JPanel panel_1_1_1_1_4_1_1_1 = new JPanel();
		panel_1_1_1_1_4_1_1_1.setLayout(null);
		panel_1_1_1_1_4_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_4_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_4_1_1_1.setBounds(0, 225, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_4_1_1_1);
		
		JPanel panel_1_1_1_1_5_1_1_1 = new JPanel();
		panel_1_1_1_1_5_1_1_1.setLayout(null);
		panel_1_1_1_1_5_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_5_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_5_1_1_1.setBounds(0, 282, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_5_1_1_1);
		
		JPanel panel_1_1_1_1_6_1_1_1 = new JPanel();
		panel_1_1_1_1_6_1_1_1.setLayout(null);
		panel_1_1_1_1_6_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_6_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_6_1_1_1.setBounds(0, 339, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_6_1_1_1);
		
		JPanel panel_1_1_1_1_7_1_1_1 = new JPanel();
		panel_1_1_1_1_7_1_1_1.setLayout(null);
		panel_1_1_1_1_7_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_7_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_7_1_1_1.setBounds(0, 395, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_7_1_1_1);
		
		JPanel panel_1_1_1_1_8_1_1_1 = new JPanel();
		panel_1_1_1_1_8_1_1_1.setLayout(null);
		panel_1_1_1_1_8_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_8_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_8_1_1_1.setBounds(0, 450, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_8_1_1_1);
		
		JPanel panel_1_1_1_1_9_1_1_1 = new JPanel();
		panel_1_1_1_1_9_1_1_1.setLayout(null);
		panel_1_1_1_1_9_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_9_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_9_1_1_1.setBounds(0, 507, 189, 59);
		panel_1_1_1_2_1_1.add(panel_1_1_1_1_9_1_1_1);
		
		JPanel panel_1_1_2_1_1_1 = new JPanel();
		panel_1_1_2_1_1_1.setLayout(null);
		panel_1_1_2_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_2_1_1_1.setBounds(186, 0, 452, 566);
		panel_1_1_1_2_1_1.add(panel_1_1_2_1_1_1);
		
		JPanel panel_1_1_1_2_1_1_1 = new JPanel();
		panel_1_1_1_2_1_1_1.setLayout(null);
		panel_1_1_1_2_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_2_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1_2_1_1_1.setBounds(0, 0, 241, 576);
		panel_1_1_2_1_1_1.add(panel_1_1_1_2_1_1_1);
		
		JPanel panel_1_1_1_1_10_1_1_1 = new JPanel();
		panel_1_1_1_1_10_1_1_1.setLayout(null);
		panel_1_1_1_1_10_1_1_1.setForeground(new Color(245, 245, 245));
		panel_1_1_1_1_10_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_10_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_10_1_1_1.setBounds(0, 0, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_10_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1_1_1_1.setBounds(0, 56, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_2_1_1_1_1 = new JPanel();
		panel_1_1_1_1_2_1_1_1_1.setLayout(null);
		panel_1_1_1_1_2_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_2_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_2_1_1_1_1.setBounds(0, 112, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_2_1_1_1_1);
		
		JPanel panel_1_1_1_1_3_1_1_1_1 = new JPanel();
		panel_1_1_1_1_3_1_1_1_1.setLayout(null);
		panel_1_1_1_1_3_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_3_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_3_1_1_1_1.setBounds(0, 168, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_3_1_1_1_1);
		
		JPanel panel_1_1_1_1_4_1_1_1_1 = new JPanel();
		panel_1_1_1_1_4_1_1_1_1.setLayout(null);
		panel_1_1_1_1_4_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_4_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_4_1_1_1_1.setBounds(0, 225, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_4_1_1_1_1);
		
		JPanel panel_1_1_1_1_5_1_1_1_1 = new JPanel();
		panel_1_1_1_1_5_1_1_1_1.setLayout(null);
		panel_1_1_1_1_5_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_5_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_5_1_1_1_1.setBounds(0, 282, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_5_1_1_1_1);
		
		JPanel panel_1_1_1_1_6_1_1_1_1 = new JPanel();
		panel_1_1_1_1_6_1_1_1_1.setLayout(null);
		panel_1_1_1_1_6_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_6_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_6_1_1_1_1.setBounds(0, 339, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_6_1_1_1_1);
		
		JPanel panel_1_1_1_1_7_1_1_1_1 = new JPanel();
		panel_1_1_1_1_7_1_1_1_1.setLayout(null);
		panel_1_1_1_1_7_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_7_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_7_1_1_1_1.setBounds(0, 395, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_7_1_1_1_1);
		
		JPanel panel_1_1_1_1_8_1_1_1_1 = new JPanel();
		panel_1_1_1_1_8_1_1_1_1.setLayout(null);
		panel_1_1_1_1_8_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_8_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_8_1_1_1_1.setBounds(0, 450, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_8_1_1_1_1);
		
		JPanel panel_1_1_1_1_9_1_1_1_1 = new JPanel();
		panel_1_1_1_1_9_1_1_1_1.setLayout(null);
		panel_1_1_1_1_9_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_9_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_9_1_1_1_1.setBounds(0, 507, 241, 59);
		panel_1_1_1_2_1_1_1.add(panel_1_1_1_1_9_1_1_1_1);
		
		JPanel panel_1_1_2_1_1_1_1 = new JPanel();
		panel_1_1_2_1_1_1_1.setLayout(null);
		panel_1_1_2_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_2_1_1_1_1.setBounds(239, 0, 213, 566);
		panel_1_1_2_1_1_1.add(panel_1_1_2_1_1_1_1);
		
		JPanel panel_1_1_1_2_1_1_1_1 = new JPanel();
		panel_1_1_1_2_1_1_1_1.setLayout(null);
		panel_1_1_1_2_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_2_1_1_1_1.setBackground(new Color(135, 206, 235));
		panel_1_1_1_2_1_1_1_1.setBounds(0, 0, 241, 576);
		panel_1_1_2_1_1_1_1.add(panel_1_1_1_2_1_1_1_1);
		
		JPanel panel_1_1_1_1_10_1_1_1_1 = new JPanel();
		panel_1_1_1_1_10_1_1_1_1.setLayout(null);
		panel_1_1_1_1_10_1_1_1_1.setForeground(new Color(245, 245, 245));
		panel_1_1_1_1_10_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_10_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_10_1_1_1_1.setBounds(0, 0, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_10_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_1_1_1_1_1_1.setBounds(0, 56, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_2_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_2_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_2_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_2_1_1_1_1_1.setBounds(0, 112, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_2_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_3_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_3_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_3_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_3_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_3_1_1_1_1_1.setBounds(0, 168, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_3_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_4_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_4_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_4_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_4_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_4_1_1_1_1_1.setBounds(0, 225, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_4_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_5_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_5_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_5_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_5_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_5_1_1_1_1_1.setBounds(0, 282, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_5_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_6_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_6_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_6_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_6_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_6_1_1_1_1_1.setBounds(0, 339, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_6_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_7_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_7_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_7_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_7_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_7_1_1_1_1_1.setBounds(0, 395, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_7_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_8_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_8_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_8_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_8_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_8_1_1_1_1_1.setBounds(0, 450, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_8_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_9_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_9_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_9_1_1_1_1_1.setBorder(new LineBorder(new Color(169, 169, 169), 3));
		panel_1_1_1_1_9_1_1_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1_1_9_1_1_1_1_1.setBounds(0, 507, 212, 59);
		panel_1_1_1_2_1_1_1_1.add(panel_1_1_1_1_9_1_1_1_1_1);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 22));
		lblDate.setBounds(93, 10, 120, 32);
		panel_1.add(lblDate);
		
		JLabel lblCarName = new JLabel("Car Name");
		lblCarName.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 22));
		lblCarName.setBounds(306, 10, 120, 32);
		panel_1.add(lblCarName);
		
		JLabel lblLicence = new JLabel("Licence");
		lblLicence.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 22));
		lblLicence.setBounds(539, 10, 120, 32);
		panel_1.add(lblLicence);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 22));
		lblPrice.setBounds(771, 10, 120, 32);
		panel_1.add(lblPrice);
		
		JLabel lblSalesperson = new JLabel("Salesperson");
		lblSalesperson.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 22));
		lblSalesperson.setBounds(958, 10, 120, 32);
		panel_1.add(lblSalesperson);
		
		JLabel lblSeller = new JLabel("Customer");
		lblSeller.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 22));
		lblSeller.setBounds(1202, 10, 120, 32);
		panel_1.add(lblSeller);
		
		JButton btnShow_1 = new JButton("");
		btnShow_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnShow_1.setBackground(Color.LIGHT_GRAY);
		btnShow_1.setBounds(1538, 132, 42, 32);
		frame.getContentPane().add(btnShow_1);
		ImageIcon img = new ImageIcon(this.getClass().getResource("resetPic.jpg"));
		btnShow_1.setIcon(img);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainMenuUI mainPage = new MainMenuUI();
				mainPage.initialize();
			}
		});
		btnBack.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(37, 15, 102, 41);
		frame.getContentPane().add(btnBack);
		ImageIcon imgBack = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(imgBack);
			
		frame.setVisible(true);
	}
}
