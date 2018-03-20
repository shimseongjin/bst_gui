import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class Student extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JButton btnNewButton_2 = new JButton("관리자 모드");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
					Passwd frame1 = new Passwd();
					frame1.setVisible(true);	

			}
		});
		getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("사용자 모드");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				User frame2=new User();
				frame2.setVisible(true);
			}
		});
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				change frame5=new change();
				frame5.setVisible(true);
			}
		});
		getContentPane().add(btnNewButton);
	}

}
