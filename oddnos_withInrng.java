import java.util.Scanner;

public class oddnos_withInrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		do {
			if(num1%2!=0) {
				System.out.print(num1+" ");
				
			}
			num1++;
		}while(num1<=num2);
	}

}
