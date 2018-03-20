import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {   // 자바 BST 테스트 클래스
		BST_NAME name_root=new BST_NAME();
		BST_ID Id_root=new BST_ID();
		File out=new File("a2.txt");
		
		
		String get[]=new String[7];
		File in=new File("a.txt");
		try{
			Scanner sc=new Scanner(in);
			while(sc.hasNextLine()){
				Info inputinfo=new Info();
				String line = sc.nextLine();	
				get=line.split("\t");
				inputinfo.name=get[0];
				inputinfo.sex=get[1];
				inputinfo.age=Integer.parseInt(get[2]);
				inputinfo.id=Integer.parseInt(get[3]);
				inputinfo.phonenumber=get[4];
				inputinfo.grade=Integer.parseInt(get[5]);
				inputinfo.score=Double.parseDouble(get[6]);
				Id_root.insert(inputinfo);
				name_root.insert(inputinfo);
				
			}
			sc.close();
		}
		catch(FileNotFoundException e){
		}
	
		
		Info info=new Info("심성진","남자",23,20127618,"01054013540",3,4.5);
		Info info1=new Info("홍길동","남자",23,20130715,"01054013540",3,4.5);
		Info info2=new Info("김씨","남자",23,20130715,"01054013540",3,4.5);
		
		//Id_root.insert(info);
		//name_root.insert(info);
		Node p=new Node();
		p=Id_root.find(info);


		try{

			FileWriter w= new FileWriter(out);
			Id_root.save(Id_root.root, w);
			w.close();
		}
		catch(IOException e){
		}


		//Student Framestart=new Student();
		//Framestart.setVisible(true);
	}
}

