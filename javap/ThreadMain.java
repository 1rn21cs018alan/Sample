package thread;

public class ThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntClass A= new IntClass();
		
		GenerateInt G=new GenerateInt(A);
		Square S = new Square(A);
		Cube C = new Cube(A);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		G.start();
		S.start();
		C.start();
	}

}
