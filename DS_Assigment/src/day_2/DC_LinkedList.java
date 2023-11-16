package day_2;
import java.util.Scanner;
class Node10
{
    int data;
    Node10 prev,next;
    Node10(int data)
    {
        this.data=data;
        prev=next=null;
    }
}
public class DC_LinkedList {
	Node10 root,last;
    void createList()
    {
        root=last=null;
    }
    
    void insertLeft(int e)
    {
       Node10 n=new Node10(e);
       if(root==null){
    	   root=last=n;
           last.next=root;
           root.prev=last;
    }
       else
       {
        n.next=root;
        root=n;
        last.next=root;
        root.prev=last;
       }
    }
    void deleteLeft()
    {
       if(root==null)
           System.out.println("Empty List");
       else
       {
        
        Node10 t=root;
        if(root==last) 
           root=last=null;
        else {
        	root=root.next;
			last.next=root;
			root.prev=last;
             }
        System.out.println("Deleted:"+t.data);   
       }
    }
    
    void insertRight(int e)
    {
       Node10 n=new Node10(e);
       if(root==null)
           root=last=n;
       else
       {
        Node10 t=root;
        last.next=n;
		last=n;
		last.next=root;
		root.prev=last;
       
       }
    }
    void deleteRight()
    {
       if(root==null)
           System.out.println("Empty List");
       else
       {
        Node10 t=root;
        Node10 t2=t;
        while(t!=last) {
			t2=t;
			t=t.next;
		}
		if(t==root) {
			root=last=null;
		}
		else {
			last=t2;
			last.next=root;
			root.prev=last;
		}
		System.out.println("Deleted: "+t.data);
	}
    }
    
    void printList()
    {
       if(root==null)
           System.out.println("Empty List");
       else
       {
           Node10 t=root;
           do {
				System.out.print("|"+t.data+"|-->");
				t=t.next;
			}while(t!=root);
       }
    }
    
    public static void main(String[] args) {
    	DC_LinkedList obj = new DC_LinkedList();
		Scanner sc=new Scanner(System.in);
		int choice;
		obj.createList();
		do {
			int e;
			System.out.println("\n1. Insert Left\n2. Insert Right\n3. Delete Left\n4. Delete Right\n5.Print");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
					System.out.println("Enter Element");
					e = sc.nextInt();
					obj.insertLeft(e);
				break;
			case 2:
				System.out.println("Enter Element");
				e = sc.nextInt();
				obj.insertRight(e);
			break;
			case 3:
				obj.deleteLeft();
				break;
			case 4:
				obj.deleteRight();
			break;
			case 5:
				obj.printList();
				break;
			
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}while(choice!=0);
	}
    

}
