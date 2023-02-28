package thread;
import java.util.Random;
//for using getting time in milliseconds to get a random digit

public class GenerateInt extends Thread
{
	public IntClass Num;
	public GenerateInt(IntClass Num)
	{
		this.Num=Num;
	}
	public void run()
	{
		Random rand=new Random();
		
		int i=0;
		for(i=0;i<1000;i++)
		{
			Num.num=rand.nextInt(100);
			//for using getting time in milliseconds to get a random digit
			System.out.println("\n\nNumber:"+Num.num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
