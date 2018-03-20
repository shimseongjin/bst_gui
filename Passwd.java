import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Passwd extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passwd frame = new Passwd();
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
	public Passwd() {
		String pass=new String();
		File in=new File("pass.txt");
		try{
			Scanner sc=new Scanner(in);	
			pass = sc.nextLine();	
			sc.close();
		}
		catch(FileNotFoundException e){
		}

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 338, 163);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(62, 10, 232, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD328\uC2A4\uC6CC\uB4DC\uB97C \uC785\uB825 \uD558\uC2ED\uC2DC\uC624.");
		lblNewLabel.setBounds(18, 5, 171, 15);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(28, 25, 127, 21);
		panel.add(passwordField);

		String z=pass;
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(57, 56, 66, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(z.equals(passwordField.getText())){		
				Admins frame3=new Admins();
				frame3.setVisible(true);
				dispose();
				}
				else
				{
					wrong_pass frame3=new wrong_pass();
					frame3.setVisible(true);
				}
			}
		});
		panel.add(btnNewButton);

		
	}
}
