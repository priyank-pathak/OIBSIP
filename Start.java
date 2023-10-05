package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("3) In Spider-Man: Far From Home, what necklace does Peter buy for M.J.?");
		lblNewLabel.setFont(new Font("Cascadia Code", Font.BOLD, 19));
		lblNewLabel.setBounds(21, 23, 860, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("   ->");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame f = new frame();
				f.setVisible(true);
			}
		});
		btnNewButton.setBounds(802, 503, 159, 37);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" A black dahlia necklace");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton.setBounds(63, 84, 222, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDaimondNeklece = new JRadioButton(" Daimond Neklece");
		rdbtnDaimondNeklece.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnDaimondNeklece.setBounds(63, 122, 197, 21);
		contentPane.add(rdbtnDaimondNeklece);
		
		JRadioButton rdbtnDaimondNeckles = new JRadioButton(" Daimond Neckles");
		rdbtnDaimondNeckles.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnDaimondNeckles.setBounds(63, 164, 197, 21);
		contentPane.add(rdbtnDaimondNeckles);
		
		JRadioButton rdbtnPapperNeklace = new JRadioButton(" Papper Neklace");
		rdbtnPapperNeklace.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnPapperNeklace.setBounds(63, 206, 197, 21);
		contentPane.add(rdbtnPapperNeklace);
		
		ButtonGroup btn = new ButtonGroup();
		btn.add(rdbtnPapperNeklace);
		btn.add(rdbtnDaimondNeckles);
		btn.add(rdbtnNewRadioButton);
		btn.add(rdbtnDaimondNeklece);
		
		
		JLabel lblNewLabel_1 = new JLabel("4) What is the name of the little boy Tony befriends while stranded in Iron Man 3?");
		lblNewLabel_1.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		lblNewLabel_1.setBounds(21, 233, 970, 37);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(" Harley");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_1.setBounds(63, 297, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton(" Peter Parker");
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_1_1.setBounds(63, 331, 166, 21);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton(" Nick Fury");
		rdbtnNewRadioButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_1_2.setBounds(63, 363, 150, 21);
		contentPane.add(rdbtnNewRadioButton_1_2);
		
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton(" Natasha RomanOff");
		rdbtnNewRadioButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton_1_3.setBounds(63, 402, 197, 21);
		contentPane.add(rdbtnNewRadioButton_1_3);
		
		ButtonGroup btn2 = new ButtonGroup();
		btn2.add(rdbtnNewRadioButton_1_1);
		btn2.add(rdbtnNewRadioButton_1_2);
		btn2.add(rdbtnNewRadioButton_1_3);
		btn2.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("  <-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Open open = new Open();
				open.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(580, 503, 176, 37);
		contentPane.add(btnNewButton_1);
	}

}
