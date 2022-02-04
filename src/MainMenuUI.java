import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class MainMenuUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuUI window = new MainMenuUI();
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
	public MainMenuUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1920, 1080);
	//	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		
		JButton btnNewButton_4 = new JButton("New");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UpdateProfileUI updatePage = new UpdateProfileUI();
				updatePage.initialize();
			}
		});
		btnNewButton_4.setBounds(127, 95, 51, 40);
		frame.getContentPane().add(btnNewButton_4);
		ImageIcon imgBack = new ImageIcon(this.getClass().getResource("profilePic.jpg"));
		btnNewButton_4.setIcon(imgBack);
		
		frame.setVisible(true);

		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setBounds(0, 70, 2050, 14);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("16:35, 04/12/2021");
		lblNewLabel_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(1746, -4, 3000, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Please choose operation");
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(852, 200, 200, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblGoodAfternoonJohn = new JLabel("Good Afternoon, John Doe");
		lblGoodAfternoonJohn.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblGoodAfternoonJohn.setBounds(47, 34, 459, 25);
		frame.getContentPane().add(lblGoodAfternoonJohn);
		
		JButton btnCreateRecord = new JButton("Create Record");
		btnCreateRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				CreateSellRecordUI sellRecord = new CreateSellRecordUI();
				sellRecord.initialize();
			}
		});
		btnCreateRecord.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnCreateRecord.setBackground(Color.LIGHT_GRAY);
		btnCreateRecord.setBounds(783, 285, 338, 51);
		frame.getContentPane().add(btnCreateRecord);
		
		JButton btnViewRecords = new JButton("View Records");
		btnViewRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewSellRecordUI sellView = new ViewSellRecordUI();
				sellView.initialize();
			}
		});
		btnViewRecords.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnViewRecords.setBackground(Color.LIGHT_GRAY);
		btnViewRecords.setBounds(783, 373, 338, 51);
		frame.getContentPane().add(btnViewRecords);
		
		JButton btnViewInventory = new JButton("View Inventory");
		btnViewInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ViewInventoryUI viewInv = new ViewInventoryUI();
				viewInv.initialize();
			}
		});
		btnViewInventory.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnViewInventory.setBackground(Color.LIGHT_GRAY);
		btnViewInventory.setBounds(783, 461, 338, 51);
		frame.getContentPane().add(btnViewInventory);
		
		JButton btnDeleteRecord = new JButton("Delete Record");
		btnDeleteRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				DeleteRecordUI deleteRec = new DeleteRecordUI();
				deleteRec.initialize();
			}
		});
		btnDeleteRecord.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnDeleteRecord.setBackground(Color.LIGHT_GRAY);
		btnDeleteRecord.setBounds(783, 544, 338, 51);
		frame.getContentPane().add(btnDeleteRecord);
		
		//table = new JTable();
		//table.setBounds(10, 10, 2000, 900);
		//frame.getContentPane().add(table);
		
		frame.setVisible(true);
		
		
		
	}
}
