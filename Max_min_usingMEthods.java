import java.util.Scanner;

public class Max_min_usingMEthods {
	
int max(int no1,int no2,int no3) {
	int max=no1;
	if(no2>max) {
		max=no2;
	}
	if(no3>max) {
		max=no3;
	}
	return(max);
}
int min(int no1,int no2,int no3) {
	int min=no1;
	if(no2<min) {
		
		min=no2;
	}
	if(no3<min) {
		min=no3;
	}
	return(min);
}
	public static void main(String[] args) {
		int num1,num2,num3;
		// TODO Auto-generated method stub
		Max_min_usingMEthods obj=new Max_min_usingMEthods();	
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
int max=obj.max(num1,num2,num3);
int min=obj.min(num1,num2,num3);
System.out.println("max:"+max+"min:"+min);
	}

}
