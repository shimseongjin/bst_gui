import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class change_1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					change_1 frame = new change_1();
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
	public change_1() {
		File out=new File("pass.txt");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(73, 37, 105, 21);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("\uBCC0\uACBD\uD560 \uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 12, 182, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try{
					FileWriter w= new FileWriter(out);
					w.write(passwordField.getText());
					w.close();
					dispose();
					ok frame4= new ok();
					frame4.setVisible(true);
				}
				catch(IOException z){
				}
			}
		});
		btnNewButton.setBounds(83, 68, 87, 23);
		contentPane.add(btnNewButton);
	}

}
