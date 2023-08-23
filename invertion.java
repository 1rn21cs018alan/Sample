import java.util.Scanner;

public class invertion {
	public static void main(String[] args) {
		int n=4,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		n=sc.nextInt();
		System.out.println("Enter elements");
		int [] arr=new int [n],val=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			val[i]=0;
		}
//		for(int i=n-2;i>=0;i--)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					count+=val[j];
//					val[i]=1+val[j];
//				}
//			}
//		}
//		for(int i=0;i<n-1;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[i]>arr[j])
//					count++;
//			}
//		}
		
		System.out.println("Invertions="+count);
	}
}
