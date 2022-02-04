

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerifyMaintenanceUI {

	private JFrame frame = new JFrame();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerifyMaintenanceUI window = new VerifyMaintenanceUI();
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
	public VerifyMaintenanceUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 736, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(0, 0, 720, 41);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbVerifyMHeader = new JLabel("Verify Maintenance");
		lbVerifyMHeader.setBounds(10, 11, 148, 25);
		panel.add(lbVerifyMHeader);
		lbVerifyMHeader.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		
		JLabel lblNewLabel = new JLabel("Licence plate:");
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel.setBounds(223, 165, 150, 53);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(340, 185, 176, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Verify");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 16));
		btnNewButton.setBounds(311, 259, 97, 31);
		frame.getContentPane().add(btnNewButton);
		
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
		btnBack.setBounds(28, 65, 102, 41);
		frame.getContentPane().add(btnBack);
		ImageIcon img = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(img);
		
		frame.setVisible(true);
	}
}
