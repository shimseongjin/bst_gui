import java.awt.TextArea;
import java.io.FileWriter;
import java.io.IOException;

public class BST_NAME {
    public Node root;
    public BST_NAME(){
        this.root = null;
    }
    //Ž�� ����
    public Node find(Info info){
        Node current = root;
        while(current!=null){
            //���� ���� ã�� ���� ������
            if(current.getInfo().name.equals(info.name)){
                break;
                //ã�� ���� ���� ��庸�� ������
            }            
            else
            {
            	int i=current.getInfo().name.compareTo(info.name);
            	
            	if(i>0){
            		current = current.getLeft();
            	}
            	else{
            		current = current.getRight();
            	}
            }
        }
        return current;
    }
    
    public void insert(Info info){
        Node newNode = new Node(info);
        if(root==null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        
        while(current!=null){
            parent = current;
            
            int i=current.getInfo().name.compareTo(info.name);
            if(i>0){
            	
                current = current.getLeft();
                if(current==null){
                    parent.setLeft(newNode);
                    return;
                }
            }else{
                current = current.getRight();
                if(current==null){
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }
    //���� ����
    public boolean delete(Info info){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while((!current.getInfo().name.equals(info.name))){
            parent = current;
            int i=current.getInfo().name.compareTo(info.name);
            if(i>0){
                isLeftChild = true;
                current = current.getLeft();
            }else{
                isLeftChild = false;
                current = current.getRight();
            }
            if(current==null){
                return false;
            }
        }
        //Case 1: �ڽĳ�尡 ���� ���
        if(current.getLeft()==null && current.getRight()==null){
            if(current==root){
                root = null;
            }
            if(isLeftChild==true){
                parent.setLeft(null);
            }else{
                parent.setRight(null);
            }
        }
      //Case 2 : �ϳ��� �ڽ��� ���� ���
        else if(current.getRight()==null){
            if(current==root){
                root = current.getLeft();
            }else if(isLeftChild){
                parent.setLeft(current.getLeft());
            }else{
                parent.setRight(current.getLeft());
            }
        } else if(current.getLeft()==null){
            if(current==root){
                root = current.getRight();
            }else if(isLeftChild){
                parent.setLeft(current.getRight());
            }else{
                parent.setRight(current.getRight());
            }
        }
        //Case 3 : �ΰ��� �ڽ��� ���� ���
        else if(current.getLeft()!=null && current.getRight()!=null){
            // ������ ����Ʈ���� �ּҰ��� ã��
            Node successor = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild){
                parent.setLeft(successor);
            }else{
                parent.setRight(successor);
            }            
            successor.setLeft(current.getLeft());
        }        
        return true;        
    }
 
    public Node getSuccessor(Node deleleNode){
        Node successsor =null;
        Node successsorParent =null;
        Node current = deleleNode.getRight();
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.getLeft();
        }
        if(successsor!=deleleNode.getRight()){
            successsorParent.setLeft(successsor.getRight());
            successsor.setRight(deleleNode.getRight());
        }
        return successsor;
    }

    public void save(Node p, FileWriter w)
    {
    	if(p != null)
    	{
    		save(p.getLeft(),w);
    		
    		try{

    			String line=new String();
    			line+=p.getInfo().name;
    			line+="\t";
    			line+=p.getInfo().sex;
    			line+="\t";
    			line+=Integer.toString(p.getInfo().age);
    			line+="\t";
    			line+=Integer.toString(p.getInfo().id);
    			line+="\t";
    			line+=p.getInfo().phonenumber;
    			line+="\t";
    			line+=Integer.toString(p.getInfo().grade);
    			line+="\t";
    			line+=Double.toString(p.getInfo().score);
    			line+="\r\n";
    			w.write(line);
    			
    		}
    		catch(IOException e){
    		}
    		save(p.getRight(),w);
    	}
    }
}
