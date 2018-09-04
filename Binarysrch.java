import java.util.Scanner;

public class Binarysrch { 
	static int srch(int a[],int first,int key,int last) {
		int mid;
		//mid=(last+first)/2;
		if(last>=first) {
			//mid=first+(last-first)/2;
			mid=(last+first)/2;
			if(a[mid]==key) {
				System.out.println("equals mid");
			return mid;
			}
			else if(a[mid]>key) {
				System.out.println("search first half");
				return srch(a,first,key,mid-1);
			}
			else if(a[mid]<key) {
				System.out.println("search last half");
				return srch(a,mid+1,key,last);	
				}
			
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Binarysrch  obj=new Binarysrch ();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int key=sc.nextInt();
		int  arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int result=srch(arr,0,key,size-1);
		if(result==-1) {
			System.out.println("ele not found");
			
		}
		else {
			System.out.println("ele found at index "+result);
			
		}
	
	}

}
