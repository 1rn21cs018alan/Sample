package JOC;
import java.util.*;
public class Day4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of items:");
		int n=sc.nextInt();
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			int t=sc.nextInt();
			if(t>0)
				minHeap.add(t);
		}		
		int count=0;
		while(!minHeap.isEmpty()) {
			count++;
			int t=minHeap.poll();
			if(t!=count)
			{
				System.out.println(count+" is missing");
				break;
			}
		}
	}
}
