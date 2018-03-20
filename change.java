import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class change extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change frame = new change();
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
	public change() {
		
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
		setBounds(100, 100, 272, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(69, 42, 114, 21);
		contentPane.add(passwordField);
		
		String z=pass;
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(z.equals(passwordField.getText())){		
					change_1 frame3=new change_1();
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
		btnNewButton.setBounds(91, 73, 74, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 10, 170, 15);
		contentPane.add(lblNewLabel);
	}
}
