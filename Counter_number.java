import java.util.Scanner;

public class Counter_number {
	int sump = 0;
	int cntp = 0, cntN = 0, cntz = 0;
	void Checking_num(int n) {
		
		if (n > 0) {
			cntp++;
			sump += n;
			}
		else if(n<0) {
			cntN--;	
		}
		else if(n==0) {
			cntz++;
		}
		else {
			System.out.println("INVALID");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Counter_number counter = new Counter_number();
		int cnt=0;
		do {
			
	  int num=sc.nextInt();
	  cnt++;
	  counter.Checking_num(num);
	
		}while(cnt<10);
		System.out.println("sum of positiveNos:"+counter.sump);
		System.out.println("no of +ve nos:"+counter.cntp);
		System.out.println("no of -ve nos:"+counter.cntN);
		
		System.out.println("no of 0 nos:"+counter.cntz);

	}
	

}
