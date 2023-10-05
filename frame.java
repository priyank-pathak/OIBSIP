package Project;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 884, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("5) What is Carol's nickname for Monica in Captain Marvel?");
		lblNewLabel.setFont(new Font("Cascadia Code", Font.BOLD, 18));
		lblNewLabel.setBounds(33, 87, 878, 31);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" Carol Danverse");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNewRadioButton.setBounds(63, 143, 215, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnRonin = new JRadioButton(" Ronin");
		rdbtnRonin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnRonin.setBounds(63, 186, 103, 21);
		contentPane.add(rdbtnRonin);
		
		JRadioButton rdbtnLieutenantTrouble = new JRadioButton(" Lieutenant Trouble");
		rdbtnLieutenantTrouble.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnLieutenantTrouble.setBounds(63, 226, 186, 21);
		contentPane.add(rdbtnLieutenantTrouble);
		
		JRadioButton rdbtnNickFury = new JRadioButton(" Nick Fury");
		rdbtnNickFury.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnNickFury.setBounds(63, 267, 103, 21);
		contentPane.add(rdbtnNickFury);
		
		ButtonGroup btn = new ButtonGroup();
		btn.add(rdbtnNickFury);
		btn.add(rdbtnLieutenantTrouble);
		btn.add(rdbtnNewRadioButton);
		btn.add(rdbtnRonin);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Submitted SucessFully!!!");
			}
		});
		btnNewButton.setFont(new Font("Cascadia Code", Font.BOLD, 22));
		btnNewButton.setBounds(378, 373, 186, 48);
		contentPane.add(btnNewButton);
		
	}

}
