import java.util.*;
public class param {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr line");
		String exp=sc.nextLine();
		Stack <Character>  S=new Stack<Character>();
		char arr[]=exp.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='(')
				S.push('(');
			else if(arr[i]==')')
			{
				if(S.isEmpty())
					S.push(')');
				else
				{
					if(S.peek()=='(')
						S.pop();
					else
						S.push(')');
				}
			}	
		}
		int right=0,left=0;
		while(!S.isEmpty())
		{
			if(S.pop()==')')
				right++;
			else
				left++;
		}
		System.out.println("(="+right);
		System.out.println(")="+left);
	}
}
