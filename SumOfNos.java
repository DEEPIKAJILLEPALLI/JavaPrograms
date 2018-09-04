import java.util.Scanner;

public class SumOfNos {
	
static int  Sumeven(int n) {
	int  sum=0;
	
	sum =sum+n;
	return(sum);
	
}
static int  Sumodd(int n) {
	int  sum=0;
	// System.out.println("even nos are"+n);
	sum =sum+n;
	return(sum);
	
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cnt=10,i=0,n;
		int a[]=new int[10];
		for(i=0;i<10;i++) {
			 a[i]=sc.nextInt();
			  
		}
		 //System.out.println("even nos are");
		for(i=0;i<10;i++)
			System.out.println("even nos are");
			 if(a[i]%2==0) {
				 System.out.println(a[i]+"is even");
				 Sumeven(i);
				  
			 }
		/*	 else {
				 System.out.println("o nos are"+i);
				 Sumodd(i);
			 }
		}*/
		
			
		

	}

}
