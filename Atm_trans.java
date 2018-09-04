import java.util.Scanner;

public class Atm_trans {

	void display() {
		System.out.println("choose your option");
	}
	int pin_no=5745,cnt=1;;
	void validation(Scanner sc, int p) {
		int count = 1;
	
			do {
				count++;
				if(pin_no==p) {
					display();
					return;
				}
				System.out.println("Enter pin again");
				p = sc.nextInt();
			}while(count<3);
		
		System.out.println("Account locked");
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("welcome to ICICI BANK");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		
		
		Atm_trans obj=new Atm_trans();
		
		obj.validation(sc, pin);
		
		
				

	}

}
