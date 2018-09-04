import java.util.Scanner;

public class Opertor_perform {
	
	int Operation(int n1,int n2,char c) {
		switch(c) {
		case '+':System.out.println("Addition:");
					return(n1+n2);
		case '-':System.out.println("subtraction:");
		return(n1-n2);	
		case '*':System.out.println("mutliplication:");
		return(n1*n2);
		case '/':System.out.println("division:");
		return(n1/n2);
		case '%':System.out.println("Addition:");
		return(n1%n2);
		default:System.out.println("invalid operator");
		return 0;
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Opertor_perform  obj=new Opertor_perform ();
 Scanner sc =new Scanner(System.in);
 int num1=sc.nextInt();
 int num2=sc.nextInt();
 char operator=sc.next().charAt(0);
 try {
 int result=obj.Operation(num1,num2,operator);
 System.out.println(result);
 }
 catch(Exception e)
 {
	 System.out.println(e);
 }
 
	}

}
