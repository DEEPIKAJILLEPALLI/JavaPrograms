import java.util.Scanner;

public class UniqueElements {
	void rmvDup(int a[],int s) {
		int i,j;
		for( i=0;i<s;i++) {
			for(j=0;j<i;j++) {
				if(a[i]==a[j] ){
					break;
				}
			}
				if(i==j) {
					System.out.println(a[i]);
					}
				}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		UniqueElements obj=new UniqueElements();
		obj.rmvDup(arr,size);

	}

}
