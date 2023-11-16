package day_1;

import java.util.Scanner;
public class Reversestring_Stack {

	  int tos,Maxsize;
	  char Stack[];
	void createStack(int size) {
		Stack=new char[size];
		Maxsize=size;
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
	
	
	public static void main(String[] args) {
		
		Reversestring_Stack obj=new Reversestring_Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		obj.createStack(str.length());
		char arr[]=str.toCharArray();
		for(int i=0;i<=obj.Maxsize-1;i++) {
			obj.push(arr[i]);
		}
		System.out.println("reversed String is:");
		for(int i=0;i<=obj.Maxsize-1;i++) {
			System.out.print(obj.pop());
		}
		}
}
