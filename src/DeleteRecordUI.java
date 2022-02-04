import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteRecordUI {

	private JFrame frame = new JFrame();
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteRecordUI window = new DeleteRecordUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DeleteRecordUI() {
		initialize();
	}

	protected void initialize() {
		JFrame frame = new JFrame();
	//	frame.setBounds(100, 100, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(0, 0, 1930, 65);
		frame.getContentPane().add(panel);
		
		JLabel lblDeletRecord = new JLabel("Delete Record");
		lblDeletRecord.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblDeletRecord.setBounds(27, 10, 173, 45);
		panel.add(lblDeletRecord);
		
		JLabel lblPleaseE = new JLabel("Please enter licence");
		lblPleaseE.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblPleaseE.setBounds(848, 241, 209, 45);
		frame.getContentPane().add(lblPleaseE);
		
		textField = new JTextField();
		textField.setBounds(770, 296, 366, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPleaseChooseRecord = new JLabel("Please choose record type");
		lblPleaseChooseRecord.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 24));
		lblPleaseChooseRecord.setBounds(818, 395, 271, 45);
		frame.getContentPane().add(lblPleaseChooseRecord);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuy.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnBuy.setBackground(Color.LIGHT_GRAY);
		btnBuy.setBounds(704, 468, 209, 52);
		frame.getContentPane().add(btnBuy);
		
		JButton btnSale = new JButton("Sale");
		btnSale.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnSale.setBackground(Color.LIGHT_GRAY);
		btnSale.setBounds(985, 468, 209, 52);
		frame.getContentPane().add(btnSale);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setBounds(848, 579, 209, 52);
		frame.getContentPane().add(btnDelete);
		
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
		btnBack.setBounds(39, 115, 102, 41);
		frame.getContentPane().add(btnBack);
		ImageIcon img = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(img);
		
		frame.setVisible(true);
	}
}