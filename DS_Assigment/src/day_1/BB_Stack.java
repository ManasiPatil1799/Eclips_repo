package day_1;

import java.util.Scanner;

public class BB_Stack {
	  int tos,Maxsize;
	  char Stack[];
	  
	void createStack(){
		Stack=new char[10];
	
		tos=-1;
	}
	void push(char e) {
		tos++;
		Stack[tos]=e;
	}
	
	boolean is_Full() {
		if(tos==Maxsize-1)
			return true;
		else
			return false;
	}
	char pop() {
		char temp=Stack[tos];
		tos--;
		return(temp);
	}
	boolean is_Empty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
	int peek() {
		return (Stack[tos]);
	}
	void printStack() {
		for(int i=tos;i>=0;i--)
			System.out.print(Stack[i]);
	}
	public boolean checkBracket(String str) {
		char[] Arr=str.toCharArray();
		char ch;
		for(int i=0;i<Arr.length;i++) {
			ch=Arr[i];
			if(ch=='('||ch=='{'||ch=='[') {
				push(ch);	
			}
			else if(ch==')'&& peek()=='(' ||ch=='}'&& peek()=='{'||ch==']'&& peek()=='[') {
				pop();
			}					
		}
		return (is_Empty());	
	}
	public static void main(String[] args) 
	{
		String str=new String();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your bracket :");
		str=sc.nextLine();
		
		BB_Stack obj=new BB_Stack();
		obj.createStack();
		obj.checkBracket(str);
		boolean flag=obj.checkBracket(str);
		if ( flag){
			System.out.println("All brackets are well-formed");
		}
		else
			System.out.println("There are unmatched opening brackets");
	}
	
	
}