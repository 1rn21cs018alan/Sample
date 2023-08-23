import java.util.Scanner;

public class Sanvi {
	private static double[][] coins;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		int purchase=sc.nextInt();
		if(purchase>100 || purchase<=0) {
			System.out.println("invalid value");
			return;
		}
		System.out.println("Enter the amount given:");
		int paid=sc.nextInt();
		if(paid<purchase || paid<=0) {
			System.out.println("invalid value");
			return;
		}
		coins=new double[][] {
			{0.5,6},
			{1,5},
			{5,10},
			{10,10},
			{20,10},
			{50,10}
			};
		int change=paid-purchase,ch;
		while(true)
		{
			System.out.println("1 for more coins, 0 for less coins");
			ch=sc.nextInt();
			if(ch==1)
			{
				moreCoin(change);
			}
			else if (ch==0)
			{
				lessCoin(change);
			}
			else{
				System.out.println("Invalid Input");
				continue;
			}
			break;
		}
	}
	private static int max(int a,int b)
	{
		if(a>b)
			return a;
		return b;
	}
	private static int min(int a,int b)
	{
		if(a<b)
			return a;
		return b;
	}
	private static void lessCoin(int change) {
		// TODO Auto-generated method stub
		
	}
	private static void moreCoin(int change) {
		// TODO Auto-generated method stub
		float u=change;
		double [] table= new double[51];
		int k=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<coins[i][1];j++) {
				table[k++]=coins[i][0];
			}
		}
		for(int i=0;i<51;i++)
			System.out.println(table[i]);
		int [][]Knap=new int[52][change+1];
		for(int j=0;j<52;j++) {
			Knap[j][0]=0;
		}
		for(int i=1;i<=change;i++)
		{
			if(i<4)
				Knap[6][i]=2*i;
			else
				Knap[6][i]=Knap[6][i-1];
		}
		
		for(int i=7;i<52;i++) {
			for(int j=1;j<=change;j++) {
				if(j<table[i-1])
					Knap[i][j]=Knap[i-1][j];
				else if(Knap[i-1][j-((int)table[i-1])]+1>Knap[i-1][j]) {
					Knap[i][j]=Knap[i-1][j-((int)table[i-1])]+1;
				}
				else
					Knap[i][j]=max(Knap[i-1][j],Knap[i][j-1]);
			}
		}
		System.out.println("Output:");
		for(int i=0;i<52;i++)
		{
			for(int j=0;j<=change;j++) {
				System.out.print(Knap[i][j]+",");
			}
			System.out.println();
		}
		
	}
}
