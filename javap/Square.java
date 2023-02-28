package thread;

public class Square extends Thread{
	public IntClass Num;
	public Square(IntClass Num)
	{
		this.Num=Num;
	}
	public void run()
	{
		while(true)
		{
			System.out.println("Square:"+(Num.num*Num.num));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
