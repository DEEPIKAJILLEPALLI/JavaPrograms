import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		int m[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		int i,j,k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month");
		int mnth=sc.nextInt();
		System.out.println("Enter Day");
		int dayofMnth=sc.nextInt();
	
		String day[]= {"mon", "tue", "wed" ,"thur" ,"fri" ,"sat"," sun"};
		j=dayofMnth;
		
		for(i=0;i<7;i++)
		{
			System.out.print(day[i]+"\t");
		}
		System.out.println();
		while(dayofMnth>0)
			
		{
		System.out.print("\t");
		dayofMnth--;
	}
		for(i=1;i<=m[mnth];i++) {
			
			if((j+i)%7!=0) {
				
					System.out.print(i+"\t ");
			
				
			}
			else {
		
			
			System.out.print(i+"\t\n");
			
		
		}
		}
	}
		

}

