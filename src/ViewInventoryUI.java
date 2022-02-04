import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewInventoryUI {

	private JFrame frame = new JFrame();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewInventoryUI window = new ViewInventoryUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ViewInventoryUI() {
		initialize();
	}

	protected void initialize() {
		JFrame frame = new JFrame();
		frame.getContentPane().setLocation(-1020, -629);
	//	frame.setBounds(100, 100, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(0, 0, 1933, 65);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Records");
		lblNewLabel.setBounds(27, 10, 173, 45);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		
		JLabel lblFilters = new JLabel("Filters:");
		lblFilters.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblFilters.setBounds(62, 145, 61, 45);
		frame.getContentPane().add(lblFilters);
		
		JButton btnShow = new JButton("Show");
		btnShow.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnShow.setBackground(Color.LIGHT_GRAY);
		btnShow.setBounds(136, 152, 94, 31);
		frame.getContentPane().add(btnShow);
		
		JButton btnShow_1 = new JButton("");
		btnShow_1.setBounds(247, 151, 42, 32);
		frame.getContentPane().add(btnShow_1);
		btnShow_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnShow_1.setBackground(Color.LIGHT_GRAY);
		ImageIcon img = new ImageIcon(this.getClass().getResource("resetPic.jpg"));
		btnShow_1.setIcon(img);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(62, 201, 227, 172);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1.setBounds(0, 39, 227, 133);
		panel_1.add(panel_1_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 237, 133);
		panel_1_1.add(btnNewButton);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("carPic.jpg"));
		btnNewButton.setIcon(img2);
		
		JLabel lblCarName = new JLabel("Car Name");
		lblCarName.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName.setBounds(71, 0, 84, 45);
		panel_1.add(lblCarName);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_2.setBackground(new Color(135, 206, 235));
		panel_1_2.setBounds(369, 201, 227, 172);
		frame.getContentPane().add(panel_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_1.setBounds(0, 39, 227, 133);
		panel_1_2.add(panel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 0, 237, 133);
		panel_1_1_1.add(btnNewButton_1);
		btnNewButton_1.setIcon(img2);
		
		JLabel lblCarName_1 = new JLabel("Car Name");
		lblCarName_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_1.setBounds(71, 0, 84, 45);
		panel_1_2.add(lblCarName_1);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_3.setBackground(new Color(135, 206, 235));
		panel_1_3.setBounds(678, 201, 227, 172);
		frame.getContentPane().add(panel_1_3);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_2.setBounds(0, 39, 227, 133);
		panel_1_3.add(panel_1_1_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 0, 237, 133);
		panel_1_1_2.add(btnNewButton_2);
		btnNewButton_2.setIcon(img2);
		
		JLabel lblCarName_2 = new JLabel("Car Name");
		lblCarName_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_2.setBounds(71, 0, 84, 45);
		panel_1_3.add(lblCarName_2);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_4.setBackground(new Color(135, 206, 235));
		panel_1_4.setBounds(998, 201, 227, 172);
		frame.getContentPane().add(panel_1_4);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_3.setBounds(0, 39, 227, 133);
		panel_1_4.add(panel_1_1_3);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(0, 0, 237, 133);
		panel_1_1_3.add(btnNewButton_3);
		btnNewButton_3.setIcon(img2);
		
		JLabel lblCarName_3 = new JLabel("Car Name");
		lblCarName_3.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_3.setBounds(71, 0, 84, 45);
		panel_1_4.add(lblCarName_3);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_5.setBackground(new Color(135, 206, 235));
		panel_1_5.setBounds(1309, 201, 227, 172);
		frame.getContentPane().add(panel_1_5);
		
		JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setLayout(null);
		panel_1_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_4.setBounds(0, 39, 227, 133);
		panel_1_5.add(panel_1_1_4);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(0, 0, 237, 133);
		panel_1_1_4.add(btnNewButton_4);
		btnNewButton_4.setIcon(img2);
		
		JLabel lblCarName_4 = new JLabel("Car Name");
		lblCarName_4.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_4.setBounds(71, 0, 84, 45);
		panel_1_5.add(lblCarName_4);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setLayout(null);
		panel_1_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_6.setBackground(new Color(135, 206, 235));
		panel_1_6.setBounds(62, 409, 227, 172);
		frame.getContentPane().add(panel_1_6);
		
		JPanel panel_1_1_5 = new JPanel();
		panel_1_1_5.setLayout(null);
		panel_1_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_5.setBounds(0, 39, 227, 133);
		panel_1_6.add(panel_1_1_5);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(0, 0, 237, 133);
		panel_1_1_5.add(btnNewButton_5);
		btnNewButton_5.setIcon(img2);
		
		JLabel lblCarName_5 = new JLabel("Car Name");
		lblCarName_5.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_5.setBounds(71, 0, 84, 45);
		panel_1_6.add(lblCarName_5);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setLayout(null);
		panel_1_7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_7.setBackground(new Color(135, 206, 235));
		panel_1_7.setBounds(369, 409, 227, 172);
		frame.getContentPane().add(panel_1_7);
		
		JPanel panel_1_1_6 = new JPanel();
		panel_1_1_6.setLayout(null);
		panel_1_1_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_6.setBounds(0, 39, 227, 133);
		panel_1_7.add(panel_1_1_6);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(0, 0, 237, 133);
		panel_1_1_6.add(btnNewButton_6);
		btnNewButton_6.setIcon(img2);
		
		JLabel lblCarName_6 = new JLabel("Car Name");
		lblCarName_6.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_6.setBounds(71, 0, 84, 45);
		panel_1_7.add(lblCarName_6);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setLayout(null);
		panel_1_8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_8.setBackground(new Color(135, 206, 235));
		panel_1_8.setBounds(678, 409, 227, 172);
		frame.getContentPane().add(panel_1_8);
		
		JPanel panel_1_1_7 = new JPanel();
		panel_1_1_7.setLayout(null);
		panel_1_1_7.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_7.setBounds(0, 39, 227, 133);
		panel_1_8.add(panel_1_1_7);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(0, 0, 237, 133);
		panel_1_1_7.add(btnNewButton_7);
		btnNewButton_7.setIcon(img2);
		
		JLabel lblCarName_7 = new JLabel("Car Name");
		lblCarName_7.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_7.setBounds(71, 0, 84, 45);
		panel_1_8.add(lblCarName_7);
		
		JPanel panel_1_9 = new JPanel();
		panel_1_9.setLayout(null);
		panel_1_9.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_9.setBackground(new Color(135, 206, 235));
		panel_1_9.setBounds(998, 409, 227, 172);
		frame.getContentPane().add(panel_1_9);
		
		JPanel panel_1_1_8 = new JPanel();
		panel_1_1_8.setLayout(null);
		panel_1_1_8.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_8.setBounds(0, 39, 227, 133);
		panel_1_9.add(panel_1_1_8);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(0, 0, 237, 133);
		panel_1_1_8.add(btnNewButton_8);
		btnNewButton_8.setIcon(img2);
		
		JLabel lblCarName_8 = new JLabel("Car Name");
		lblCarName_8.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_8.setBounds(71, 0, 84, 45);
		panel_1_9.add(lblCarName_8);
		
		JPanel panel_1_10 = new JPanel();
		panel_1_10.setLayout(null);
		panel_1_10.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_10.setBackground(new Color(135, 206, 235));
		panel_1_10.setBounds(1309, 409, 227, 172);
		frame.getContentPane().add(panel_1_10);
		
		JPanel panel_1_1_9 = new JPanel();
		panel_1_1_9.setLayout(null);
		panel_1_1_9.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_9.setBounds(0, 39, 227, 133);
		panel_1_10.add(panel_1_1_9);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(0, 0, 237, 133);
		panel_1_1_9.add(btnNewButton_9);
		btnNewButton_9.setIcon(img2);
		
		JLabel lblCarName_9 = new JLabel("Car Name");
		lblCarName_9.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_9.setBounds(71, 0, 84, 45);
		panel_1_10.add(lblCarName_9);
		
		JPanel panel_1_11 = new JPanel();
		panel_1_11.setLayout(null);
		panel_1_11.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_11.setBackground(new Color(135, 206, 235));
		panel_1_11.setBounds(62, 613, 227, 172);
		frame.getContentPane().add(panel_1_11);
		
		JPanel panel_1_1_10 = new JPanel();
		panel_1_1_10.setLayout(null);
		panel_1_1_10.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_10.setBounds(0, 39, 227, 133);
		panel_1_11.add(panel_1_1_10);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(0, 0, 237, 133);
		panel_1_1_10.add(btnNewButton_10);
		btnNewButton_10.setIcon(img2);
		
		JLabel lblCarName_10 = new JLabel("Car Name");
		lblCarName_10.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_10.setBounds(71, 0, 84, 45);
		panel_1_11.add(lblCarName_10);
		
		JPanel panel_1_12 = new JPanel();
		panel_1_12.setLayout(null);
		panel_1_12.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_12.setBackground(new Color(135, 206, 235));
		panel_1_12.setBounds(369, 613, 227, 172);
		frame.getContentPane().add(panel_1_12);
		
		JPanel panel_1_1_11 = new JPanel();
		panel_1_1_11.setLayout(null);
		panel_1_1_11.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_11.setBounds(0, 39, 227, 133);
		panel_1_12.add(panel_1_1_11);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(0, 0, 237, 133);
		panel_1_1_11.add(btnNewButton_11);
		btnNewButton_11.setIcon(img2);
		
		JLabel lblCarName_11 = new JLabel("Car Name");
		lblCarName_11.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_11.setBounds(71, 0, 84, 45);
		panel_1_12.add(lblCarName_11);
		
		JPanel panel_1_13 = new JPanel();
		panel_1_13.setLayout(null);
		panel_1_13.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_13.setBackground(new Color(135, 206, 235));
		panel_1_13.setBounds(678, 613, 227, 172);
		frame.getContentPane().add(panel_1_13);
		
		JPanel panel_1_1_12 = new JPanel();
		panel_1_1_12.setLayout(null);
		panel_1_1_12.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_12.setBounds(0, 39, 227, 133);
		panel_1_13.add(panel_1_1_12);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(0, 0, 237, 133);
		panel_1_1_12.add(btnNewButton_12);
		btnNewButton_12.setIcon(img2);
		
		JLabel lblCarName_12 = new JLabel("Car Name");
		lblCarName_12.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_12.setBounds(71, 0, 84, 45);
		panel_1_13.add(lblCarName_12);
		
		JPanel panel_1_14 = new JPanel();
		panel_1_14.setLayout(null);
		panel_1_14.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_14.setBackground(new Color(135, 206, 235));
		panel_1_14.setBounds(998, 613, 227, 172);
		frame.getContentPane().add(panel_1_14);
		
		JPanel panel_1_1_13 = new JPanel();
		panel_1_1_13.setLayout(null);
		panel_1_1_13.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_13.setBounds(0, 39, 227, 133);
		panel_1_14.add(panel_1_1_13);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(0, 0, 237, 133);
		panel_1_1_13.add(btnNewButton_13);
		btnNewButton_13.setIcon(img2);
		
		JLabel lblCarName_13 = new JLabel("Car Name");
		lblCarName_13.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_13.setBounds(71, 0, 84, 45);
		panel_1_14.add(lblCarName_13);
		
		JPanel panel_1_15 = new JPanel();
		panel_1_15.setLayout(null);
		panel_1_15.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_15.setBackground(new Color(135, 206, 235));
		panel_1_15.setBounds(1309, 613, 227, 172);
		frame.getContentPane().add(panel_1_15);
		
		JPanel panel_1_1_14 = new JPanel();
		panel_1_1_14.setLayout(null);
		panel_1_1_14.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_14.setBounds(0, 39, 227, 133);
		panel_1_15.add(panel_1_1_14);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(0, 0, 237, 133);
		panel_1_1_14.add(btnNewButton_14);
		btnNewButton_14.setIcon(img2);
		
		JLabel lblCarName_14 = new JLabel("Car Name");
		lblCarName_14.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_14.setBounds(71, 0, 84, 45);
		panel_1_15.add(lblCarName_14);
		
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
		btnBack.setBounds(30, 78, 102, 41);
		frame.getContentPane().add(btnBack);
		ImageIcon imgBack = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(imgBack);
		
		JPanel panel_1_5_1 = new JPanel();
		panel_1_5_1.setLayout(null);
		panel_1_5_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_5_1.setBackground(new Color(135, 206, 235));
		panel_1_5_1.setBounds(1623, 201, 227, 172);
		frame.getContentPane().add(panel_1_5_1);
		
		JPanel panel_1_1_4_1 = new JPanel();
		panel_1_1_4_1.setLayout(null);
		panel_1_1_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_4_1.setBounds(0, 39, 227, 133);
		panel_1_5_1.add(panel_1_1_4_1);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setBounds(0, 0, 237, 133);
		panel_1_1_4_1.add(btnNewButton_4_1);
		btnNewButton_4_1.setIcon(img2);
		
		JLabel lblCarName_4_1 = new JLabel("Car Name");
		lblCarName_4_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_4_1.setBounds(71, 0, 84, 45);
		panel_1_5_1.add(lblCarName_4_1);
		
		JPanel panel_1_10_1 = new JPanel();
		panel_1_10_1.setLayout(null);
		panel_1_10_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_10_1.setBackground(new Color(135, 206, 235));
		panel_1_10_1.setBounds(1623, 409, 227, 172);
		frame.getContentPane().add(panel_1_10_1);
		
		JPanel panel_1_1_9_1 = new JPanel();
		panel_1_1_9_1.setLayout(null);
		panel_1_1_9_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_9_1.setBounds(0, 39, 227, 133);
		panel_1_10_1.add(panel_1_1_9_1);
		
		JButton btnNewButton_9_1 = new JButton("New button");
		btnNewButton_9_1.setBounds(0, 0, 237, 133);
		panel_1_1_9_1.add(btnNewButton_9_1);
		btnNewButton_9_1.setIcon(img2);
		
		JLabel lblCarName_9_1 = new JLabel("Car Name");
		lblCarName_9_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_9_1.setBounds(71, 0, 84, 45);
		panel_1_10_1.add(lblCarName_9_1);
		
		JPanel panel_1_15_1 = new JPanel();
		panel_1_15_1.setLayout(null);
		panel_1_15_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_15_1.setBackground(new Color(135, 206, 235));
		panel_1_15_1.setBounds(1623, 613, 227, 172);
		frame.getContentPane().add(panel_1_15_1);
		
		JPanel panel_1_1_14_1 = new JPanel();
		panel_1_1_14_1.setLayout(null);
		panel_1_1_14_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_14_1.setBounds(0, 39, 227, 133);
		panel_1_15_1.add(panel_1_1_14_1);
		
		JButton btnNewButton_14_1 = new JButton("New button");
		btnNewButton_14_1.setBounds(0, 0, 237, 133);
		panel_1_1_14_1.add(btnNewButton_14_1);
		btnNewButton_14_1.setIcon(img2);
		
		JLabel lblCarName_14_1 = new JLabel("Car Name");
		lblCarName_14_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_14_1.setBounds(71, 0, 84, 45);
		panel_1_15_1.add(lblCarName_14_1);
		
		JPanel panel_1_11_1 = new JPanel();
		panel_1_11_1.setLayout(null);
		panel_1_11_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_11_1.setBackground(new Color(135, 206, 235));
		panel_1_11_1.setBounds(62, 817, 227, 172);
		frame.getContentPane().add(panel_1_11_1);
		
		JPanel panel_1_1_10_1 = new JPanel();
		panel_1_1_10_1.setLayout(null);
		panel_1_1_10_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_10_1.setBounds(0, 39, 227, 133);
		panel_1_11_1.add(panel_1_1_10_1);
		
		JButton btnNewButton_10_1 = new JButton("New button");
		btnNewButton_10_1.setBounds(0, 0, 237, 133);
		panel_1_1_10_1.add(btnNewButton_10_1);
		btnNewButton_10_1.setIcon(img2);
		
		JLabel lblCarName_10_1 = new JLabel("Car Name");
		lblCarName_10_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_10_1.setBounds(71, 0, 84, 45);
		panel_1_11_1.add(lblCarName_10_1);
		
		JPanel panel_1_12_1 = new JPanel();
		panel_1_12_1.setLayout(null);
		panel_1_12_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_12_1.setBackground(new Color(135, 206, 235));
		panel_1_12_1.setBounds(369, 817, 227, 172);
		frame.getContentPane().add(panel_1_12_1);
		
		JPanel panel_1_1_11_1 = new JPanel();
		panel_1_1_11_1.setLayout(null);
		panel_1_1_11_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_11_1.setBounds(0, 39, 227, 133);
		panel_1_12_1.add(panel_1_1_11_1);
		
		JButton btnNewButton_11_1 = new JButton("New button");
		btnNewButton_11_1.setBounds(0, 0, 237, 133);
		panel_1_1_11_1.add(btnNewButton_11_1);
		btnNewButton_11_1.setIcon(img2);
		
		JLabel lblCarName_11_1 = new JLabel("Car Name");
		lblCarName_11_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_11_1.setBounds(71, 0, 84, 45);
		panel_1_12_1.add(lblCarName_11_1);
		
		JPanel panel_1_13_1 = new JPanel();
		panel_1_13_1.setLayout(null);
		panel_1_13_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_13_1.setBackground(new Color(135, 206, 235));
		panel_1_13_1.setBounds(678, 817, 227, 172);
		frame.getContentPane().add(panel_1_13_1);
		
		JPanel panel_1_1_12_1 = new JPanel();
		panel_1_1_12_1.setLayout(null);
		panel_1_1_12_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_12_1.setBounds(0, 39, 227, 133);
		panel_1_13_1.add(panel_1_1_12_1);
		
		JButton btnNewButton_12_1 = new JButton("New button");
		btnNewButton_12_1.setBounds(0, 0, 237, 133);
		panel_1_1_12_1.add(btnNewButton_12_1);
		btnNewButton_12_1.setIcon(img2);
		
		JLabel lblCarName_12_1 = new JLabel("Car Name");
		lblCarName_12_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_12_1.setBounds(71, 0, 84, 45);
		panel_1_13_1.add(lblCarName_12_1);
		
		JPanel panel_1_14_1 = new JPanel();
		panel_1_14_1.setLayout(null);
		panel_1_14_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_14_1.setBackground(new Color(135, 206, 235));
		panel_1_14_1.setBounds(998, 817, 227, 172);
		frame.getContentPane().add(panel_1_14_1);
		
		JPanel panel_1_1_13_1 = new JPanel();
		panel_1_1_13_1.setLayout(null);
		panel_1_1_13_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_13_1.setBounds(0, 39, 227, 133);
		panel_1_14_1.add(panel_1_1_13_1);
		
		JButton btnNewButton_13_1 = new JButton("New button");
		btnNewButton_13_1.setBounds(0, 0, 237, 133);
		panel_1_1_13_1.add(btnNewButton_13_1);
		btnNewButton_13_1.setIcon(img2);
		
		JLabel lblCarName_13_1 = new JLabel("Car Name");
		lblCarName_13_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_13_1.setBounds(71, 0, 84, 45);
		panel_1_14_1.add(lblCarName_13_1);
		
		JPanel panel_1_15_2 = new JPanel();
		panel_1_15_2.setLayout(null);
		panel_1_15_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_15_2.setBackground(new Color(135, 206, 235));
		panel_1_15_2.setBounds(1309, 817, 227, 172);
		frame.getContentPane().add(panel_1_15_2);
		
		JPanel panel_1_1_14_2 = new JPanel();
		panel_1_1_14_2.setLayout(null);
		panel_1_1_14_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_14_2.setBounds(0, 39, 227, 133);
		panel_1_15_2.add(panel_1_1_14_2);
		
		JButton btnNewButton_14_2 = new JButton("New button");
		btnNewButton_14_2.setBounds(0, 0, 237, 133);
		panel_1_1_14_2.add(btnNewButton_14_2);
		btnNewButton_14_2.setIcon(img2);
		
		JLabel lblCarName_14_2 = new JLabel("Car Name");
		lblCarName_14_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_14_2.setBounds(71, 0, 84, 45);
		panel_1_15_2.add(lblCarName_14_2);
		
		JPanel panel_1_15_1_1 = new JPanel();
		panel_1_15_1_1.setLayout(null);
		panel_1_15_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_15_1_1.setBackground(new Color(135, 206, 235));
		panel_1_15_1_1.setBounds(1623, 817, 227, 172);
		frame.getContentPane().add(panel_1_15_1_1);
		
		JPanel panel_1_1_14_1_1 = new JPanel();
		panel_1_1_14_1_1.setLayout(null);
		panel_1_1_14_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1_1_14_1_1.setBounds(0, 39, 227, 133);
		panel_1_15_1_1.add(panel_1_1_14_1_1);
		
		JButton btnNewButton_14_1_1 = new JButton("New button");
		btnNewButton_14_1_1.setBounds(0, 0, 237, 133);
		panel_1_1_14_1_1.add(btnNewButton_14_1_1);
		btnNewButton_14_1_1.setIcon(img2);
		
		JLabel lblCarName_14_1_1 = new JLabel("Car Name");
		lblCarName_14_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarName_14_1_1.setBounds(71, 0, 84, 45);
		panel_1_15_1_1.add(lblCarName_14_1_1);
		
		frame.setVisible(true);
	}
}
