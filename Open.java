package Project;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Open extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Open frame = new Open();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Open() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 929, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Examination");
		lblNewLabel.setFont(new Font("Cascadia Mono", Font.BOLD, 32));
		lblNewLabel.setBounds(355, 10, 380, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Marks: 10");
		lblNewLabel_1.setForeground(new Color(0, 204, 51));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("Cascadia Code", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 83, 245, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1) Who Killed Tony Parents ?");
		lblNewLabel_2.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 126, 349, 32);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" Captain America");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(45, 183, 174, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHulk = new JRadioButton(" Hulk");
		rdbtnHulk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnHulk.setBounds(45, 218, 144, 21);
		contentPane.add(rdbtnHulk);
		
		JRadioButton rdbtnBucky = new JRadioButton(" Bucky Barnes");
		rdbtnBucky.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnBucky.setBounds(45, 255, 144, 21);
		contentPane.add(rdbtnBucky);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(" Peter Parker");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(45, 292, 198, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup btn = new ButtonGroup();
		btn.add(rdbtnHulk);
		btn.add(rdbtnBucky);
		btn.add(rdbtnNewRadioButton_1);
		btn.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_3 = new JLabel("2) What system replaced J.A.R.V.I.S.?");
		lblNewLabel_3.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		lblNewLabel_3.setBounds(20, 339, 452, 21);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(" Monday");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_2.setBounds(51, 394, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton(" Friday");
		rdbtnNewRadioButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_2_1.setBounds(51, 434, 138, 21);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton(" Center Core");
		rdbtnNewRadioButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_2_2.setBounds(51, 475, 129, 21);
		contentPane.add(rdbtnNewRadioButton_2_2);
		
		JRadioButton rdbtnNewRadioButton_2_3 = new JRadioButton(" Lucy");
		rdbtnNewRadioButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnNewRadioButton_2_3.setBounds(51, 517, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2_3);
		
		ButtonGroup btn1 = new ButtonGroup();
		btn1.add(rdbtnNewRadioButton_2);
		btn1.add(rdbtnNewRadioButton_2_1);
		btn1.add(rdbtnNewRadioButton_2_2);
		btn1.add(rdbtnNewRadioButton_2_3);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start start = new Start();
				start.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(752, 534, 155, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Previous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_application login = new Login_application();
				login.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		btnNewButton_1.setBounds(593, 533, 129, 40);
		contentPane.add(btnNewButton_1);
	}
}
