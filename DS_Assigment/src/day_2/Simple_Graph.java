package day_2;
import java.util.Scanner;
public class Simple_Graph {
	int g[][],vNodes,vlist[];//vNodes-no of nodes  vlist no of visited list vlist:1 visited vlist:0 unvisited


	void createGraph(int v) {
		vNodes=v;
		Scanner sc=new Scanner(System.in);
		g=new int[vNodes][vNodes];
		vlist=new int[vNodes];
		for(int src=0;src<vNodes;src++) {
			for(int dest =0;dest<vNodes;dest++) {
				System.out.println("enter cost for V"+src+"to V"+dest+":");
				g[src][dest]=sc.nextInt();
			}
		}
	}
	void resetVlist() {
		for(int i=0;i<vNodes;i++)
			vlist[i]=0;
	}
	void DFS(int source) {

		vlist[source]=1;
		System.out.println(source);
		for(int i=0;i<vNodes;i++) {
			if(g[source][i]==1 && vlist[i]==0)
				//  neighbore         unvisited
			{
				vlist[i]=1;
				DFS(i);
			}
		}
	}
	void BFS(int source) {
		int q[]=new int [vNodes];
		int front=0,rear=-1;
		vlist[source]=1;
		q[++rear]=source;//enqueue
		while(front<=rear) {//not empty
			int element =q[front++];
			System.out.println("V"+element+"-");
			for(int i=0;i<vNodes;i++) {
				if(g[source][i]==1 && vlist[i]==0) {
					vlist[i]=1;//marked
					q[++rear]=1;//enqueue
				}
			}
		}   
	}
	void printG() {
		for(int src=0;src<vNodes;src++) {
			for(int dest =0;dest<vNodes;dest++) {
				System.out.println("enter cost for V"+src+"to V"+dest+":");

			}
			System.out.println();
		}
	}
	public static void main() {
		Simple_Graph obj=new Simple_Graph();
		obj.createGraph(3);
		obj.printG();
		obj.DFS(0);
		obj.BFS(0);

	}
}
