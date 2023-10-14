package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;

public class numberguessinggame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					numberguessinggame frame = new numberguessinggame();
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
	public numberguessinggame() {
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Downloads\\pngwing.com.png"));
		setFont(new Font("Dubai Light", Font.BOLD, 12));
		setForeground(Color.BLACK);
		setTitle("Guess My Number");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 723, 460);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\102087.gif"));
		lblNewLabel.setBounds(10, 63, 317, 371);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Guess My Number Game");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 26));
		lblNewLabel_1.setBounds(360, 51, 329, 81);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter The Number Btw 1-100");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(400, 131, 239, 22);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(464, 170, 76, 39);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Try And Guess My Number");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(400, 232, 211, 29);
		getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Give Up !");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(370, 299, 107, 39);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Play Again");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(526, 299, 113, 39);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Guess");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(447, 366, 107, 39);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Best Score");
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(106, 11, 129, 22);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Gusess");
		lblNewLabel_4_1.setForeground(new Color(32, 178, 170));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_1.setBounds(349, 11, 107, 22);
		getContentPane().add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 12, 61, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(257, 11, 70, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
	}
}
