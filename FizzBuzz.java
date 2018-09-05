import java.util.Scanner;

public class FizzBuzz {

	void fizzBuzz(int num1,int num2) {
		int i;
		for(i=num1;i<=num2;i++) {
			if(i%15==0) {
				System.out.println("fizzbuzz");
			}
			else if(i%3==0) {
			 
					System.out.println("fizz");
			}
			else if(i%5==0) {
				 
				System.out.println("buzz");
		}
			else {
				System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		FizzBuzz obj=new FizzBuzz();
		obj.fizzBuzz(n1, n2);
	}

}
