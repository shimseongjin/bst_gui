import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Admins extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table_3;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admins frame = new Admins();
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
	public Admins() {
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
		panel.setBounds(5, 5, 518, 292);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("추가", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCD94\uAC00\uD560 \uC815\uBCF4\uB97C \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 489, 15);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBounds(195, 225, 139, 33);
		panel_1.add(btnNewButton);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(89, 35, 359, 180);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("\uC774\uB984");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(82, 10, 74, 15);
		panel_6.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(168, 7, 116, 21);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_2 = new JLabel("\uC131\uBCC4");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setBounds(82, 35, 74, 15);
		panel_6.add(label_2);
		
		JLabel label_3 = new JLabel("\uB098\uC774");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(82, 60, 74, 15);
		panel_6.add(label_3);
		
		JLabel label_4 = new JLabel("\uD559\uBC88");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(82, 85, 74, 15);
		panel_6.add(label_4);
		
		JLabel label_5 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setBounds(82, 110, 74, 15);
		panel_6.add(label_5);
		
		JLabel label_6 = new JLabel("\uD559\uB144");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setBounds(82, 134, 74, 15);
		panel_6.add(label_6);
		
		JLabel label_7 = new JLabel("\uD559\uC810");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setBounds(82, 159, 74, 15);
		panel_6.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(168, 32, 116, 21);
		panel_6.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(168, 57, 116, 21);
		panel_6.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(168, 82, 116, 21);
		panel_6.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(168, 107, 116, 21);
		panel_6.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(168, 131, 116, 21);
		panel_6.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(168, 156, 116, 21);
		panel_6.add(textField_11);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputinfo.name=textField_5.getText();
				inputinfo.sex=textField_6.getText();
				inputinfo.age=Integer.parseInt(textField_7.getText());
				inputinfo.id=Integer.parseInt(textField_8.getText());
				inputinfo.phonenumber=textField_9.getText();
				inputinfo.grade=Integer.parseInt(textField_10.getText());
				inputinfo.score=Double.parseDouble(textField_11.getText());


				Id_root.insert(inputinfo);
				Name_root.insert(inputinfo);
				ok frame4= new ok();
				frame4.setVisible(true);
				try{

					FileWriter w= new FileWriter(out);
					Id_root.save(Id_root.root, w);
					w.close();
				}
				catch(IOException z){
				}
			}
		});
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("수정", null, panel_2, null);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uC218\uC815\uD558\uB824\uB294 \uD559\uC0DD\uC758 \uD559\uBC88\uC744 \uC785\uB825\uD558\uC138\uC694.");
		lblNewLabel_1.setBounds(12, 53, 232, 15);
		panel_7.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(12, 78, 161, 21);
		panel_7.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC785\uB825");
		
		btnNewButton_1.setBounds(177, 78, 67, 23);
		panel_7.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uC218\uC815\uD560 \uC815\uBCF4\uB97C \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(14, 10, 232, 15);
		panel_8.add(lblNewLabel_2);
		
		Panel panel_9 = new Panel();
		panel_9.setBounds(12, 31, 234, 193);
		panel_8.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("\uC774\uB984");
		lblNewLabel_6.setBounds(28, 8, 57, 15);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		panel_9.add(lblNewLabel_6);
		
		textField_12 = new JTextField();
		textField_12.setBounds(90, 5, 116, 21);
		panel_9.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\uC131\uBCC4");
		lblNewLabel_7.setBounds(28, 34, 57, 15);
		panel_9.add(lblNewLabel_7);
		
		textField_13 = new JTextField();
		textField_13.setBounds(90, 31, 116, 21);
		panel_9.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\uB098\uC774");
		lblNewLabel_8.setBounds(28, 60, 57, 15);
		panel_9.add(lblNewLabel_8);
		
		textField_14 = new JTextField();
		textField_14.setBounds(90, 57, 116, 21);
		panel_9.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uD559\uBC88");
		lblNewLabel_9.setBounds(28, 86, 57, 15);
		panel_9.add(lblNewLabel_9);
		
		textField_15 = new JTextField();
		textField_15.setBounds(90, 83, 116, 21);
		panel_9.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_10.setBounds(28, 112, 57, 15);
		panel_9.add(lblNewLabel_10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(90, 109, 116, 21);
		panel_9.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\uD559\uB144");
		lblNewLabel_11.setBounds(28, 138, 57, 15);
		panel_9.add(lblNewLabel_11);
		
		textField_17 = new JTextField();
		textField_17.setBounds(90, 135, 116, 21);
		panel_9.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\uD559\uC810");
		lblNewLabel_12.setBounds(28, 164, 57, 15);
		panel_9.add(lblNewLabel_12);
		
		textField_18 = new JTextField();
		textField_18.setBounds(90, 161, 116, 21);
		panel_9.add(textField_18);
		textField_18.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uD655\uC778");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Info revise_info=new Info();
				revise_info.id=Integer.parseInt(textField.getText()); // 학번
				Node p=new Node();
				p=Id_root.find(revise_info);
				Id_root.delete(revise_info);
				Name_root.delete(p.getInfo());
				revise_info.name=textField_12.getText().toString();
				revise_info.sex=textField_13.getText().toString();
				revise_info.age=Integer.parseInt(textField_14.getText().toString());
				revise_info.id=Integer.parseInt(textField_15.getText().toString());
				revise_info.phonenumber=textField_16.getText().toString();
				revise_info.grade=Integer.parseInt(textField_17.getText().toString());
				revise_info.score=Double.parseDouble(textField_18.getText().toString());
				Id_root.insert(revise_info);
				Name_root.insert(revise_info);
				ok frame4= new ok();
				frame4.setVisible(true);
				try{

					FileWriter w= new FileWriter(out);
					Id_root.save(Id_root.root, w);
					w.close();
				}
				catch(IOException z){
				}

			}
		});
		btnNewButton_2.setBounds(82, 230, 97, 23);
		panel_8.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("삭제", null, panel_3, null);
		panel_3.setLayout(null);
		
		Panel panel_11 = new Panel();
		panel_11.setBounds(10, 10, 219, 89);
		panel_3.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\uD559\uC0DD\uC758 \uC774\uB984 \uC785\uB825");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(12, 10, 195, 15);
		panel_11.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 35, 116, 21);
		panel_11.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\uC785\uB825");
		
		
		
		btnNewButton_3.setBounds(134, 35, 62, 23);
		panel_11.add(btnNewButton_3);
		
		Panel panel_12 = new Panel();
		panel_12.setBounds(235, 10, 228, 89);
		panel_3.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\uC0AD\uC81C\uD558\uB824\uB294 \uD559\uC0DD\uC758 \uD559\uBC88 \uC785\uB825");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(12, 10, 204, 15);
		panel_12.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 35, 116, 21);
		panel_12.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("\uC785\uB825");
		btnNewButton_4.setBounds(140, 35, 65, 23);
		panel_12.add(btnNewButton_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(10, 105, 453, 148);
		panel_3.add(panel_10);
		panel_10.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_10.add(scrollPane);
		
		String contents1[][] = {};
		String header1[] = {"이름", "성별", "나이", "학번", "전화번호", "학년", "학점"};

		DefaultTableModel model1= new DefaultTableModel(contents1,header1);
		table_3=new JTable(model1);
		scrollPane.setViewportView(table_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("조회", null, panel_4, null);
		panel_4.setLayout(null);
		
		Panel panel_13 = new Panel();
		panel_13.setLayout(null);
		panel_13.setBounds(10, 10, 219, 89);
		panel_4.add(panel_13);
		
		JLabel label = new JLabel("\uD559\uC0DD\uC758 \uC774\uB984\uC744 \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		label.setBounds(12, 10, 195, 15);
		panel_13.add(label);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 35, 116, 21);
		panel_13.add(textField_3);
		
		JButton button = new JButton("\uC785\uB825");
		
		button.setBounds(134, 35, 62, 23);
		panel_13.add(button);
		
		Panel panel_14 = new Panel();
		panel_14.setLayout(null);
		panel_14.setBounds(235, 10, 228, 89);
		panel_4.add(panel_14);
		
		JLabel label_1 = new JLabel("\uD559\uC0DD\uC758 \uD559\uBC88\uC744 \uC785\uB825\uD558\uC2ED\uC2DC\uC624.");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(12, 10, 204, 15);
		panel_14.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 35, 116, 21);
		panel_14.add(textField_4);
		
		JButton button_1 = new JButton("\uC785\uB825");
		
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(10, 105, 453, 148);
		panel_4.add(panel_15);
		panel_15.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 453, 148);
		panel_15.add(scrollPane_1);
		

		String contents[][] = {};
		String header[] = {"이름", "성별", "나이", "학번", "전화번호", "학년", "학점"};

		DefaultTableModel model= new DefaultTableModel(contents,header);
		table_4=new JTable(model);
		scrollPane_1.setViewportView(table_4);

		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Info revise_info=new Info();
				revise_info.id=Integer.parseInt(textField_4.getText().toString()); // 학번
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
				model.setNumRows(0);
				model.addRow(input);
			}
		});
		button_1.setBounds(140, 35, 65, 23);
		panel_14.add(button_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane.addTab("전체 출력", null, panel_5, null);
		
		Panel panel_16 = new Panel();
		panel_16.setBounds(10, 10, 493, 190);
		panel_5.add(panel_16);
		panel_16.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_16.add(scrollPane_2);
		
		
		
		
		
		JButton button_2 = new JButton("\uCD9C\uB825");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String line=new String();
					try{
						DefaultTableModel model2= new DefaultTableModel(contents,header);
						table=new JTable(model2);
					    table.setAutoCreateRowSorter(true);
					    TableRowSorter sorter1 = new TableRowSorter(table.getModel());
					    table.setRowSorter(sorter1);
						scrollPane_2.setViewportView(table);
						Scanner sc=new Scanner(in);
						while(sc.hasNextLine()){
							
							line = sc.nextLine();	
							String get[]=new String[7];
							get=line.split("\t");
							
							
							model2.addRow(get);
						}
						sc.close();
					}
					catch(FileNotFoundException k){
					}
			}
		});
		button_2.setBounds(404, 206, 97, 34);
		panel_5.add(button_2);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				inputinfo.id=Integer.parseInt(textField.getText());
				Node p=new Node();
				p=Id_root.find(inputinfo);
				
							textField_12.setText(p.getInfo().name);
							textField_13.setText(p.getInfo().sex);
							textField_14.setText(Integer.toString(p.getInfo().age));
							textField_15.setText(Integer.toString(p.getInfo().id));
							textField_16.setText(p.getInfo().phonenumber);
							textField_17.setText(Integer.toString(p.getInfo().grade));
							textField_18.setText(Double.toString(p.getInfo().score));
					
			}
		});
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Info revise_info=new Info();
				revise_info.name=textField_3.getText(); // 학번
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
				model.setNumRows(0);
				model.addRow(input);
			}
		});
		
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Info revise_info=new Info();
				revise_info.name=textField_1.getText(); // 학번
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
				model1.setNumRows(0);
				model1.addRow(input);
			}
		});
		
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Info delete_info=new Info();
				delete_info.id=Integer.parseInt(textField_2.getText()); // 학번
				Node p=new Node();
				p=Id_root.find(delete_info);
				Id_root.delete(delete_info);
				Name_root.delete(p.getInfo());
				model1.setNumRows(0);
				try{

					FileWriter w= new FileWriter(out);
					Id_root.save(Id_root.root, w);
					w.close();
				}
				catch(IOException z){
				}
			}
		});

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}