import java.io.*;

public class TestingFactorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the number:");
		int num;
		BufferedReader inputreader = new BufferedReader(new InputStreamReader(System.in));
		try {
		num = Integer.parseInt(inputreader.readLine());
		
		if(num>0) {
		int result = factorial(num);
		System.out.println("Result is:" + result);
		}
		else {
			System.out.println("should be positive integer");
		}
			
		}
	catch(NumberFormatException e) {
		System.out.println("should be integer");
	}
		
	}

	static int factorial(int num) {
	
		if(num==0||num==1) {
			return 1;
		}
		else {
			return(num*factorial(num-1));
		}
	
		
	}
}
