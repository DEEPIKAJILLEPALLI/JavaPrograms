/*	*
               **
             ***

*/
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k=1;
System.out.println("Enter no to draw pattern");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

do {
	for(i=0;i<n;i++) {
		System.out.print(" ");
	}
		for(j=1;j<=k;j++) {
			System.out.print("*");
		}
		k++;
		n--;
		
	System.out.println();
}while(n!=0);
	}

}
