import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.BorderLayout;

public class User extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		File out=new File("a.txt");
		BST_ID Id_root=new BST_ID();
		BST_NAME Name_root=new BST_NAME();
		Info inputinfo=new Info();
		
		String get[]=new String[7];
		File in=new File("a.txt");
		try{
			Scanner sc=new Scanner(in);
			while(sc.hasNextLine()){
				Info inputinfo1=new Info();
				String line = sc.nextLine();	
				get=line.split("\t");
				inputinfo1.name=get[0];
				inputinfo1.sex=get[1];
				inputinfo1.age=Integer.parseInt(get[2]);
				inputinfo1.id=Integer.parseInt(get[3]);
				inputinfo1.phonenumber=get[4];
				inputinfo1.grade=Integer.parseInt(get[5]);
				inputinfo1.score=Double.parseDouble(get[6]);
				Id_root.insert(inputinfo1);
				Name_root.insert(inputinfo1);
				
			}
			sc.close();
		}
		catch(FileNotFoundException e){
		}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 545, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 518, 292);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane.addTab("조회", null, panel_1, null);
		
		Panel panel_2 = new Panel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 10, 219, 89);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("\uD559\uC0DD\uC758 \uC774\uB984\uC744 \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		label.setBounds(12, 10, 195, 15);
		panel_2.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 35, 116, 21);
		panel_2.add(textField);
		
		JButton button = new JButton("\uC785\uB825");
		button.setBounds(134, 35, 62, 23);
		panel_2.add(button);
		
		Panel panel_3 = new Panel();
		panel_3.setLayout(null);
		panel_3.setBounds(235, 10, 228, 89);
		panel_1.add(panel_3);
		
		JLabel label_1 = new JLabel("\uD559\uC0DD\uC758 \uD559\uBC88\uC744 \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(12, 10, 204, 15);
		panel_3.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 35, 116, 21);
		panel_3.add(textField_1);
		
		JButton button_1 = new JButton("\uC785\uB825");
		
		button_1.setBounds(140, 35, 65, 23);
		panel_3.add(button_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(10, 105, 453, 148);
		panel_1.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 453, 148);
		panel_4.add(scrollPane);
		
		String contents[][] = {};
		String header[] = {"이름", "성별", "나이", "학번", "전화번호", "학년", "학점"};

		DefaultTableModel model= new DefaultTableModel(contents,header);
		table=new JTable(model);

	    table.setAutoCreateRowSorter(true);
	    TableRowSorter sorter = new TableRowSorter(table.getModel());
	    table.setRowSorter(sorter);
		scrollPane.setViewportView(table);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane.addTab("전체 출력", null, panel_5, null);
		
		Panel panel_7 = new Panel();
		panel_7.setBounds(10, 10, 493, 190);
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_7.add(scrollPane_1);
		
		JButton btnNewButton = new JButton("\uCD9C\uB825");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String line=new String();
					try{
						DefaultTableModel model1= new DefaultTableModel(contents,header);
						table_1=new JTable(model1);

					    table_1.setAutoCreateRowSorter(true);
					    TableRowSorter sorter1 = new TableRowSorter(table_1.getModel());
					    table_1.setRowSorter(sorter1);
						scrollPane_1.setViewportView(table_1);
						Scanner sc=new Scanner(in);
						while(sc.hasNextLine()){
							
							line = sc.nextLine();	
							String get[]=new String[7];
							get=line.split("\t");
							
							
							model1.addRow(get);
						}
						sc.close();
					}
					catch(FileNotFoundException k){
					}
			}
		});
		btnNewButton.setBounds(404, 206, 97, 34);
		panel_5.add(btnNewButton);
		
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Info revise_info=new Info();
				revise_info.name=textField.getText(); // 학번
				String input[]=new String[7];
				Node p=new Node();
				p=Name_root.find(revise_info);
				input[0]=p.getInfo().name;
				input[1]=p.getInfo().sex;
				input[2]=Integer.toString(p.getInfo().age);
				input[3]=Integer.toString(p.getInfo().id);
				input[4]=p.getInfo().phonenumber;
				input[5]=Integer.toString(p.getInfo().grade);
				input[6]=Double.toString(p.getInfo().score);
				model.addRow(input);
			}
		});
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Info revise_info=new Info();
				revise_info.id=Integer.parseInt(textField_1.getText().toString()); // 학번
				String input[]=new String[7];
				Node p=new Node();
				p=Id_root.find(revise_info);
				input[0]=p.getInfo().name;
				input[1]=p.getInfo().sex;
				input[2]=Integer.toString(p.getInfo().age);
				input[3]=Integer.toString(p.getInfo().id);
				input[4]=p.getInfo().phonenumber;
				input[5]=Integer.toString(p.getInfo().grade);
				input[6]=Double.toString(p.getInfo().score);
				model.addRow(input);
			}
		});
	}
}
