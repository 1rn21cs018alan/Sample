package thread;

public class Cube extends Thread{
	public IntClass Num;
	public Cube(IntClass Num)
	{
		this.Num=Num;
	}
	public void run()
	{
		while(true)
		{
			System.out.println("Cube:"+(Num.num*Num.num*Num.num));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
