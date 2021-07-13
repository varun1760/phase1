package lab6.exception.app;

public class Demo1 {

	public static void main(String[] args) {
		int []arr = new int[3];
		
		try {
			arr[5] = 15;
			System.out.println("The value : " + arr[3]);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
//			System.out.println(ae.toString());
			ae.printStackTrace();
		}
	}

}
