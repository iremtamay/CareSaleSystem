import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CreateSellRecordUI {
	
	private JFrame frame = new JFrame();
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateSellRecordUI window = new CreateSellRecordUI();
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
	public CreateSellRecordUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		
	JFrame frame = new JFrame();
//	frame.setBounds(100, 100, 1920, 1080);
	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Record Type: ");
	lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblNewLabel.setBounds(37, 107, 120, 32);
	frame.getContentPane().add(lblNewLabel);
	
	JButton btnNewButton = new JButton("Sale");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnNewButton.setBackground(SystemColor.activeCaption);
	btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	btnNewButton.setBounds(167, 108, 94, 31);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnBuy = new JButton("Buy");
	btnBuy.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			CreateBuyRecordUI buyRecordScreen = new CreateBuyRecordUI();
			buyRecordScreen.initialize();
		}
	});
	btnBuy.setBackground(Color.LIGHT_GRAY);
	btnBuy.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	btnBuy.setBounds(290, 108, 94, 31);
	frame.getContentPane().add(btnBuy);
	
	JPanel panel = new JPanel();
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel.setBounds(37, 175, 1798, 200);
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lblCustomerInfo = new JLabel("Customer Info");
	lblCustomerInfo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblCustomerInfo.setBounds(10, 0, 120, 32);
	panel.add(lblCustomerInfo);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel_2.setBounds(0, 0, 130, 43);
	panel.add(panel_2);
	
	JLabel lblName = new JLabel("Name:");
	lblName.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblName.setBounds(152, 54, 120, 32);
	panel.add(lblName);
	
	textField = new JTextField();
	textField.setBounds(228, 54, 478, 32);
	panel.add(textField);
	textField.setColumns(10);
	
	JLabel lblId = new JLabel("ID:");
	lblId.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblId.setBounds(152, 118, 120, 32);
	panel.add(lblId);
	
	JLabel lblSurname = new JLabel("Surname:");
	lblSurname.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblSurname.setBounds(923, 54, 120, 32);
	panel.add(lblSurname);
	
	JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
	lblDateOfBirth.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblDateOfBirth.setBounds(923, 118, 120, 32);
	panel.add(lblDateOfBirth);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(228, 118, 478, 32);
	panel.add(textField_1);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(1053, 54, 478, 32);
	panel.add(textField_2);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(1053, 118, 478, 32);
	panel.add(textField_3);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBounds(37, 76, 120, 36);
	frame.getContentPane().add(panel_1);
	
	JPanel panel_3 = new JPanel();
	panel_3.setLayout(null);
	panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel_3.setBounds(37, 396, 1798, 131);
	frame.getContentPane().add(panel_3);
	
	JLabel lblCarInfo = new JLabel("Car Info");
	lblCarInfo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblCarInfo.setBounds(10, 0, 120, 32);
	panel_3.add(lblCarInfo);
	
	JPanel panel_2_1 = new JPanel();
	panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel_2_1.setBounds(0, 0, 130, 43);
	panel_3.add(panel_2_1);
	
	JLabel lblLicencePlateNumber = new JLabel("Licence Plate Number:");
	lblLicencePlateNumber.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblLicencePlateNumber.setBounds(386, 56, 279, 32);
	panel_3.add(lblLicencePlateNumber);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(580, 56, 478, 32);
	panel_3.add(textField_4);
	
	JPanel panel_4 = new JPanel();
	panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel_4.setBounds(37, 572, 1798, 200);
	frame.getContentPane().add(panel_4);
	panel_4.setLayout(null);
	
	JLabel lblPaymentInfo = new JLabel("Payment Info");
	lblPaymentInfo.setBounds(10, 0, 120, 32);
	lblPaymentInfo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	panel_4.add(lblPaymentInfo);
	
	JPanel panel_2_2 = new JPanel();
	panel_2_2.setBounds(0, 0, 130, 43);
	panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel_4.add(panel_2_2);
	
	JLabel lblMethod = new JLabel("Method:");
	lblMethod.setBounds(152, 53, 120, 32);
	lblMethod.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	panel_4.add(lblMethod);
	
	JLabel lblPrice = new JLabel("Price:");
	lblPrice.setBounds(152, 117, 120, 32);
	lblPrice.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	panel_4.add(lblPrice);
	
	JPanel panel_5 = new JPanel();
	panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel_5.setBounds(803, 0, 995, 200);
	panel_4.add(panel_5);
	panel_5.setLayout(null);
	panel_5.setVisible(false);
	
	JLabel lblPaybackTimeIn = new JLabel("Payback time in months:");
	lblPaybackTimeIn.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblPaybackTimeIn.setBounds(65, 42, 216, 32);
	panel_5.add(lblPaybackTimeIn);
	lblPaybackTimeIn.setVisible(false);
	
	JLabel lblRateOfInterest = new JLabel("Rate of interest:");
	lblRateOfInterest.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblRateOfInterest.setBounds(65, 80, 216, 32);
	panel_5.add(lblRateOfInterest);
	lblRateOfInterest.setVisible(false);
	
	textField_6 = new JTextField();
	textField_6.setColumns(10);
	textField_6.setBounds(291, 38, 396, 32);
	panel_5.add(textField_6);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	textField_7.setBounds(291, 78, 396, 32);
	panel_5.add(textField_7);
	
	textField_8 = new JTextField();
	textField_8.setColumns(10);
	textField_8.setBounds(291, 117, 396, 32);
	panel_5.add(textField_8);
	
	JLabel lblInstallmentInfo = new JLabel("Installment Info");
	lblInstallmentInfo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblInstallmentInfo.setBounds(10, 0, 168, 32);
	panel_5.add(lblInstallmentInfo);
	
	JPanel panel_2_2_1 = new JPanel();
	panel_2_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
	panel_2_2_1.setBounds(0, 0, 146, 43);
	panel_5.add(panel_2_2_1);
	
	JLabel lblFinalPrice = new JLabel("Final Price:");
	lblFinalPrice.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	lblFinalPrice.setBounds(65, 117, 120, 32);
	panel_5.add(lblFinalPrice);
	frame.setVisible(true);
	
	JButton btnAdv = new JButton("Adv.");
	btnAdv.setBounds(228, 54, 94, 31);
	btnAdv.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panel_5.setVisible(false);
			lblPaybackTimeIn.setVisible(false);
			lblRateOfInterest.setVisible(false);
			lblFinalPrice.setVisible(false);
		}
	});
	btnAdv.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	btnAdv.setBackground(Color.LIGHT_GRAY);
	panel_4.add(btnAdv);
	
	JButton btnInst = new JButton("Inst.");
	btnInst.setBounds(361, 54, 94, 31);
	btnInst.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panel_5.setVisible(true);
			lblPaybackTimeIn.setVisible(true);
			lblRateOfInterest.setVisible(true);
			lblFinalPrice.setVisible(true);
		}
	});
	btnInst.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
	btnInst.setBackground(Color.LIGHT_GRAY);
	panel_4.add(btnInst);
	
	textField_5 = new JTextField();
	textField_5.setBounds(228, 117, 478, 32);
	textField_5.setColumns(10);
	panel_4.add(textField_5);
	
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
	btnBack.setBounds(37, 50, 102, 41);
	frame.getContentPane().add(btnBack);
	ImageIcon img = new ImageIcon(this.getClass().getResource("backPic.jpg"));
	btnBack.setIcon(img);

	frame.setVisible(true);
	
	}
}
