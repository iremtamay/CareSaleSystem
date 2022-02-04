import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

public class UpdateProfileUI {

	private JFrame frame = new JFrame();
	private JTextField textField;
	private JPasswordField newPass;
	private JPasswordField oldPass;
	private JPasswordField pass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProfileUI window = new UpdateProfileUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public UpdateProfileUI() {
		initialize();
	}

	protected void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 736, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		btnBack.setBounds(24, 75, 102, 41);
		frame.getContentPane().add(btnBack);
		ImageIcon img = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(img);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(0, 0, 722, 65);
		frame.getContentPane().add(panel);
		
		JLabel lblUpdateProfile = new JLabel("Update Profile");
		lblUpdateProfile.setBounds(22, 10, 173, 45);
		panel.add(lblUpdateProfile);
		lblUpdateProfile.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(326, 205, 196, 32);
		frame.getContentPane().add(textField);
		textField.setVisible(false);
		
		JLabel lblNewEmail = new JLabel("New email:");
		lblNewEmail.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewEmail.setBounds(185, 195, 131, 45);
		frame.getContentPane().add(lblNewEmail);
		lblNewEmail.setVisible(false);
		
		JLabel lblNewPassword = new JLabel("New password:");
		lblNewPassword.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewPassword.setBounds(185, 195, 142, 45);
		frame.getContentPane().add(lblNewPassword);
		lblNewPassword.setVisible(false);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblPassword.setBounds(185, 250, 131, 45);
		frame.getContentPane().add(lblPassword);
		lblPassword.setVisible(false);
		
		JLabel lblOldPassword = new JLabel("Old password:");
		lblOldPassword.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblOldPassword.setBounds(185, 250, 142, 45);
		frame.getContentPane().add(lblOldPassword);
		lblOldPassword.setVisible(false);
		
		oldPass = new JPasswordField();
		oldPass.setColumns(10);
		oldPass.setBounds(323, 263, 196, 32);
		frame.getContentPane().add(oldPass);
		oldPass.setVisible(false);
		
		pass = new JPasswordField();
		pass.setColumns(10);
		pass.setBounds(323, 263, 196, 32);
		frame.getContentPane().add(pass);
		pass.setVisible(false);
		
		newPass = new JPasswordField();
		newPass.setColumns(10);
		newPass.setBounds(326, 205, 196, 32);
		frame.getContentPane().add(newPass);
		newPass.setVisible(false);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnConfirm.setBackground(Color.LIGHT_GRAY);
		btnConfirm.setBounds(297, 331, 121, 31);
		frame.getContentPane().add(btnConfirm);
		JButton btnEmail = new JButton("Email");
		btnConfirm.setVisible(false);
		
		btnEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(true);
				lblNewEmail.setVisible(true);
				lblPassword.setVisible(true);
				pass.setVisible(true);
				btnConfirm.setVisible(true);
				lblNewPassword.setVisible(false);
				lblOldPassword.setVisible(false);
				newPass.setVisible(false);
				oldPass.setVisible(false);
			}
		});
		btnEmail.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnEmail.setBackground(Color.LIGHT_GRAY);
		btnEmail.setBounds(185, 140, 121, 31);
		frame.getContentPane().add(btnEmail);
		
		JButton btnPassword = new JButton("Password");
		btnPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewPassword.setVisible(true);
				lblOldPassword.setVisible(true);
				newPass.setVisible(true);
				oldPass.setVisible(true);
				btnConfirm.setVisible(true);
				lblNewEmail.setVisible(false);
				lblPassword.setVisible(false);
				textField.setVisible(false);
				pass.setVisible(false);
			}
		});
		btnPassword.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnPassword.setBackground(Color.LIGHT_GRAY);
		btnPassword.setBounds(398, 140, 121, 31);
		frame.getContentPane().add(btnPassword);
		
		frame.setVisible(true);
	}
}
