import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CreateBuyRecordUI {
	
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
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField textField_12;
	private static JTextField textField_13;
	private static JTextField textField_14;
	private static JTextField textField_15;
	private static JTextField textField_16;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateBuyRecordUI window = new CreateBuyRecordUI();
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
	public CreateBuyRecordUI() {
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
		lblNewLabel.setBounds(52, 94, 120, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sale");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				CreateSellRecordUI sellRecordScreen = new CreateSellRecordUI();
				sellRecordScreen.initialize();
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnNewButton.setBounds(182, 95, 94, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuy.setBackground(SystemColor.activeCaption);
		btnBuy.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		btnBuy.setBounds(304, 95, 94, 31);
		frame.getContentPane().add(btnBuy);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(53, 159, 1818, 170);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCustomerInfo = new JLabel("Car Owner Info");
		lblCustomerInfo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCustomerInfo.setBounds(10, 0, 150, 32);
		panel.add(lblCustomerInfo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(0, 0, 165, 43);
		panel.add(panel_2);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblName.setBounds(95, 54, 120, 32);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(272, 59, 478, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblId.setBounds(95, 118, 120, 32);
		panel.add(lblId);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblSurname.setBounds(932, 54, 120, 32);
		panel.add(lblSurname);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblDateOfBirth.setBounds(932, 118, 120, 32);
		panel.add(lblDateOfBirth);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(272, 118, 478, 32);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(1123, 58, 478, 32);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(1123, 118, 478, 32);
		panel.add(textField_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(52, 362, 1818, 267);
		frame.getContentPane().add(panel_1);
		
		JLabel lblCarInfo = new JLabel("Car Info");
		lblCarInfo.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblCarInfo.setBounds(10, 0, 120, 32);
		panel_1.add(lblCarInfo);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_1.setBounds(0, 0, 167, 43);
		panel_1.add(panel_2_1);
		
		JLabel lblLicencePlateNumber = new JLabel("Licence Plate Number:");
		lblLicencePlateNumber.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblLicencePlateNumber.setBounds(95, 55, 190, 52);
		panel_1.add(lblLicencePlateNumber);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(272, 70, 478, 32);
		panel_1.add(textField_4);
		
		JLabel lblBrand = new JLabel("Brand:");
		lblBrand.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblBrand.setBounds(95, 117, 120, 32);
		panel_1.add(lblBrand);
		
		JLabel lblSurname_1 = new JLabel("VIN:");
		lblSurname_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblSurname_1.setBounds(932, 65, 120, 32);
		panel_1.add(lblSurname_1);
		
		JLabel lblDateOfBirth_1 = new JLabel("Model:");
		lblDateOfBirth_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblDateOfBirth_1.setBounds(932, 117, 120, 32);
		panel_1.add(lblDateOfBirth_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(272, 117, 478, 32);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(1123, 69, 478, 32);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(1123, 121, 478, 32);
		panel_1.add(textField_7);
		
		JLabel lblMileage = new JLabel("Colour:");
		lblMileage.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblMileage.setBounds(95, 167, 120, 32);
		panel_1.add(lblMileage);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(272, 172, 478, 32);
		panel_1.add(textField_8);
		
		JLabel lblMileage_2 = new JLabel("Mileage:");
		lblMileage_2.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblMileage_2.setBounds(95, 219, 120, 32);
		panel_1.add(lblMileage_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(272, 224, 478, 32);
		panel_1.add(textField_9);
		
		JLabel lblDateOfBirth_1_1 = new JLabel("Year:");
		lblDateOfBirth_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblDateOfBirth_1_1.setBounds(932, 167, 120, 32);
		panel_1.add(lblDateOfBirth_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(1123, 164, 478, 32);
		panel_1.add(textField_10);
		
		JLabel lblDateOfBirth_1_1_1 = new JLabel("Last Maintenance Date:");
		lblDateOfBirth_1_1_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblDateOfBirth_1_1_1.setBounds(932, 219, 190, 32);
		panel_1.add(lblDateOfBirth_1_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(1123, 219, 478, 32);
		panel_1.add(textField_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(53, 623, 1818, 162);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPerformanceStatus = new JLabel("Performance Status");
		lblPerformanceStatus.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblPerformanceStatus.setBounds(10, 10, 154, 32);
		panel_3.add(lblPerformanceStatus);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_1_1.setBounds(0, 0, 174, 51);
		panel_3.add(panel_2_1_1);
		
		JLabel lblHorsepower = new JLabel("Horsepower:");
		lblHorsepower.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblHorsepower.setBounds(373, 51, 120, 32);
		panel_3.add(lblHorsepower);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(488, 51, 373, 32);
		panel_3.add(textField_12);
		
		JLabel lblTorque = new JLabel("Torque:");
		lblTorque.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblTorque.setBounds(373, 108, 120, 32);
		panel_3.add(lblTorque);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(488, 108, 373, 32);
		panel_3.add(textField_13);
		
		JLabel lblDisplacement = new JLabel("Displacement:");
		lblDisplacement.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblDisplacement.setBounds(889, 51, 120, 32);
		panel_3.add(lblDisplacement);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(1019, 51, 373, 32);
		panel_3.add(textField_14);
		
		JLabel lblVkm = new JLabel("I/100km:");
		lblVkm.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblVkm.setBounds(889, 108, 120, 32);
		panel_3.add(lblVkm);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(1019, 108, 373, 32);
		panel_3.add(textField_15);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3_1.setBounds(53, 816, 1818, 107);
		frame.getContentPane().add(panel_3_1);
		
		JLabel lblPerformanceStatus_1 = new JLabel("Payment Info");
		lblPerformanceStatus_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblPerformanceStatus_1.setBounds(10, 10, 154, 32);
		panel_3_1.add(lblPerformanceStatus_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2_1_1_1.setBounds(0, 0, 174, 51);
		panel_3_1.add(panel_2_1_1_1);
		
		JLabel lblHorsepower_1 = new JLabel("Price:");
		lblHorsepower_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblHorsepower_1.setBounds(617, 44, 120, 32);
		panel_3_1.add(lblHorsepower_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(693, 44, 373, 32);
		panel_3_1.add(textField_16);
		
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
		btnBack.setBounds(52, 30, 102, 41);
		frame.getContentPane().add(btnBack);
		ImageIcon img = new ImageIcon(this.getClass().getResource("backPic.jpg"));
		btnBack.setIcon(img);
		
		frame.setVisible(true);
	}
	
}
